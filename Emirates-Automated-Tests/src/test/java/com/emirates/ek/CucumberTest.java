/**
 * This class defines the test runner to be used for Cucumber.

 * Here we are using TestNG runner
 * The cucumber options we pass is for reporting. Initially the test results will be stored
 * in json format which will then be used by maven surefire plugin to generate html reports under
 * target/site/cucumber-reports folder.
 */

package com.emirates.ek;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cucumber.api.CucumberOptions;

@CucumberOptions(plugin = { "html:target/site/cucumber-reports",
		"json:target/cucumber.json" }, glue = "com.emirates.ek.global", features = "src/test/resources/features/")
public class CucumberTest {

	public static final Logger LOGGER = LogManager.getLogger(CucumberTest.class);

	@BeforeSuite
	public void setUp() {

		LOGGER.debug("************************** Before Suite - Begin *********************************");
		LOGGER.debug("************************** Before Suite - End ***********************************");
	}

	@AfterSuite
	public void teardown() {
		LOGGER.debug("************************** After Suite - Begin **********************************");
		LOGGER.debug("************************** After Suite - End ************************************");
	}
}
