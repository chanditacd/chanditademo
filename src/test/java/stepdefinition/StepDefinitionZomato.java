package stepdefinition;

import java.awt.Desktop.Action;

import org.junit.runner.RunWith;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.lu.a;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

public class StepDefinitionZomato extends CommonDetailsZomato
{
	
	
			
	@Given("^User triggers the application url$")
    public void user_triggers_the_application_url() throws Throwable 
	{
      driver=WebDriverInitialise();
      
      
		
    }
	
	
	   @And("^triggers the login page$")
	    public void triggers_the_login_page() throws Throwable
	    {
		   PageObjectsZomato pg=new PageObjectsZomato(driver);
		  
		 
		   pg.CreateAccount().click();
	       
	    }


    @When("^provides the (.+) and (.+)$")
    public void provides_the_and(String emailid, String name) throws Throwable
    {
    	PageObjectsZomato ps=new PageObjectsZomato(driver);
    	
     ps.UserEmail().sendKeys(emailid);
     ps.FullUserName().sendKeys(name);
     
   
    }

    @Then("^the account is created$")
    public void the_account_is_created() throws Throwable
    {
    	PageObjectsZomato pt=new PageObjectsZomato(driver);
    pt.UserAgreement().click();
    
    pt.RegisterUser().click();
   
    }

 

}
