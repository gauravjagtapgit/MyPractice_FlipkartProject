package com.qa.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.Base;
import com.qa.PomPage.HomePage;
import com.qa.PomPage.loginPage;

public class HomePageTest extends Base{

	WebDriver driver;
	HomePage homepage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initilaizetion();

		homepage = new HomePage(driver);
	}

	@Test(priority = 1)
	public void LoginTestCase() {
		homepage.firstCancleAuthantication();
		homepage.searchFild();
		homepage.searchTheContaint();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

