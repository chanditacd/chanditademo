package academy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;


public class base
{
	public static WebDriver driver=null;
	
	
public WebDriver initialiseDriver() throws IOException

{
	Properties prop= new Properties();
	
			FileInputStream fis= new FileInputStream("F:\\my workspace\\Maven\\src\\main\\java\\academy\\base.properties");
			prop.load(fis);
			
			prop.getProperty("browser");
			
			
			
			if(prop.getProperty("browser").equals("chrome"))
			{
			
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
				driver=new ChromeDriver();
				
			
	             driver.get(prop.getProperty("url"));
	             
	            
			}
			
			else
			{
				System.out.println("i am in firfox");
			}
			
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


	return driver;


}

public void Screenshots(String pass) throws IOException
	{
System.out.println("I am here");


	File fi=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(fi,new File("D:\\test\\"+pass+"screenshot.png"));
	
	}
	
	
	

}
