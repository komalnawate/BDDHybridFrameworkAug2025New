package com.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.Scenario;

/**
 *This class has a method to click , send keys etc with configured dynamic waits time & exception handling
 */
public class ElementActions {
	
	/**
	 * This method will clear the exiting value from the field value
	 */
	public static void clearFieldvalue(WebDriver driver, WebElement elem, Scenario scenario) {

		try {
			WaitMethods.waitFor(driver, elem, WaitMethods.ELEMENT_TO_BE_CLICKABLE, scenario);
		} catch (Exception E) {
			scenario.write(" Error while waiting for clicking on Emmenet ");
		}
		try {
			elem.clear();
		} catch (Exception E) {
			scenario.write(" Error on clicking the element after wating !");
		}

	}
	
	/**
	 * This method will take element as parameter & wait for explicit wait time & then perform click operation
	 */
	public static void clickElement(WebDriver driver, WebElement elem, Scenario scenario) {

		try {
			WaitMethods.waitFor(driver, elem, WaitMethods.ELEMENT_TO_BE_CLICKABLE, scenario);
		} catch (Exception E) {
			scenario.write(" Error while waiting for clicking on Emmenet ");
		}
		try {
			elem.click();
		} catch (Exception E) {
			scenario.write(" Error on clicking the element after wating !");
		}
		
		}
	
	/**
	 * This method will accept the text to type & wait for fluent wait time util element is clickable & then type
	 */
	public static void sendKeys(WebDriver driver, WebElement elem, Scenario scenario, String texttoType) {

		try {
			WaitMethods.waitFor(driver, elem, WaitMethods.ELEMENT_TO_BE_CLICKABLE, scenario);
		} catch (Exception E) {
			scenario.write(" Error while waiting for clicking on Emmenet ");
		}

		try {
			elem.sendKeys(texttoType);
		} catch (Exception E) {
			scenario.write(" Error on typeing the text in element after wating !");
		}

	}
	
	/**
	 * This method will wait for fluent wait time & when ele is visible get the text & return the string value
	 */
	public static String getText(WebDriver driver, WebElement elem, Scenario scenario) {

		String texttoReturn = null;
		try {
			WaitMethods.waitFor(driver, elem, WaitMethods.ELEMENT_TO_BE_VISIBLE, scenario);
		} catch (Exception E) {
			scenario.write(" Error while waiting for Element visibility  ");
		}
		try {
			texttoReturn = elem.getText();
		} catch (Exception E) {
			scenario.write(" Error on fetching  the text in element after wating !");
		}
		return texttoReturn;

	}

}
