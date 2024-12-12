package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"company\"]")
	WebElement company;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement Email;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"password-confirm\"]")
	WebElement confirmpass;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button")
	WebElement register;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setValues(String nm,String cmpny,String email,String pswrd,String cpswrd)
	{
		name.sendKeys(nm);
		company.sendKeys(cmpny);
		Email.sendKeys(email);
		password.sendKeys(pswrd);
		confirmpass.sendKeys(cpswrd);
	}
	
	public void register()
	{
		register.click();
	}
}
