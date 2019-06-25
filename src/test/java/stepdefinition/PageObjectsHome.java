package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectsHome 
{
	public WebDriver driver;

	By loc=By.xpath("(//*[@id='keyword'])");
	 By constat=By.xpath("(//a[@class='FI-Tag ddLClick dropDown frmEl'])");
	By underconstruction=By.xpath("(//a[@title='bellandur, bangalore south'])");
	 By readytomove=By.xpath("(//a[@id='ready_move'])");
	 By und=By.xpath("(a//[@id='under_const'])");
	By head=By.xpath("(//input[@value='Search'] )") ;
	
	
	
	public  PageObjectsHome(WebDriver driver)
	{
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}


	public WebElement SearchText()
	{
		
				return driver.findElement(loc);
			     
		
	}
	
	public WebElement ConstructionDropdown()
	{
		return driver.findElement(constat);
		
	}
	
	public WebElement UnderConst()
	{
		return driver.findElement(underconstruction);
	
	}
	
	
	public WebElement ReadyTo()
	{
		return driver.findElement(readytomove);
	}
	
	public WebElement Under()
	{
		return driver.findElement(und);
	}	
	
	
	public WebElement Heading()
	{
		return driver.findElement(head);
	}	
	
}
	


