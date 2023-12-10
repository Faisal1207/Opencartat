package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LoginPage;
import testBase.BaseClass;

public class TC_02Login extends BaseClass {
	@Test()
	public void testLogin() throws InterruptedException {
		
	   HomePage hp=new HomePage(driver);
	   
	   hp.clickMyAccount();
	   hp.clickLogin();
	   
	   LoginPage lp=new LoginPage(driver);
	   
	   //get the values from config file and pass it 
	   
	   lp.sendEmail(rb.getString("email")); //  email will get from config file
	   lp.sendPassword(rb.getString("password"));  // password will get from config file
	   Thread.sleep(3000);
	   lp.clickOnLogin();
	   Thread.sleep(3000);
	   


	
	
		
		
	}

}
