package com.emirates.ek.global.stepdefs.home;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.emirates.ek.spring.bean.BeanConfiguration;
import com.emirates.ek.utils.driver.SharedWebDriver;

@ContextConfiguration(classes = BeanConfiguration.class, loader = AnnotationConfigContextLoader.class)

public class BaseStepDefinition {

	@Autowired
	@Qualifier("rest.util")
	protected RestUtil sharedRestUtil;

	@Autowired
	@Qualifier("shared.data.map")
	protected HashMap<String, String> sharedDataMap;

	@Autowired
	@Qualifier("web.driver")
	protected SharedWebDriver sharedWebDriver;
}
