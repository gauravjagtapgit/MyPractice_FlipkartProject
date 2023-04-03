package com.qa.PomPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.qa.Base.Base;
import com.qa.Util.utillity;

public class loginPage<HomePage> extends Base  {
	WebDriver driver;
	HomePage hp;
	
	
	@FindBy(xpath="//span[text()='Enter Email/Mobile number']")
	private WebElement EnterMobileNumber;
	
	@FindBy(xpath="//button[text()='Request OTP']")
	private WebElement RequestOtpButton;
	
	@FindBy(xpath="//button[text()='Verify']")
	private WebElement verifyButton;
	
	public loginPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	public void Login(String mobileNumber) {
	
	 By locator=By.xpath("//span[text()='Enter Email/Mobile number']") ;
		utillity util=new utillity();
		util.waitForElementPresent(driver,locator,20);
		
		EnterMobileNumber.sendKeys(mobileNumber);
		RequestOtpButton.click();
		
	 }
	 public void RquestAndVerify() {
		RequestOtpButton.click();
	}
	public  void verifyButton() {
		verifyButton.click();
	}

}
