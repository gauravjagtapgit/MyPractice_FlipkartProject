package com.qa.Util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utillity {
	
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;

	
//Explicit wait
	
	public static WebElement waitForElementPresent(WebDriver driver,By locator,int timeout) {
		
		WebDriverWait wait=new 	WebDriverWait(driver,Duration.ofSeconds(timeout));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		return driver.findElement(locator);
		
	}
	public static void waitTillElementPresent(WebDriver driver, By element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

}
