package com.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.Util.utillity;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
//	public static WebDriver driver = null;
//	public static Properties properties;
//
//
//	public Base() {
//		try {
//			FileInputStream file = new FileInputStream(
//					"C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\MyPractice_FlipkartProject\\src\\main\\resources\\config.properties");
//			properties = new Properties();
//			properties.load(file);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static void initilization() {
//	
//		
//		if(driver == null) {
//			
//		String browserName = properties.getProperty("browser");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		options.addArguments("--disable notifications");
//		if (browserName.equals("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			WebDriver driver = new ChromeDriver(options);
//
//		} else if (browserName.equals("firefox")) {
//
//			WebDriverManager.firefoxdriver().setup();
//			FirefoxDriver driver1 = new FirefoxDriver();
//		
//		}
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(utillity.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(utillity.IMPLICIT_WAIT, TimeUnit.SECONDS);
//		driver.get(properties.getProperty("url"));
//	}
//	}
//}



public static WebDriver driver;
public static Properties properties;
public Base() {
	try {
		properties = new Properties();

		FileInputStream ip = new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\MyPractice_FlipkartProject\\src\\main\\resources\\config.properties");

		properties.load(ip);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}

public static void initilaizetion() {
	String browername = properties.getProperty("browser");
	if (browername.equals("chrome")) {
		System.getProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\driver\\Chromedriver.exe");

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\ADMIN\\eclipse-workspace\\gauav\\driver\\chromedriver.exe");
			ChromeOptions options=new  ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable notifications");
			DesiredCapabilities cp=new DesiredCapabilities();
			cp.setCapability(ChromeOptions.CAPABILITY,options);
			options.merge(cp);

		driver = new ChromeDriver(options);

	}
	else if(browername.equals("firefox"))
		WebDriverManager.firefoxdriver().setup();
	
	driver = new FirefoxDriver();
		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(utillity.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(utillity.IMPLICIT_WAIT, TimeUnit.SECONDS);

	driver.get(properties.getProperty("url"));
}
}


