package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_CssSelector {
    public static void main(String[] args) {
        /*1-C01_TekrarTesti isimli bir class olusturun  2- https://www.amazon.com/ adresine gidin  3- Browseri tam sayfa yapin
        Sayfayi “refresh” yapin
        Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        Gift Cards sekmesine basin
        Birthday butonuna basin
        Best Seller bolumunden ilk urunu tiklayin  9- Gift card details’den 25 $’i secin
        10-Urun ucretinin 25$ oldugunu test edin
        10-Sayfayi kapatin
       * /*      ÖDEV
    1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna 10 kez basinız
    3- 10 kez Add element butonuna basıldığını test ediniz
    4 - Delete butonuna görünmeyene kadar basınız
    5- Delete butonunun görünmediğini test ediniz
    6- Sayfayı kapatınız
     */
        /*
        1 ) Bir class oluşturun : Locators_css
        2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
          a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
          b. Locate email textbox
          c. Locate password textbox ve
          d. Locate signin button
          e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
             i. Username : testtechproed@gmail.com
             ii. Password : Test1234!
     */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       driver.get("http://a.testaddressbook.com/sign_in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement email=driver.findElement(By.cssSelector("#session_email"));

    }
}
