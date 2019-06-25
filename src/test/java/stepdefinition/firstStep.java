package stepdefinition;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class firstStep {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("Landingpage");
    }

    @When("^user login into application with user name and password$")
    public void user_login_into_application_with_user_name_and_password() throws Throwable {
    	 System.out.println("login");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	 System.out.println("home");
     
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	 System.out.println("cards");
    }

}

