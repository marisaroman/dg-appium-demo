package com.dg;

import com.dg.driver.DriverManager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;

import org.junit.BeforeClass;

public class BaseTest {

	protected static AppiumDriver<MobileElement> driver;
	
	@BeforeClass
	public static void launchDriver() throws MalformedURLException {
		driver = DriverManager.getDriver();
		driver.get(DriverManager.BASE_URL);
	}
}
