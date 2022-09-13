package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01Odev {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://amazon.com");
        System.out.println("Sayfa Basligi:"+driver.getTitle());
        String actualTitle=driver.getTitle();
        String istenenKelime="Amazon";
        if(actualTitle.contains(istenenKelime)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");
        //Sayfa adresini(url) yazdirin
        System.out.println("Sayfanın Url'i : "+driver.getCurrentUrl());
        //Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "amazon";
        if(actualUrl.contains(arananKelime)){
            System.out.println("Url Testi PASSED");
        }else System.out.println("Url Testi FAILED");
        //Sayfa handle degerini yazdirin
        System.out.println("Handle değeri : "+driver.getWindowHandle());
        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String actualPageSource = driver.getPageSource();
        String htmlArananKelime = "Gateway";
        if (actualPageSource.contains(htmlArananKelime)){
            System.out.println("Sourcecode Testi PASSED");
        }else System.out.println("Sourcecode Testi FAILED");
        //Sayfayi kapatin.
        driver.close();

    }
}
