package StepDefinition;

import io.cucumber.core.backend.StepDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MSN {
    public static WebDriver driver;
    public static PageFactoryModel.MSN obj;

    @Given("Open chrome browser and enter the {string}")
    public void open_chrome_browser_and_enter_the(String string) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        obj= new PageFactoryModel.MSN(driver);

    }
    @When("Get title of the Webpage")
    public void get_title_of_the_webpage() throws Exception{
        obj.visit();
        Thread.sleep(1000);
        String title= driver.getTitle();
    }
    @Then("Quit browser")
    public void quit_browser() {
        driver.quit();
    }

}
