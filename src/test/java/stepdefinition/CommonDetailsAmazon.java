package stepdefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonDetailsAmazon

{
public static WebDriver driver=null;
public  static Statement s=null;

	 
	public WebDriver WebDriverInitialise()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	return driver;
	
}
	
	public Statement dbmethod() throws SQLException
	{
	
Connection con=null;
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chandita","root","chandita");
	}
	catch (Exception e) 
	{
		
		e.printStackTrace();
	}
	 Statement s=con.createStatement();
	 
	 return s;
}
}

