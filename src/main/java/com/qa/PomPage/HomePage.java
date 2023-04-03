package com.qa.PomPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Base;
import com.qa.Util.utillity;

public class HomePage extends Base {
	utillity util;
	WebDriver driver;

	@FindBy (xpath="//button[text()='✕']")
	private WebElement cancel;
	
	@FindBy (xpath="//input[@name='q']")
	private WebElement searhContext;
	
	@FindBy (xpath="(//*[name()='svg'])[1]")
	private WebElement searhBtn;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void firstCancleAuthantication() {
	   cancel.click();;
	}

	public void searchFild() {
		searhContext.sendKeys("realme");
	}
	public void searchTheContaint() {
		searhBtn.click();;
	}
	
//	public HomePage(){
//		PageFactory.initElements(driver, this);
//	}
	
	
	
	

}
