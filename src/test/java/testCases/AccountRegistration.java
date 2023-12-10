package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.RegistrationPage;
import testBase.BaseClass;



public class AccountRegistration extends BaseClass {
	
	@Test()
	public void accountRegistration() throws InterruptedException {
		 
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		
		Thread.sleep(2000);
		hp.clickRegister();
		 
		
		RegistrationPage rp=new RegistrationPage(driver);
		
		rp.sendFirstName(randomeString());  //gtyui
		Thread.sleep(2000);
		rp.sendLastName(randomeString()); // abcd
		Thread.sleep(2000);
		rp.sendEmail(randomeString()+"@gmail.com"); //ghjuk@gmail.com
		Thread.sleep(2000);
		rp.sendPasword(randomAlphaNumeric()); // abcd@123
		Thread.sleep(3000);
		rp.selectAgree();
		Thread.sleep(2000);
		rp.ClickContinue();
		String text=rp.textVerify();
		//Assert.assertEquals(text, "Congratulations! Your new account has been successfully created!");
		
	
		
		
		
	}

}
