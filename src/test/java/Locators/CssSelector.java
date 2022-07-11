package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Listerns.Listeners.class)
public class CssSelector {

    @Test
    public void RunningSelectors  () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        Thread.sleep(2000);
        System.out.println("CssSelector");
        System.out.println("Locating the Username");
        driver.findElement(By.cssSelector("input[placeholder=\"Name\"]")).sendKeys("India");
        System.out.println("Clicking the search Button");
        driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("123489");
        System.out.println("Clicking the forget Button");
        Thread.sleep(3000);
        //driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.partialLinkText("your password?")).click();
        Thread.sleep(2000);
        //System.out.println(text);
        System.out.println("Failed");
        driver.quit();


    }
}
