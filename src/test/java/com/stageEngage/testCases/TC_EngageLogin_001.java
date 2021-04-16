package com.stageEngage.testCases;

import java.util.Set;

import org.testng.annotations.BeforeMethod;

import com.stageEngage.pageObjects.engageLoginPage;
import com.stageEngage.pageObjects.engageProductPage;
import com.stageEngage.pageObjects.googleLoginPage;

public class TC_EngageLogin_001 extends BaseClass {
	
	@BeforeMethod
	public void engageLogin() {
		
		//Required objects
		googleLoginPage googleLoginPageObject = new googleLoginPage(driver, wait);
		engageLoginPage engageLoginPageObject = new engageLoginPage(driver, wait);
		engageProductPage engageProductPageObject = new engageProductPage(driver, wait);
		logger.info("Objects of required classes are initialized.");
		
		driver.get(engageURL);
		logger.info("Engage's URL is hit.");
		String engageWindowHandle = driver.getWindowHandle();
		
		//Engage login
		engageLoginPageObject.waitForEngageLoginButton();
		engageLoginPageObject.clickEngageLoginButton();
		logger.info("Engage login button is clicked.");
		
		//Switching windows
		Set <String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			if(!windowHandle.equalsIgnoreCase(engageWindowHandle)) {
				driver.switchTo().window(windowHandle);
				logger.info("WebDriver switches to the new window.");
				//Google login
				googleLoginPageObject.inputGoogleEmail(googleUser);
				googleLoginPageObject.clickGoogleEmailNextButton();
				googleLoginPageObject.waitForPasswordField();
				googleLoginPageObject.inputGooglePassword(googlePassword);
				googleLoginPageObject.clickGooglePasswordNextButton();
				logger.info("Google login takes place.");
				driver.switchTo().window(engageWindowHandle);
				logger.info("WebDriver switches back to the parent window.");
				break;
			}
		}
		
		//Verification
		engageProductPageObject.waitForAddNewProductButton();
		if(engageProductPageObject.addNewProductButtonIsDisplayed()) {
			System.out.println("Login successful");
			logger.info("Process of logging in is verified.");
		}
	}
	
}
