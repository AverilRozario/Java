package testpackage;

import org.testng.annotations.Test;

import baseclasspackage.BlazedDemoBaseClass;
import pagepackage.RegisterPage;

public class RegisterTest extends BlazedDemoBaseClass{

	@Test
	public void registerBlazedDemo()
	{
		RegisterPage rp=new RegisterPage(driver);
		rp.setValues("Averil", "aws", "averilrozario187@gmail.com", "aq@E1wr2", "aq@E1wr2");
		rp.register();
	}
}
