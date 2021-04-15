package com.stageEngage.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class engageProductDetailsPage {
	
	WebDriver localDriver;
	WebDriverWait localWait;
	
	//Constructor
	public engageProductDetailsPage(WebDriver remoteDriver, WebDriverWait remoteWait){
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
		localWait = remoteWait;
	}
	
	//Elements of Engage Product Details page
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[1]/div[3]/span/span[2]/span")
	WebElement headingEngageProductDetails;
	
	@FindBy(name = "projectName")
	WebElement projectNameField;
	
	@FindBy(name = "sponsorName")
	WebElement sponsorNameField;
	
	@FindBy(name = "sponsorEmail")
	WebElement sponsorEmailField;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[4]/button[2]")
	WebElement previousButton;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[4]/button[3]")
	WebElement nextButton;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[1]/div/div/p")
	WebElement projectNameFieldWarning;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div/p")
	WebElement dlSponsorNameFieldWarning;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[2]/div/p")
	WebElement dlSponsorEmailFieldWarning;
	
	//Action methods for the above elements
	public boolean headingEngageProductDetailsIsDisplayed() {
		return headingEngageProductDetails.isDisplayed();
	}
	
	public void inputProjectName(String projectName) {
		projectNameField.sendKeys(projectName);
	}
	
	public void inputSponsorName(String sponsorName) {
		sponsorNameField.sendKeys(sponsorName);
	}
	
	public void inputSponsorEmail(String sponsorEmail) {
		sponsorEmailField.sendKeys(sponsorEmail);
	}
	
	public void clickPreviousButton() {
		previousButton.click();
	}
	
	public void clickNextButton() {
		nextButton.click();
	}
	
	public boolean projectNameFieldWarningIsDisplayed() {
		return projectNameFieldWarning.isDisplayed();
	}
	
	public boolean dlSponsorNameFieldIsDisplayed() {
		return dlSponsorNameFieldWarning.isDisplayed();
	}
	
	public boolean dlSponsorEmailFieldWarningIsDisplayed() {
		return dlSponsorEmailFieldWarning.isDisplayed();
	}
}
