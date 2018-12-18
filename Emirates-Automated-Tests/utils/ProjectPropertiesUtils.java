package com.emirates.ek.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProjectPropertiesUtils {

	/* Method to read property values for project.properties */
	public static String getPropertyValue(String propertyName) {

		Properties prop = new Properties();
		InputStream inputStream = null;
		String propertyValue = null;

		if (System.getenv(propertyName) != null)

			return System.getenv(propertyName);
		else
			try {

				if (System.getenv("property.file") != null) {
					inputStream = new FileInputStream(ProjectPropertiesUtils.class
							.getResource("/" + System.getenv("property.file")).getPath().toString());
				} else {
					inputStream = new FileInputStream(
							ProjectPropertiesUtils.class.getResource("/project.properties").getPath().toString());
				}

				prop.load(inputStream);
				propertyValue = prop.getProperty(propertyName);
				

			} catch (IOException ex) {

				ex.printStackTrace();
			}

		return propertyValue;

	}

}