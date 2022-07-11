package StepDefinition;

import PageFactoryModel.Google;
import PageFactoryModel.RedBus;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class HomePage {
    public static WebDriver driver;
    public static RedBus obj;
    @Given("the user navigates to {string}")
    public void the_user_navigates_to(String string) throws Exception{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        obj= new RedBus(driver);
        obj.visitWebsite();
        Thread.sleep(5000);
        System.out.println("Welcome");

    }
    @When("the title of the webpage is {string}")
    public void the_title_of_the_webpage_is(String string) {
        System.out.println("The title of the Webpage is :");
        obj.getTitle();

    }
    @Then("the user exit the browser")
    public void the_user_exit_the_browser() {
        System.out.println("Quiting the Browser");
    }

}
