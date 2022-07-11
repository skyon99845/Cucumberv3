package StepDefinition;

import io.cucumber.java.After;
//import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
//import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoFirst {



    @Before("@Second")
    public void informationFirst() {
        System.out.println("You are at informationFirst");
    }

    @Given("Hi")
    public void hi() {
        System.out.println("Hi");
    }

    @When("How are you!")
    public void how_are_you() {
        System.out.println("WElcome");
    }

    @Then("You are First")
    public void you_are_welcome() {
        System.out.println("I am fine");
    }

    @After("@Second")

//2

    @Before("@Third")
    public void informationSecond() {
        System.out.println("You are at informationSecond");
    }

    @Given("Hi2")
    public void hi2() {
        System.out.println("Hi");
    }

    @When("How are you!2")
    public void how_are_you2() {
        System.out.println("WElcome");
    }

    @Then("You are Second2")
    public void you_are_second2() {
        System.out.println("I am fine");
    }

    @After("Third")


//3
    @Before("@Four")
    public void informationThird() {
        System.out.println("You are at informationSecond");
    }

    @Given("Hi3")
    public void hi3() {
        System.out.println("Hi");
    }

    @When("How are you!3")
    public void how_are_you3() {
        System.out.println("WElcome");
    }

    @Then("You are Third3")
    public void you_are_Third3() {
        System.out.println("I am fine");
    }


}












