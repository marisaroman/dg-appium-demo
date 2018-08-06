package com.dg.pages;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {

	private static final String PRODUCT_LINK_CLASS_NAME = "product-item-link";
	private static final String MESSAGE_CSS = "div[class='message notice']";
	
	@FindBy(className = PRODUCT_LINK_CLASS_NAME)
	private List<WebElement> productLinks;
	
	@FindBy(css = MESSAGE_CSS)
	private WebElement searchResultMessage;
	
	public SearchResultPage() throws MalformedURLException {
		super();
	}
	
	public int getProductLinkCount() {
		return productLinks.size();
	}
	
	public void waitForProductLink() {
		waitForElementPresent(By.className(PRODUCT_LINK_CLASS_NAME));
	}
	
	public void waitForSearchResultMessage() {
		waitForElementPresent(By.cssSelector(MESSAGE_CSS));
	}
	
	public String getSearchResultMessageText() {
		return searchResultMessage.getText();
	}
}