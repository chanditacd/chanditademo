package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonDetailsZomato
{

	public static WebDriver driver=null;
	
	public WebDriver WebDriverInitialise()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.zomato.com/bangalore");
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	return driver;
	
}
}
