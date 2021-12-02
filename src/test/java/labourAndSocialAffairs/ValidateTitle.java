package labourAndSocialAffairs;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;
import resources.RestClient;

public class ValidateTitle extends Base {

	public WebDriver driver;
	String serivceUrl;
	String apiUrl;
	String url;
	RestClient restClient;
	CloseableHttpResponse closeableHttpResponse;
	
	public static org.apache.log4j.Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws IOException 
	{
		driver = initializeDriver();
		log.info("Driver is intialized");
		
		driver.get(prop.getProperty("URL"));
		log.info("Navigated to home page");
		
		 serivceUrl = prop.getProperty("WebserviceURL");
		 apiUrl = prop.getProperty("serviceURL");
		 url = serivceUrl + apiUrl;
		 
	}
	
	@Test
	public void validateTitle () throws IOException 
	{
		LandingPage lang= new LandingPage(driver);
		assertTrue(lang.getNavBar().isDisplayed());
		log.info("Successfully validated Text Message");
		
		restClient = new RestClient();
		closeableHttpResponse = restClient.get(url);
	}
	
	@AfterTest
	public void tearDown () 
	{
		driver.close();
	}
	
	
}
