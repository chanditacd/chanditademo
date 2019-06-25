package application;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import academy.base;
import resources.PageObjectHomePage;

@Test
public class Login extends base
{
	
public void LoginToTheUI() throws IOException
{
  
	driver=initialiseDriver();
	
}
@Test
 public void Search()
 {
	 
	PageObjectHomePage st= new PageObjectHomePage(driver);
     st.SearchText().sendKeys("Bellandur");
     st.ConstructionDropdown().click();
     st.UnderConst().click();
     st.ReadyTo().click();

 }

@Test
public void ValidateTitle() throws IOException
{
	PageObjectHomePage hd= new PageObjectHomePage(driver);
	hd.Heading().click();
	System.out.println("tag");

}



	
	
}

	
		

