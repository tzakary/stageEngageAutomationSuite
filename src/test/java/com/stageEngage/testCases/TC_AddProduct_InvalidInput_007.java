package com.stageEngage.testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.stageEngage.pageObjects.engageProductDetailsPage;
import com.stageEngage.pageObjects.engageProductPage;
import com.stageEngage.pageObjects.linkFromNetsuitePage;
import com.stageEngage.utilities.setEngageProductDetails;
import com.stageEngage.utilities.setLinkFromNetsuite;

public class TC_AddProduct_InvalidInput_007 extends TC_EngageLogin_001 {
	
	SoftAssert softAssert = new SoftAssert();
	
	//Test
	public void LinkFromNetsuiteInvalidInput() {
		//Required objects
		engageProductPage engageProductPageObject = new engageProductPage(driver, wait);
		linkFromNetsuitePage linkFromNetsuitePageObject = new linkFromNetsuitePage(driver, wait);
		setLinkFromNetsuite setLinkFromNetsuiteObject = new setLinkFromNetsuite();
				
		engageProductPageObject.clickAddNewProductButton();
		if(linkFromNetsuitePageObject.headingLinkFromNetsuiteIsDisplayed()) {
			setLinkFromNetsuiteObject.sendInputLinkFromNetsuite();
			linkFromNetsuitePageObject.clickNextButton();
			if(linkFromNetsuitePageObject.dlEmailWarningIsDisplayed()) {
				softAssert.assertTrue(true);
				logger.info("Warning for invalid DL Email field is displayed.");
			}
			else {
				softAssert.assertTrue(false);
				logger.info("Warning for invalid DL Email field is not displayed even after the field was left empty.");
			}
			if(linkFromNetsuitePageObject.cemEmailWarningIsDisplayed()) {
				softAssert.assertTrue(true);
				logger.info("Warning for invalid CEM Email field is displayed.");
			}
			else {
				softAssert.assertTrue(false);
				logger.info("Warning for invalid CEM Email field is not displayed even after the field was left empty.");
			}
		}
		softAssert.assertAll();
	}
	
	@Test
	public void EngageProductDetailsInvalidInput() {
		//Required objects
		TC_LinkFromNetsuite_002 TC_LinkFromNetsuite_002_Object = new TC_LinkFromNetsuite_002();
		engageProductDetailsPage engageProductDetailsPageObject = new engageProductDetailsPage(driver, wait);
		setEngageProductDetails setEngageProductDetailsObject = new setEngageProductDetails();
				
		TC_LinkFromNetsuite_002_Object.linkFromNetsuite();
		if (engageProductDetailsPageObject.headingEngageProductDetailsIsDisplayed()) {
			logger.info("Successfully redirected to Engage Product Details page.");
			setEngageProductDetailsObject.sendInputEngageProductDetails();
			engageProductDetailsPageObject.clickNextButton();
			if(engageProductDetailsPageObject.dlSponsorEmailFieldWarningIsDisplayed()) {
				softAssert.assertTrue(true);
				logger.info("Warning for invalid DL Sponsor Email field is displayed.");
			}
			else {
				softAssert.assertTrue(false);
				logger.info("Warning for invalid DL Sponsor Email is not displayed even after the field was left empty.");
			}
		}
		softAssert.assertAll();
	}
}
