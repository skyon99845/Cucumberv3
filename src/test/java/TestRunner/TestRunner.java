package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature",
        //features = "src/test/java/feature/GoogleSearch.feature", when you want to run particular file
        glue={"StepDefinition"},
        //tags= "@Regression or @Smoke or @Prod",
        monochrome = true,
        //plugin = {"pretty","html:DemoResult/cucumber-reports/report.html"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }


}