package stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonDetails {
	

		public static WebDriver driver=null;
		
		
	public WebDriver initialiseDriver() throws IOException

	{
		Properties prop= new Properties();
		
				FileInputStream fis= new FileInputStream("F:\\my workspace\\Maven\\src\\test\\java\\stepdefinition\\configuration.properties");
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



