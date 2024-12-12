package testpackage;

import org.testng.annotations.Test;

import baseclasspackage.LoginBaseClass;
import pagepackage.LoginPage;

public class LoginTest extends LoginBaseClass{

	@Test
	public void loginTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setValues("averilrozario187@gmail.com", "aq@E1wr2");
		lp.clickLogin();
	}
}
