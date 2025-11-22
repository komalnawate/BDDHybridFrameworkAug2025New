package com.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.ReadProperties;

/**
 * This class has common method to start & close the browser for all the test
 * cases
 */
public class Base {

	public static WebDriver driver;

	/**
	 * This method will launch the app url after launching the browser
	 */
	public WebDriver initializeWebDriver() {

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(ReadProperties.implicitWaitTime(), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(ReadProperties.getappURL());
		return driver;

	}

	public void closeBrowser() {
		driver.quit();
	}

}
