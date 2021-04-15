package com.stageEngage.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class googleLoginPage {
	
	WebDriver localDriver;
	WebDriverWait localWait;
	
	//Constructor
	public googleLoginPage(WebDriver remoteDriver, WebDriverWait remoteWait){
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
		localWait = remoteWait;
	}
	
	//Elements of Google login page
	@FindBy(xpath = "//*[@id='identifierId']")
	WebElement googleEmailField;
		
	@FindBy(xpath = "//*[@id='identifierNext']/div/button")
	WebElement googleEmailNextButton;
		
	@FindBy(xpath = "//*[@id='password']/div[1]/div/div[1]/input")
	WebElement googlePasswordField;
		
	@FindBy(xpath = "//*[@id='passwordNext']/div/button")
	WebElement googlePasswordNextButton;
		
	//Action methods for the above elements
	public void inputGoogleEmail(String googleUser) {
		googleEmailField.sendKeys(googleUser);
	}
	
	public void clickGoogleEmailNextButton() {
		googleEmailNextButton.click();
	}
	
	public void inputGooglePassword(String googlePassword) {
		googlePasswordField.sendKeys(googlePassword);
	}
	
	public void clickGooglePasswordNextButton() {
		googlePasswordNextButton.click();
	}
	
	//Wait methods
	public void waitForPasswordField() {
		localWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")));
	}
	
	public void waitForGoogleInbox() {
		localWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='gb']/div[2]/div[2]/div[2]/form/div/input")));
	}
}
