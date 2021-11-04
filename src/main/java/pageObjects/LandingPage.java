package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	//Constructor 
	public LandingPage (WebDriver driver)
	{
		this.driver = driver ;
	}
	
	
	//Elements
	By sign_in = By.xpath("//span[contains(text(),'Login')]");
	By navBar = By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
	
	
	
	public WebElement getSignIn()
	{
		return driver.findElement(sign_in);
	}
	
	public WebElement getNavBar()
	{
		return driver.findElement(navBar);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	

}
