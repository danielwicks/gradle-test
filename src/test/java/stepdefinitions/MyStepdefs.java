package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.fail;

public class MyStepdefs {

    @Given("^the project has a setup setp$")
    public void theProjectHasASetupSetp() throws Throwable {

    }

    @When("^the user runs build$")
    public void theUserRunsBuild() throws Throwable {

    }

    @Then("^a cucumber test should be invoked$")
    public void aCucumberTestShouldBeInvoked() throws Throwable {
//        fail("ooops");
    }

}
