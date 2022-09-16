package day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Assertion {
    /*
    Bir Class olusturalim YanlisEmailTesti
     1-http://automationpractice.com/index.php sayfasina gidelim
     2-Sign in butonuna basalim
     3-Email kutusuna @isareti olmayan bir mail yazip enter’a
     4-bastigimizda “Invalid email address” uyarisi ciktigini test edelim
     */

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test1() {
        // 1-http://automationpractice.com/index.php sayfasina gidelim
        driver.get("http://automationpractice.com/index.php");
        // 2-Sign in butonuna basalim
        driver.findElement(By.xpath("//*[@class='login']")).click();
        // 3-Email kutusuna @isareti olmayan bir mail yazip enter’a
        // bastigimizda “Invalid email address” uyarisi ciktigini test edelim
        WebElement emailKutusu = driver.findElement(By.xpath("//*[id='email_create']"));
        emailKutusu.sendKeys("nurullah");
        WebElement hata = driver.findElement(By.xpath("//*[text()='Invalid email address.']"));
        Assert.assertTrue(hata.isDisplayed());
    }









}
