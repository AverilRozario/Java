package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement Email;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[3]/div/div/label/input")
	WebElement checkbox;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button")
	WebElement login;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setValues(String email,String pswrd)
	{
		Email.sendKeys(email);
		password.sendKeys(pswrd);
		checkbox.click();
	}
	
	public void clickLogin()
	{
		login.click();
	}
}
