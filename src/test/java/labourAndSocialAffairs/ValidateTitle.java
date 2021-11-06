package labourAndSocialAffairs;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class ValidateTitle extends Base {

	public WebDriver driver;

	public static org.apache.log4j.Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws IOException 
	{
		driver = initializeDriver();
		log.info("Driver is intialized");
		
		driver.get(prop.getProperty("URL"));
		log.info("Navigated to home page");
		
	}
	
	@Test
	public void validateTitle () throws IOException 
	{
		LandingPage lang= new LandingPage(driver);
		assertTrue(lang.getNavBar().isDisplayed());
		log.info("Successfully validated Text Message");
		
	}
	
	@AfterTest
	public void tearDown () 
	{
		driver.close();
	}
	
	
}
