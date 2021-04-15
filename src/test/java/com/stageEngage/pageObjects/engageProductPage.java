package com.stageEngage.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class engageProductPage {
	
	WebDriver localDriver;
	WebDriverWait localWait;
	
	//Constructor
	public engageProductPage(WebDriver remoteDriver, WebDriverWait remoteWait){
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
		localWait = remoteWait;
	}
	
	//Elements of Engage login page
	@FindBy(xpath = "//*[@id='add-new-project']")
	WebElement addNewProductButton;
	
	//Action methods for the above elements	
	public void clickAddNewProductButton() {
		addNewProductButton.click();
	}
	
	public boolean addNewProductButtonIsDisplayed() {
		return addNewProductButton.isDisplayed();
	}
	
	//Wait methods
	public void waitForAddNewProductButton() {
		localWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='add-new-project']")));
	}

}
