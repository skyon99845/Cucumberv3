package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class First {

    @Given("Welcome to Cucumber Framework")
    public void welcome_to_cucumber_framework() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("WElcome to @Given");
    }
    @When("It is BDD")
    public void it_is_bdd() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Welcome to @When");
    }
    @Then("Bye")
    public void bye() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Welcome to @Then");
    }

}
