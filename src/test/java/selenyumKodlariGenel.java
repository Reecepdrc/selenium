import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenyumKodlariGenel {
    public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
     //driver.get("https://www.deu.edu.tr/");// sayfaya gitme //driver.navigate().to(https....);
     //System.out.println(driver.getTitle());// sayfa başlıgı getirme
     //System.out.println(driver.getCurrentUrl());// linkini getirme
     //System.out.println(driver.getPageSource());// kaynak kodları getirme
     //driver.manage().window().maximize();//sayfayı maksimum yap
     //  driver.navigate().to("https://amazon.com");//git
     //driver.navigate().back();//geri gel
     //Thread.sleep(3000);// 3 saniye bekle
     //driver.navigate().forward();//bir daha gel
     //driver.navigate().refresh();//sayfa yenile
     //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// ...saniye bekle sonrası arıza
     //driver.manage().window().getPosition();// konumunu verir
     //driver.manage().window().getSize();// Ölçülerini verir
     //driver.manage().window().setPosition(new Point(20,20));// konumu ayarla
     //driver.manage().window().setSize(new Dimension(600,300));//boyut ayarla
     ////driver.manage().window().minimize();//simge durumuna getirme
     ////-------------------------------------------------
     //// bir şeyi bulmak için 1-ID, 2-NAME, 3-CLASSNAME, 4-TAGNANE, 5-LİNKTEXT, 6-partialLinkText, 7-xPath 8-cssSelector
     //driver.getPageSource();//kelime aratma
     //String istenenKelime="Recep";
     //if (driver.getPageSource().contains(istenenKelime)){
     //    System.out.println("Pagesearc testi PASSED");
     //}else  System.out.println("Pagesearc testi FAIED");
     //driver.getWindowHandle();//Handle degerleri verir
     ////---------------------------------------------------
     ////Başlığın "Amazon" içerdiğini test ediniz
     //String actualTitle=driver.getTitle();
     //String istenenKelime2="Amazon";
     //if (actualTitle.contains(istenenKelime2)){
     //    System.out.println("Title testi PASSED");
     //}else System.out.println("Title testi FAIL");
//3- Url'nin amazon içerdiğini test ediniz
      // String actualUrl=driver.getCurrentUrl();
      // String istenenUrl="amazon.com";
      // if (actualUrl.contains(istenenUrl)){
      //     System.out.println("Url testi PASSED");
      // }else System.out.println("Url testi FAIL");
//-----------------------------------------------------
   //   WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
   //   aramaKutusu.sendKeys("Nutella"+Keys.ENTER);              //nutella aratma

   //   List<WebElement> tag= driver.findElements(By.tagName("a"));
   //   System.out.println(tag.size()); // tagların sayısını yazdırma
   //    driver.get("http://a.testaddressbook.com");
   //    WebElement signInButton=driver.findElement(By.linkText("Sign in"));
   //    signInButton.click();//düğmeye bastırma
   //    Thread.sleep(2000);
   //    WebElement emailTextbox=driver.findElement(By.id("session_email")); //emaile buton basma
   //    Thread.sleep(2000);
   //    WebElement password=driver.findElement(By.id("session_password"));//sifreye buton basma
   //    WebElement signIn=driver.findElement(By.name("commit"));//sign e buton basma
   //    emailTextbox.sendKeys("testtechproed@gmail.com");//mail gir
   //    password.sendKeys("Test1234!");//sifre gir
   //    signIn.click();//butona basma
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        // 2- Add Element butonuna basin
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();// xpath ile bulma


  // driver.close();//sayfa kapatma
   //   //driver.quit(); //tüm sayfaları kapatır
    }
}
