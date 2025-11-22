package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This Class written a common class to read the properties from
 * config.properties file
 */
public class ReadProperties {

	/**
	 * This method will load the properties from cong.properties
	 */
	public static Properties loadProperties() {

		// Open the File
		File objfile = new File("AppConfig/config.properties");

		// Read the File
		FileInputStream objfis = null;
		try {
			objfis = new FileInputStream(objfile);
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		}

		Properties objprop = new Properties();
		try {
			objprop.load(objfis);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return objprop;

	}
	
	/**
	 * This method will read key (appURL) from cong.properties and return value
	 */
	public static String getappURL() {

		return loadProperties().getProperty("appURL");

	}

	/**
	 * This method will read key (implicitWaitTime) from cong.properties and return value
	 */
	public static long implicitWaitTime() {

		return Long.parseLong(loadProperties().getProperty("implicitWaitTime"));
	}

	/**
	 * This method will read key (userName) from cong.properties and return value
	 */
	public static String getAppUserName() {
		return loadProperties().getProperty("userName");
	}

	/**
	 * This method will read key (password) from cong.properties and return value
	 */
	public static String getAppPassword() {
		return loadProperties().getProperty("password");
	}

	/**
	 * This method will read key (password) from cong.properties and return value
	 */
	public static long getFluentWaitTime() {

		return Long.parseLong(loadProperties().getProperty("fluentWaitTime"));
	}

}
