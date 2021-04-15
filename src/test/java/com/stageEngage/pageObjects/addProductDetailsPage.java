package com.stageEngage.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addProductDetailsPage {

	WebDriver localDriver;
	WebDriverWait localWait;
	
	//Constructor
	public addProductDetailsPage(WebDriver remoteDriver, WebDriverWait remoteWait){
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
		localWait = remoteWait;
	}
	
	//Elements of Add Product Details page
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[4]/button[1]")           
	WebElement cancelButton;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[1]/svg")       
	WebElement crossSVG;
	
	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div[1]/div/h6")
	WebElement headingSuccess;
	
	@FindBy(xpath = "//*[@id='button-confirmation-positive']")
	WebElement successOkayButton;
	
	//Action methods for the above elements
	public void clickCancelButton() {
		cancelButton.click();
	}
	
	public void clickCrossSVG() {
		crossSVG.click();
	}
	
	public boolean headingSuccessIsDisplayed() {
		return headingSuccess.isDisplayed();
	}
	
	public void clickSuccessOkayButton() {
		successOkayButton.click();
	}
	
	//Wait methods
	public void waitForSuccessOkayButton() {
		localWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='button-confirmation-positive']")));
	}
}

