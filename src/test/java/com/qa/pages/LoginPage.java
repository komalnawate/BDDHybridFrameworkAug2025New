package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ElementActions;
import com.qa.util.WaitMethods;

import cucumber.api.Scenario;

public class LoginPage {
	
	WebDriver driver ;
	Scenario scenario;
	
	// Page object repository 
   // Elements located by @FindBy annotation and Xpath
		
		@FindBy(xpath="//input[@name='username']")
		WebElement userNameField;
		
		@FindBy(xpath="//input[@name='password']")
		WebElement passwordField;
		
		@FindBy(xpath="//button[text()=' Login ']")
		WebElement loginButton;
		
		@FindBy(xpath="//h6[text()='Dashboard']")
		WebElement titleOfHomePage;
		
		/**
		 * This is the current class constructor
		 */
		public LoginPage(WebDriver driver, Scenario scenario){
			
			this.driver=driver;
			this.scenario=scenario;
			PageFactory.initElements(driver, this);
			
		}
		
		/**
		 * This method use to send UserName , Password & login & return HomePage Title
		 */
		public String login(String userName, String password) {
			
			WaitMethods.staticWait(2000);
			
			ElementActions.sendKeys(driver, userNameField, scenario, userName);
			ElementActions.sendKeys(driver, passwordField, scenario, password);
			ElementActions.clickElement(driver, loginButton, scenario);
			WaitMethods.staticWait(2000);
			
			return ElementActions.getText(driver, titleOfHomePage, scenario);
		}

}
