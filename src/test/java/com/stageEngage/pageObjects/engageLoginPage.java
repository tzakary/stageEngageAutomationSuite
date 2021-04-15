package com.stageEngage.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class engageLoginPage {
	
	WebDriver localDriver;
	WebDriverWait localWait;
	
	//Constructor
	public engageLoginPage(WebDriver remoteDriver, WebDriverWait remoteWait){
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
		localWait = remoteWait;
	}
	
	//Elements of Engage login page
	@FindBy(xpath = "//button")
	WebElement engageLoginButton;
	
	//Action methods for the above elements
	public void clickEngageLoginButton() {
		engageLoginButton.click();
	}
	
	//Wait methods
	public void waitForEngageLoginButton() {
		localWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button")));
	}
}

