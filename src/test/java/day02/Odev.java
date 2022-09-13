package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev {
    public static void main(String[] args) {


   //Yeni bir class olusturalim (Homework)
   //CromeDriver kullanarak, facebook sayfasina gidin ve
   System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        //sayfa basliginin (title) “facebook”oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
      // System.out.println("Sayfa Basligi:"+driver.getTitle());
      // String actualTitle=driver.getTitle();
      // String istenenKelime="Facebook";
      // if(actualTitle.contains(istenenKelime)){
      //     System.out.println("Title testi PASSED");
      // }else System.out.println("Title testi FAILED");
      // System.out.println("Sayfanın Url'i : "+driver.getCurrentUrl());
      // String actualUrl = driver.getCurrentUrl();
      // String arananKelime = "Facebook";
      // if(actualUrl.contains(arananKelime)){
      //     System.out.println("Url Testi PASSED");
      // }else System.out.println("Url Testi FAILED");
   //https://www.walmart.com/ sayfasina gidin.
        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
      driver.get("https://www.walmart.com");
      //System.out.println("Sayfanın Url'i : "+driver.getCurrentUrl());
      //String actualUrl = driver.getCurrentUrl();
      //String arananKelime = "walmart";
      //if(actualUrl.contains(arananKelime)){
      //    System.out.println("Url Testi PASSED");
      //}else System.out.println("Url Testi FAILED");

   //Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //Sayfayi yenileyin
        driver.navigate().refresh();

   //Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin
        driver.manage().window().maximize();
      //Yeni bir class olusturun (TekrarTesti)
   //Youtube web sayfasına gidin
        driver.get("https://www.youtube.com");
        // ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
   //Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
   //Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com");
   //Youtube sayfasina geri donun
        driver.navigate().back();

   //Sayfayi yenileyin
        driver.navigate().refresh();
   //Amazon sayfasina donun
        driver.navigate().forward();
   //Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
   //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
   //Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
   //URL'yi yazdırın
   //Sayfayi kapatin
   //Bir class oluşturun: LoginTest
    //Main method oluşturun ve aşağıdaki görevi tamamlayın.
    //http://a.testaddressbook.com adresine gidiniz.
    //Sign in butonuna basin
    //email textbox,password textbox, and signin button elementlerini locate ediniz..
    //Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
    //Username : testtechproed@gmail.com
    //Password : Test1234!
    //Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
    //“Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
    //Sayfada kac tane link oldugunu bulun.
    driver.close();
}}
