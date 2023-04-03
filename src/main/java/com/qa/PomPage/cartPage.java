package com.qa.PomPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Base;
import com.qa.Util.utillity;

public class cartPage extends Base  {
	
	WebDriver driver;
	
	@FindBy (xpath="//button[text()='✕']")
	private WebElement cancel;
	
	@FindBy (xpath="//a[@class='_3SkBxJ']")
	private WebElement cartBtn;
	
	public cartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public void cancelBtn() {
		
		cancel.click();
	}
	public boolean clickOnCartBtn() {
		cartBtn.click();
		return true;
	}
	
	

}
