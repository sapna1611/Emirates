package com.emirates.ek.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public static final String SEARCH_FLIGHTS_TAB = "description";
	@FindBy(id = SEARCH_FLIGHTS_TAB)
	private WebElement searchFlightsTab;

	public static final String DEPARTURE_AIRPORT = "description";
	@FindBy(xpath = DEPARTURE_AIRPORT)
	private WebElement departureAirport;

	public static final String ARRIVAL_AIRPORT = "description";
	@FindBy(xpath = ARRIVAL_AIRPORT)
	private WebElement arrivalAirport;

	@Override
	public boolean validatePage() {
		// / LOGGER.info("[CDP-TEST] Validating About box");
		// if (aboutHeader.getText().equalsIgnoreCase("About")) {
		// return true;
		// }
		return false;
	}

	@Override
	public String getPageTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public void clickonSearchFlightsTab() {
		// LOGGER.info("[CDP-TEST] About - Clicking on Copyright Tab");
		waitForWebElementToBeClickable(searchFlightsTab);
		searchFlightsTab.click();

	}
}
