package labourAndSocialAffairs;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base{
	
	public WebDriver driver;

	public static org.apache.log4j.Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeMethod
	public void initialize() throws IOException 
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("URL"));
		
	}
	
	
	@Test(dataProvider = "getData")
	public void basePageNavigation (String userName, String password, String text) throws InterruptedException, IOException  
	{
		//Create object to call object class
		//driver = initializeDriver();
		//driver.get(prop.getProperty("URL"));
	
		LandingPage land = new LandingPage(driver);
		land.getSignIn().click();
		
		//Create another object from another class
		LoginPage loge = new LoginPage(driver);
		loge.getEmailAddress().sendKeys(userName);
		loge.getPassword().sendKeys(password);
		loge.getLogin().click();
		log.info(text);
		Thread.sleep(2000);
		
		
				
		
		//WebDriverWait wait = new WebDriverWait(driver , 5);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div [@role = \\\"alert\\\"]")));
		
		/*if (log.getAlert().getAttribute("style").contains("display: block;"))
		{
			System.out.println("its enabled");
			assertTrue(true);
		}
		else
		{
			System.out.println("its no");
			assertFalse(false);
		}*/
		
		
		//boolean s = log.getAlert().isDisplayed();
		//System.out.println(s);
		/*if (alertMessaage.equals("Invalid email or password."))
		{
			assertTrue(true);
		}
		else
			
		{
			assertFalse(false);
		}*/
		
		
	}
	
    @AfterMethod
	public void tearDown () 
	{
		driver.close();
		
	}
	
	
	
	@DataProvider
	// We use this method to generate multiple data on the same test case.
	public Object[][] getData ()
	{
		Object [][] data = new Object [2][3];
		data [0][0] = "Abdelhadi.qudah@gmail.com";
		data [0][1] = "1234567";
		data [0][2] = "TEST CASE 1";
		
		data [1][0] = "a.qudah@gmail.com";
		data [1][1] = "1122334455";
		data [1][2] = "TEST CASE 2";
		
		return data;
	}
	
}
