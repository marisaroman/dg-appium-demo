package com.dg.driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverManager {

	//The base URL should be an argument to the test runner. Hard-coding here for simplicity.
	public static final String BASE_URL = "https://www.dollargeneral.com";
	private static AppiumDriver<MobileElement> driver;
	
	/*
	 * There are other ways to define capabilities, such as config files, test run configurations,
	 * etc. The way in which the tests will be run will determine the best way to manage capabilities.
	 */
	public static AppiumDriver<MobileElement> getDriver() throws MalformedURLException {
		if(driver == null) {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.4");
			capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
			capabilities.setCapability(MobileCapabilityType.APP, BASE_URL);
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			driver = new AppiumDriver<>(url, capabilities);
		}
		
		return driver;
	}
}
