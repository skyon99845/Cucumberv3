package Locators;

import java.time.LocalDate;
import java.util.Calendar;

import java.util.List;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class CC {

    @Test
    public void testDAtePicker() throws Exception {

        //DAte and Time to be set in textbox

        String dateTime = "12/07/2022 2:00 PM";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.redbus.in/");

        Thread.sleep(3000);

        //button to open calendar

        WebElement selectDate = driver.findElement(By.cssSelector("input[id=\"onward_cal\"]"));

        selectDate.click();
        Thread.sleep(3000);
        //button to move next in calendar

        WebElement nextLink = driver.findElement(By.className("next"));
        nextLink.click();
        Thread.sleep(3000);

        //button to click in center of calendar header

        //WebElement midLink = driver.findElement(By.className("monthTitle"));
        WebElement midLink = driver.findElement(By.xpath("//td[@class=\"monthTitle\"]"));
        //midLink.click();
        Thread.sleep(3000);
        //button to move previous month in calendar
        System.out.println("Level1");
        WebElement previousLink = driver.findElement(By.className("prev"));
        //previousLink.click();
        Thread.sleep(3000);
        System.out.println("Level 2");
        //Split the date time to get only the date part

//        String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");

        //get the year difference between current year and year to set in calander

        //int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2]) - Calendar.getInstance().get(Calendar.YEAR);

        //midLink.click();
        System.out.println("Level 3");
        LocalDate date = LocalDate.now();
        String dd = date.toString();
        System.out.println("The date is :"+dd);
        driver.findElement(By.xpath("//td[normalize-space()='14']")).click();
        Thread.sleep(6000);

        WebElement ddate = driver.findElement(By.xpath("//input[@id=\"onward_cal\"]"));
        System.out.println("The Date "+ddate.getText());
    }

}