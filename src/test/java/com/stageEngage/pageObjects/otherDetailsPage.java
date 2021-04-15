package com.stageEngage.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class otherDetailsPage {

	WebDriver localDriver;
	WebDriverWait localWait;
	
	//Constructor
	public otherDetailsPage(WebDriver remoteDriver, WebDriverWait remoteWait){
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
		localWait = remoteWait;
	}
	
	//Elements of Other Details page
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[1]/div[5]/span/span[2]/span")
	WebElement headingOtherDetails;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[1]/div/div/label[1]/span[1]/span[1]/input")
	WebElement isEhiPhcExemptedYesRadioButton;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[1]/div/div/label[2]/span[1]/span[1]/input")
	WebElement isEhiPhcExemptedNoRadioButton;
	
	@FindBy(name = "ehiExemptionReason")
	WebElement ehiExemptionReasonField;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[2]/div/div/label[1]/span[1]/span[1]/input")
	WebElement mandatoryEarDateYesRadioButton;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[2]/div/div/label[2]/span[1]/span[1]/input")
	WebElement mandatoryEarDateNoRadioButton;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[3]/div[1]/div/label[1]/span[1]/span[1]/input")
	WebElement engagementTermSustainedRadioButton;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[3]/div[1]/div/label[2]/span[1]/span[1]/input")
	WebElement engagementTermShortTermRadioButton;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[3]/div[2]/label")
	WebElement engageMessage;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[3]/div[3]/span/div/div/input")
	WebElement dateField;
	
	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div[1]/div[3]/div/div[5]/div[5]/button/span[1]")
	WebElement date;
	
	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div[2]/button[2]")
	WebElement dateOkayButton;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[4]/button[2]")
	WebElement previousButton;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[4]/button[3]")
	WebElement addButton;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[1]/div/div[2]/div/p")
	WebElement exemptionReasonFieldWarning;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/div[3]/div[3]/span/div/p")
	WebElement dateFieldWarning;
	
	//Action methods for the above elements
	public boolean headingOtherDetailsIsDisplayed() {
		return headingOtherDetails.isDisplayed();
	}
	
	public void clickIsEhiPhcExemptedYesRadioButton() {
		isEhiPhcExemptedYesRadioButton.click();
	}
	
	public void clickIsEhiPhcExemptedNoRadioButton() {
		isEhiPhcExemptedNoRadioButton.click();
	}
	
	public void inputEhiExemptionReason(String ehiExemptionReason) {
		ehiExemptionReasonField.sendKeys(ehiExemptionReason);
	}
	
	public void clickMandatoryEarDateYesRadioButton() {
		mandatoryEarDateYesRadioButton.click();
	}
	
	public void clickMandatoryEarDateNoRadioButton() {
		mandatoryEarDateNoRadioButton.click();
	}
	
	public void clickEngagementTermSustainedRadioButton() {
		engagementTermSustainedRadioButton.click();
	}
	
	public void clickEngagementTermShortTermRadioButton() {
		engagementTermShortTermRadioButton.click();
	}
	
	public String getTextFromEngageMessage() {
		return engageMessage.getText();
	}
	
	public void clickDateField() {
		dateField.click();
	}
	
	public void clickDate() {
		date.click();
	}
	
	public void clickDateOkayButton() {
		dateOkayButton.click();
	}
	
	public void clickPreviousButton() {
		previousButton.click();
	}
	
	public void clickAddButton() {
		addButton.click();
	}
	
	public boolean ehiExemptionReasonFieldIsDisplayed() {
		return ehiExemptionReasonField.isDisplayed();
	}
	
	public boolean mandatoryEarDateYesRadioButtonIsEnabled() {
		return mandatoryEarDateYesRadioButton.isEnabled();
	}
	
	public boolean exemptionReasonFieldWarningIsDisplayed() {
		return exemptionReasonFieldWarning.isDisplayed();
	}
	
	public boolean dateFieldWarningIsDisplayed() {
		return dateFieldWarning.isDisplayed();
	}
}
