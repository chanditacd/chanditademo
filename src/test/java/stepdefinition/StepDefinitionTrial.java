package stepdefinition;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

public class StepDefinitionTrial extends CommonDetails
{

	@Given("^User triggers the application$")
	public void user_triggers_the_application() throws Throwable 
    {
    	driver=initialiseDriver();
    	
    }

    @When("^User provides the place and type and clicks Search$")
    public void user_provides_the_place_and_type_and_clicks_Search() throws Throwable {
    	PageObjectsHome hb= new PageObjectsHome(driver);
    	hb.SearchText().sendKeys("Bellandur");
    }

    @Then("^the Application opens up the Search details$")
    public void the_Application_opens_up_the_Search_details() throws Throwable 
    {
    	PageObjectsHome sc= new PageObjectsHome(driver);
    	sc.Heading().click();
    }
}



	


