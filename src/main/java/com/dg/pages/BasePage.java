package com.dg.pages;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dg.driver.DriverManager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * 
 * @author marisaroman
 * 
 * BasePage is where I would define what you might call "helper" methods, so that
 * the helper methods are available to any PageObject. For example, clearing and setting
 * the text of a field is a common action, which is why I created the setField method here.
 *
 */
public class BasePage {
	
	protected AppiumDriver<MobileElement> driver;
	
	public BasePage() throws MalformedURLException {
		driver = DriverManager.getDriver();
	}
	
	protected void waitForElementPresent(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	protected void setField(WebElement searchField, String text) {
		searchField.clear();
		searchField.sendKeys(text);
	}
}
