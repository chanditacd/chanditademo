package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectsZomato 

{
public WebDriver driver;


By login=By.xpath("//a[@id='signup-link']");
By signup=By.xpath("//span[@class='fontsize3']");
By fullname=By.id("sd-fullname");
By email=By.id("sd-email");
By policy=By.xpath("//input[@id='sd-newsletter']");
By submit=By.xpath("//input[@type='submit']");
By icon= By.xpath("//img[@class='br3']");


public  PageObjectsZomato(WebDriver driver)
{
	this.driver=driver;
}


public WebElement CreateAccount()
{
return driver.findElement(login);
}

public WebElement SignUpUser()

{
	return driver.findElement(signup);
	
}

public WebElement FullUserName()
{
	return driver.findElement(fullname);
	
}

public WebElement UserEmail()
{
return driver.findElement(email);
}


public WebElement UserAgreement()
{
	return driver.findElement(policy);
	
}

public WebElement RegisterUser()
{
	return driver.findElement(submit);
	
}

public WebElement ValidatePageOpens()
{
	return driver.findElement(icon);
}
}
