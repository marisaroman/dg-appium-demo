package com.dg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.dg.driver.DriverManager;
import com.dg.pages.HomePage;
import com.dg.pages.SearchResultPage;

public class ProductSearchTest extends BaseTest {

	private static HomePage home;
	private static SearchResultPage searchResult;
	
	@BeforeClass
	public static void setUpProductSearchTestClass() {
		home = PageFactory.initElements(driver, HomePage.class);
		searchResult = PageFactory.initElements(driver, SearchResultPage.class);
	}
	
	@Before
	public void setUpProductSearchTest() {
		driver.get(DriverManager.BASE_URL);
	}
	
	@Test
	public void testSearchByKeywordForKnownProductShouldReturnResults() {
		home.submitSearch("notebook");
		searchResult.waitForProductLink();
		assertTrue(searchResult.getProductLinkCount() > 0);
	}
	
	@Test
	public void testSearchByKeywordForInvalidProductShouldDisplayMessage() {
		home.submitSearch("invalidproduct");
		searchResult.waitForSearchResultMessage();
		assertEquals("Your search returned no results.", searchResult.getSearchResultMessageText());
		assertEquals(0, searchResult.getProductLinkCount());
	}
}
