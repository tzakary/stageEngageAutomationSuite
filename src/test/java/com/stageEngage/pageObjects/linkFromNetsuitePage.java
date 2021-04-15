package com.stageEngage.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class linkFromNetsuitePage {

	WebDriver localDriver;
	WebDriverWait localWait;
	
	//Constructor
	public linkFromNetsuitePage(WebDriver remoteDriver, WebDriverWait remoteWait){
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
		localWait = remoteWait;
	}
	
	//Elements of Link From Netsuite page
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[1]/div[1]/span/span[2]/span")
	WebElement headingLinkFromNetsuite;
	
	@FindBy(name = "dlName")
	WebElement dlNameField;
		
	@FindBy(name = "cemName")
	WebElement cemNameField;
		
	@FindBy(name = "client")
	WebElement clientNameField;
		
	@FindBy(name = "dlEmail")
	WebElement dlEmailField;
		
	@FindBy(name = "cemEmail")
	WebElement cemEmailField;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[4]/button[2]")    
	WebElement nextButton;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div/div/input")    
	WebElement salesPortfolioField;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[2]/div/div/input")
	WebElement dlAllocationPercentageField;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[3]/div[1]/div/p")
	WebElement dlNameWarning;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[4]/div[1]/div/p")
	WebElement cemNameWarning;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/p")
	WebElement clientNameWarning;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[3]/div[2]/div/p")
	WebElement dlEmailWarning;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[4]/div[2]/div/p")
	WebElement cemEmailWarning;
	
	//Action methods for the above elements
	public boolean headingLinkFromNetsuiteIsDisplayed() {
		return headingLinkFromNetsuite.isDisplayed();
	}
	
	public void inputDlName(String dlName) {
		dlNameField.sendKeys(dlName);
	}
	
	public void inputCemName(String cemName) {
		cemNameField.sendKeys(cemName);
	}
	
	public void inputClientName(String clientName) {
		clientNameField.sendKeys(clientName);
	}
	
	public void inputDlEmail(String dlEmail) {
		dlEmailField.sendKeys(dlEmail);
	}
	
	public void inputCemEmail(String cemEmail) {
		cemEmailField.sendKeys(cemEmail);
	}
	
	public void clickNextButton() {
		nextButton.click();
	}
	
	public boolean salesPortfolioFieldIsEnabled() {
		return salesPortfolioField.isEnabled();
	}
	
	public boolean dlAllocationPercentageFieldIsEnabled() {
		return dlAllocationPercentageField.isEnabled();
	}
	
	public boolean dlNameWarningIsDisplayed() {
		return dlNameWarning.isDisplayed();
	}
	
	public boolean cemNameWarningIsDisplayed() {
		return cemNameWarning.isDisplayed();
	}
	
	public boolean clientNameWarningIsDisplayed() {
		return clientNameWarning.isDisplayed();
	}
	
	public boolean dlEmailWarningIsDisplayed() {
		return dlEmailWarning.isDisplayed();
	}
	
	public boolean cemEmailWarningIsDisplayed() {
		return cemEmailWarning.isDisplayed();
	}
	
	public String getDlEmailWarningText() {
		return dlEmailWarning.getText();
	}
	
	public String getCemEmailWarningText() {
		return cemEmailWarning.getText();
	}
}
