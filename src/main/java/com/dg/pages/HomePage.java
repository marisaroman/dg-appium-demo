package com.dg.pages;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(id = "search") 
	private WebElement searchField;
	
	@FindBy(css = "button[title='Search']")
	private WebElement searchButton;
	
	public HomePage() throws MalformedURLException {
		super();
	}
	
	public void submitSearch(String searchText) {
		setField(searchField, searchText);
		searchButton.click();
		
	}
}
