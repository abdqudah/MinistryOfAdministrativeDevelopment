package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		//Create connection with the file that related to data properties
	    prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\MinistryOfAdministrativeDevelopment\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		
		//Save the value to use it
		String browserName = prop.getProperty("browser");
		
		//If statements to call different web drivers
		if (browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if (browserName.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browserName.equals("IE"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		
		//This method for maximize the window
		driver.manage().window().maximize();
		
		//This method for wait (ImlicitWait)
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
		
	}
	

}
