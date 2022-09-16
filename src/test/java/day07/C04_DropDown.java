package day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C04_DropDown {

    WebDriver driver;
    Select select;
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/dropdown");

    }
    @After
    public void tearDown() {
        //driver.close();

    }

    @Test
    public void test01 () {
        /*
   1- Bir class oluşturun: DropDown
   2- https://the-internet.herokuapp.com/dropdown adresine gidin.
   3- Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
   4- Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
   5- Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
   6- Tüm dropdown değerleri(value) yazdırın
   7- Dropdown’un boyutunu bulun, Dropdown’da 4 öğe varsa konsolda True , degilse False yazdırın.
     */


    }
}
