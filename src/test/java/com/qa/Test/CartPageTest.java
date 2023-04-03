package com.qa.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.Base;
import com.qa.PomPage.HomePage;
import com.qa.PomPage.cartPage;

public class CartPageTest extends Base {

	
	WebDriver driver;
	cartPage cartpage;

	public CartPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initilaizetion();

		cartpage = new cartPage(driver);
	}

	@Test(priority = 1)
	public void catrpage() {
		cartpage.cancelBtn();
		cartpage.clickOnCartBtn();
		boolean click=cartpage.clickOnCartBtn();
		Assert.assertTrue(click);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
