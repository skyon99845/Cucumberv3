package Locators;
//import Listerns.Listeners;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.List;

public class NewTechniques {
    public static ExtentSparkReporter spark = new ExtentSparkReporter("ReportFile/TestIndex.html");
    ExtentReports extent = new ExtentReports();

    @Test(description = "Static DropDown")
    public void staticDropdown() throws InterruptedException {
        String link = "https://rahulshettyacademy.com/dropdownsPractise/";

        //ExtentSparkReporter spark = new ExtentSparkReporter("ReportFile/TestIndex.html");
        // extent = new ExtentReports();
        extent.attachReporter(spark);
        Thread.sleep(5000);
        spark.config().setDocumentTitle("Shubham Test");
        extent.createTest("Static Dropdown");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(link);
        WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        staticDropDown.click();
        extent.createTest("Clicked the Static Drop Down");
        System.out.println("Clicked the DropDown Button");

        Thread.sleep(3000);
        //Select the DropDown
        Select dropDownButton = new Select(staticDropDown);
         dropDownButton.selectByIndex(0);
        Thread.sleep(5000);
        System.out.println("level 0"+dropDownButton.getFirstSelectedOption().getText());
         dropDownButton.selectByIndex(1);
        System.out.println("level 1"+dropDownButton.getFirstSelectedOption().getText());
         dropDownButton.selectByIndex(3);
        staticDropDown.click();
         Thread.sleep(3000);
         Thread.sleep(5000);
        System.out.println("level 2"+dropDownButton.getFirstSelectedOption().getText());




        System.out.println("Quit Browser");
        driver.quit();

    }


    @Test(description = "UI Drop Down")
    public void UI() throws InterruptedException {
        String link = "https://rahulshettyacademy.com/dropdownsPractise/";

        //ExtentSparkReporter spark = new ExtentSparkReporter("ReportFile/TestIndex.html");

        extent.attachReporter(spark);
        Thread.sleep(5000);
        spark.config().setDocumentTitle("Shubham Test");
        extent.createTest("Static Dropdown UI");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(link);
        driver.manage().window().maximize();
        WebElement ui = driver.findElement(By.id("divpaxinfo"));

        ui.click();
        Thread.sleep(2000);
        //driver.findElement(By.id("hrefIncAdt")).click();
        WebElement adultAdd = driver.findElement(By.id("hrefIncAdt"));
        System.out.println("Making the Adult 6");
        for(int i=0;i<5;i++)
        {
            adultAdd.click();
        }
        System.out.println("Making Child 1 ");
        Thread.sleep(2000);
        driver.findElement(By.id("hrefIncChd")).click();

        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println("Getting the Number of Adult Entered  by the user"+ui.getText());



        Thread.sleep(3000);



        extent.flush();
        System.out.println("Quit Browser");
        driver.quit();
    }

    @Test(description = "Flight Selecting From and To Destination")
    public void From() throws InterruptedException {
        String link = "https://rahulshettyacademy.com/dropdownsPractise/";

        //ExtentSparkReporter spark = new ExtentSparkReporter("ReportFile/TestIndex.html");

        extent.attachReporter(spark);
        Thread.sleep(5000);

        extent.createTest("To and From Drop Box");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(link);

        WebElement from = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
        from.click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Gorakhpur (GOP)")).click();
        Thread.sleep(4000);
        WebElement to = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
        to.click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Delhi (DEL)")).click();
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void AutoSuggestive() throws InterruptedException {
        String link = "https://rahulshettyacademy.com/dropdownsPractise/";

        //ExtentSparkReporter spark = new ExtentSparkReporter("ReportFile/TestIndex.html");

        extent.attachReporter(spark);

        extent.createTest("Auto Suggestive");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(link);
        Thread.sleep(2000);
        driver.findElement(By.id("autosuggest")).sendKeys("Ind");
        Thread.sleep(5000);
        //creating the List
        List<WebElement> options = driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a"));
        for(WebElement option: options)
        {
            if(option.getText().equalsIgnoreCase("India"))
            {
                System.out.println(option);
//                option.click();
//                Thread.sleep(2000);
                break;
            }
        }

        WebElement midLink = driver.findElement(By.xpath("//td[@class=\"monthTitle\"]"));
        //midLink.click();
        Thread.sleep(3000);


        WebElement previousLink = driver.findElement(By.className("prev"));
        //previousLink.click();
        Thread.sleep(3000);

        LocalDate date = LocalDate.now();
        String dd = date.toString();
        System.out.println("The date is :"+dd);
        driver.findElement(By.xpath("//td[normalize-space()='14']")).click();
        Thread.sleep(6000);

        Thread.sleep(2000);
        driver.quit();
    }

    @Test(description = "Handling the CheckBox")
    public void HandlingCheckBox() throws InterruptedException {
        String link = "https://www.spicejet.com/";

        //ExtentSparkReporter spark = new ExtentSparkReporter("ReportFile/TestIndex.html");

        extent.attachReporter(spark);

        extent.createTest("Handling Check Box");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(link);

        Thread.sleep(2000);
//        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
//        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
//        Thread.sleep(2000);
//        System.out.println("Clicked the Check Box");
        //driver.switchTo().alert().dismiss();
        List<WebElement> ele = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-m611by']//*[name()='svg']"));
        System.out.println("The number is :"+ele.size());
        Thread.sleep(5000);

        System.out.println("Checkout");
        driver.quit();
    }

}
