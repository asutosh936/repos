package skeleton;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertEquals;

public class Stepdefs {
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I wait (\\d+) hour$")
    public void I_wait_hour(int hour) throws Throwable {
        assertEquals(1, hour);
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Throwable {
        System.out.println("Bellow Grow");
    }
}
