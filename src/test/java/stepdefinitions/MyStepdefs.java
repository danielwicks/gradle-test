package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MyStepdefs {

    private boolean hasRun = false;

    @Given("^the project has a setup setp$")
    public void theProjectHasASetupSetp() throws Throwable {

    }

    @When("^the user runs build$")
    public void theUserRunsBuild() throws Throwable {
        hasRun = true;
    }

    @Then("^a cucumber test should be invoked$")
    public void aCucumberTestShouldBeInvoked() throws Throwable {
        assertThat(hasRun, is(true));
    }

}
