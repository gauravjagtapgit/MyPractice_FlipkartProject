package com.qa.Test;

import static org.testng.Assert.assertTrue;

import org.bouncycastle.util.Properties;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.Base;
import com.qa.PomPage.loginPage;

public class LoginPageTest extends Base {

	loginPage loginpage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initilaizetion();

		loginpage = new loginPage();
	}

	@Test(priority = 1)
	public void LoginTestCase() {
		
		loginpage.Login(properties.getProperty("mobileNumber"));
		loginpage.RquestAndVerify();
		loginpage.verifyButton();
	  
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
