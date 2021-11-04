package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	//Constructor 
	public LoginPage (WebDriver driver)
	{
		this.driver = driver ;
	}
	
	
	//Elements
	By emailAddress = By.xpath("//input[@id='user_email']");
	By password = By.xpath("//input[@id='user_password']");
	By login = By.xpath("//input [@type ='submit']");
	By alert = By.xpath("//div [@role = \"alert\"]");
	
	
	
	
	public WebElement getEmailAddress()
	{
		return driver.findElement(emailAddress);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
	public WebElement getAlert()
	{
		return driver.findElement(alert);
	}

}
