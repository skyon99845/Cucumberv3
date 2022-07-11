package StepDefinitionRedBus;

import PageFactoryModel.RedBus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.codehaus.plexus.util.StringUtils.isNumeric;


@Listeners(Listerners.Listeners.class)
@Test
public class SearchBus {
    public static WebDriver driver;
    public static RedBus obj;
    //driver = new void ChromeDriver();
    @Given("User Enters the Destination and To and Date and Search")
    public void user_enters_the_destination_and_to_and_date_and_search() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        RedBus objRedBus = new RedBus(driver);
        objRedBus.visitWebsite();
        driver.manage().window().maximize();
        Thread.sleep(2000);
//        WebElement selectFrom = driver.findElement(By.id("src"));
//        selectFrom.click();
//        Thread.sleep(2000);
//        selectFrom.sendKeys("Banglore");
//        Thread.sleep(4000);
//
//        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));
//        for(WebElement option : options)
//        {
//            //System.out.println("The elements are :"+option.getText());
//            if(option.getText().equalsIgnoreCase("Bangalore Airport, Bangalore"))
//            {
//                option.click();
//                break;
//            }
//        }
        objRedBus.EnterTheDestination();
        Thread.sleep(4000);

        //Selecting the To
//        driver.findElement(By.id("dest")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("dest")).sendKeys("Pune");
//        Thread.sleep(2000);
//        List<WebElement> optionss = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));
//        for(WebElement option : optionss)
//        {
//            //System.out.println("The elements are :"+option.getText());
//            if(option.getText().equalsIgnoreCase("Pune"))
//            {
//                option.click();
//                break;
//            }
//        }
        objRedBus.EnterTheTo();
        Thread.sleep(4000);
//        WebElement selectDate = driver.findElement(By.cssSelector("input[id=\"onward_cal\"]"));
//
//        selectDate.click();
//        Thread.sleep(1000);
//        //button to move next in calendar
//
//        WebElement nextLink = driver.findElement(By.className("next"));
//        nextLink.click();
//        Thread.sleep(1000);
//
//        WebElement midLink = driver.findElement(By.xpath("//td[@class=\"monthTitle\"]"));
//        //midLink.click();
//        Thread.sleep(500);
//        //button to move previous month in calendar
//        //System.out.println("Level1");
//        WebElement previousLink = driver.findElement(By.className("prev"));
//        //previousLink.click();
//        Thread.sleep(500);
//        //System.out.println("Level 2");
//
//        //System.out.println("Level 3");
//        LocalDate date = LocalDate.now();
//        String dd = date.toString();
//        //System.out.println("The date is :"+dd);
//        driver.findElement(By.xpath("//td[normalize-space()='14']")).click();
//        Thread.sleep(500);
        objRedBus.SelectTravelDate();
        Thread.sleep(3000);
//        WebElement searchButton= driver.findElement(By.id("search_btn"));
//        searchButton.click();
        objRedBus.searchButtonClick();
        Thread.sleep(2000);
        objRedBus.displayTheBusTicket();
        Thread.sleep(3000);

        //--------------------Quitting the Browser
        objRedBus.closeBrowser();

    }

    @When("User Select the Sort by Price")
    public void user_select_the_sort_by_price() {
        System.out.println("");
    }

    @Then("User Selects the Price Ticket Between {int} to {int}")
    public void user_selects_the_price_ticket_between_to(Integer int1, Integer int2) {
        System.out.println("");

    }



}
