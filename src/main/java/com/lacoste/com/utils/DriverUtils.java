package com.lacoste.com.utils;

import org.openqa.selenium.WebDriver;

public class DriverUtils {
	static WebDriver driver;
	String pro = System.getProperty("user.dir");
	
	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver.get("https://www.lacoste.com");
		driver.manage().window().maximize();
		
	}
	
	public static WebDriver getWebDriverInstance() {
		if (driver == null) {
			initDriver();
		}
		return driver;
	}
	
	public static void tearDownDriver() {
		driver.quit();
	}
	
	
}