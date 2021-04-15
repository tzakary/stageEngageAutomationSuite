package com.stageEngage.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class productDetailsPage {

	WebDriver localDriver;
	WebDriverWait localWait;
	
	//Constructor
	public productDetailsPage(WebDriver remoteDriver, WebDriverWait remoteWait){
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
		localWait = remoteWait;
	}
	
	//Elements of Product Details page
	@FindBy(xpath = "//*[@id='application-main-content']/div/div[1]/div/div/div[3]/div/div/div[1]/div[1]/p")
	WebElement headingProductDetails;
	
	//Action methods for the above elements
	public boolean headingProductDetailsIsDisplayed() {
		return headingProductDetails.isDisplayed();
	}
}
