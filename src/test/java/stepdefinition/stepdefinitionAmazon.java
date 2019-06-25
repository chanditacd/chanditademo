package stepdefinition;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

public class stepdefinitionAmazon extends CommonDetailsAmazon
{
	  



	@Given("^user is on the homepage$")
	@Test(priority=1)
    public void user_is_on_the_homepage() throws Throwable 
    {
    	
   driver=WebDriverInitialise();
   
   }
   

    @When("^user searches with a value$")
    @Test(priority=2)
    public void user_searches_with_a_value() throws Throwable 
    {
    	 s=dbmethod();
    	   ResultSet rs=s.executeQuery("select username from credentials");
    	   
    	   PageObjectsAmazon pg= new PageObjectsAmazon(driver);
    	   rs.next();
    	   pg.Typetext().sendKeys(rs.getString("username"));
    	   pg.Go().click();
    	Actions a =new Actions(driver);
    	a.moveToElement(pg.MouseOver()).build().perform();
    	a.contextClick(pg.AmazonPay()).build().perform();
    	driver.manage().window().maximize();
    	driver.navigate().back();	
    	pg.yourOrders().click();
   
    }
    
 
    @Then("^the search results are displayed;$")
    @Test(priority=0)
    public void the_search_results_are_displayed() throws IOException, InvalidFormatException
    {
    
    	File f=new File("D:\\kabi.xlsx");
    	
    			f.createNewFile();
    	
    	XSSFWorkbook xs=new XSSFWorkbook(f);
    	xs.createSheet("chandita");
    	
    	}
    		    
    		
    	
    
    		      
    
    	
    
    @Then("^the browser is closed$")
    @AfterTest
    public void the_browser_is_closed()
    
    {
    	driver.close();
    	
    }

     

}
