package com.emirates.ek.global.stepdefs.home;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import cucumber.api.java.After;

public class GlobalBeforeAndAfterStepDefs extends BaseStepDefinition {

	public static final Logger LOGGER = LogManager.getLogger(GlobalBeforeAndAfterStepDefs.class);
	

	@After(order = 20000, value = "@UI")
	public void logoutFailureRecovery() throws Throwable {

		LOGGER.debug("@After(order = 20000, value = '@UI')");

	}

}