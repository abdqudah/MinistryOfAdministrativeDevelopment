package labourAndSocialAffairs;

import static org.testng.Assert.assertEquals;
import java.io.IOException;

import org.apache.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class ValidateNavigationBar extends Base {

	public WebDriver driver;

	public static org.apache.log4j.Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException 
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("URL"));
		
	}
	
	@Test
	public void validateBar () throws IOException 
	{
		
		LandingPage lang= new LandingPage(driver);
		assertEquals(lang.getTitle().getText(), "FEATURED COURSES12");
		log.info("Successfully validated NavBar");
		
	}
	
	@AfterTest
	public void tearDown () 
	{
		driver.close();
	}
	
	
}
