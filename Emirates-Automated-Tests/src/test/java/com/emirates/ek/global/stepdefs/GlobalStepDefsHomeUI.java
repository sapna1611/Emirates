package com.emirates.ek.global.stepdefs;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.emirates.ek.pages.HomePage;
import com.emirates.ek.utils.driver.SharedWebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GlobalStepDefsHomeUI {

	public static final Logger LOGGER = LogManager.getLogger(GlobalStepDefsHomeUI.class);

	@Then("^that Bill has decided to check available flights$")
	public void that_Bill_has_decided_to_check_available_flights() throws Throwable {

		SharedWebDriver u = new SharedWebDriver();

		u.getWebdriver();

		HomePage hm = new HomePage(u.getWebdriver());
		hm.clickonSearchFlightsTab();

	}

	@When("^he looks at a return trip from \"([^\"]*)\" to \"([^\"]*)\" leaving one week from now$")
	public void he_looks_at_a_return_trip_from_DXB_to_LHR_leaving_one_week_from_now(String departure, String Arrival)
			throws Throwable {

	}

	@Then("^he should be shown the cheapest return ticket from DXB to LHR$")
	public void he_should_be_shown_the_cheapest_return_ticket_from_DXBto_LHRs() throws Throwable {

	}
}