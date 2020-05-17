package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class qaclickhome {
	
	public WebDriver driver;
	public qaclickhome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(@href,'sign_in')]")
	WebElement login;
	
	@FindBy(xpath="//div[@class='text-center']/h2")
	WebElement text;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']")
	WebElement bar;
	
public WebElement signin()
{
	return login;
}
public WebElement hometext()
{
	return text;
}
public WebElement barcheck()
{
	return bar;
}


	

}
