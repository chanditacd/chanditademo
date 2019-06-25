package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectsAmazon
{
	public WebDriver driver;
	
	By searchbox=By.id("twotabsearchtextbox");
	By searchgo=By.xpath("(//input[@type='submit'])");
	By hover=By.xpath("(//a[@id='nav-link-shopall'])");
	By pay=By.cssSelector("a[id='nav-your-amazon']");
	By orders=By.xpath("(//div[@id='nav-logo']//following-sibling::a[2])");
	
	
	
	public PageObjectsAmazon(WebDriver driver) 
	
	{
		
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

public WebElement Typetext()
{
	return driver.findElement(searchbox);
	
		
	}
public WebElement Go()
{
	return driver.findElement(searchgo);
	
		
	}
public WebElement MouseOver()
{
	return driver.findElement(hover);
}

public WebElement AmazonPay()
{
	return driver.findElement(pay);
}

public WebElement yourOrders()
{
	return driver.findElement(orders);
}


	
	
	

}
