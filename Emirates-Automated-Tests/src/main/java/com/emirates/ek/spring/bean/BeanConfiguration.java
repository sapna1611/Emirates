package com.emirates.ek.spring.bean;

import java.net.MalformedURLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.emirates.ek.utils.driver.SharedWebDriver;

@Configuration
@PropertySource("classpath:${property.file:project.properties}")
public class BeanConfiguration {

	
	public static final Logger LOGGER = LogManager.getLogger(BeanConfiguration.class);

	@Autowired
	
	
	@Bean(name = "web.driver")
	public SharedWebDriver initializeSharedWebDriver() throws MalformedURLException {

		return new SharedWebDriver();

	}
	
}
