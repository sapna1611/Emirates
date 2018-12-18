package com.emirates.ek.utils;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.emirates.ek.data.Global;

public class SharedWebDriver {

	public WebDriver driver;

	public WebDriver getWebdriver() throws MalformedURLException {

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(Global.GLOBAL_IMPLICIT_WAIT_IN_SECS, TimeUnit.SECONDS);
		
		
		//driver.manage().timeouts().pageLoadTimeout(Global.GLOBAL_PAGE_LOAD_TIMEOUT_IN_SECS, TimeUnit.SECONDS);
		driver.get("https://www.emirates.com/ae/english/");
		return driver;


		
	}
}
