package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class C02_RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        // Sayfadaki Berlin WebElementini relative locator kullanarak tiklayalim
        WebElement nycwe=driver.findElement(By.id("pid3_thumb"));
        WebElement BayAreaWeb=driver.findElement(By.id("pid8_thumb"));
        WebElement BerlinWeb=driver.findElement(RelativeLocator.
                with(By.tagName("img")).below(nycwe).toLeftOf(BayAreaWeb));
    BerlinWeb.click();
    }
}
