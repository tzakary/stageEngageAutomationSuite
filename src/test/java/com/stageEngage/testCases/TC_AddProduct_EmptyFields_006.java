package com.stageEngage.testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.stageEngage.pageObjects.engageProductDetailsPage;
import com.stageEngage.pageObjects.engageProductPage;
import com.stageEngage.pageObjects.linkFromNetsuitePage;
import com.stageEngage.pageObjects.otherDetailsPage;
import com.stageEngage.utilities.setEngageProductDetails;
import com.stageEngage.utilities.setLinkFromNetsuite;

public class TC_AddProduct_EmptyFields_006 extends TC_EngageLogin_001{
	
	SoftAssert softAssert = new SoftAssert();

	//@Test
	public void LinkFromNetsuiteEmptyFields() {
		
		//Required objects
		engageProductPage engageProductPageObject = new engageProductPage(driver, wait);
		linkFromNetsuitePage linkFromNetsuitePageObject = new linkFromNetsuitePage(driver, wait);
		setLinkFromNetsuite setLinkFromNetsuiteObject = new setLinkFromNetsuite();
		
		engageProductPageObject.clickAddNewProductButton();
		if(linkFromNetsuitePageObject.headingLinkFromNetsuiteIsDisplayed()) {
			setLinkFromNetsuiteObject.sendInputLinkFromNetsuite();
			linkFromNetsuitePageObject.clickNextButton();
			
			if(linkFromNetsuitePageObject.dlNameWarningIsDisplayed()) {
				softAssert.assertTrue(true);
				logger.info("Warning for empty DL Name field is displayed.");
			}
			else {
				softAssert.assertTrue(false);
				logger.info("Warning for empty DL Name field is not displayed even after the field was left empty.");
			}
			if(linkFromNetsuitePageObject.cemNameWarningIsDisplayed()) {
				softAssert.assertTrue(true);
				logger.info("Warning for empty CEM Name field is displayed.");
			}
			else {
				softAssert.assertTrue(false);
				logger.info("Warning for empty CEM Name field is not displayed even after the field was left empty.");
			}
			if(linkFromNetsuitePageObject.clientNameWarningIsDisplayed()) {
				softAssert.assertTrue(true);
				logger.info("Warning for empty Client Name field is displayed.");
			}
			else {
				softAssert.assertTrue(false);
				logger.info("Warning for empty Client Name field is not displayed even after the field was left empty.");
			}
			if(linkFromNetsuitePageObject.dlEmailWarningIsDisplayed()) {
				softAssert.assertTrue(true);
				logger.info("Warning for empty DL Email field is displayed.");
			}
			else {
				softAssert.assertTrue(false);
				logger.info("Warning for empty DL Email field is not displayed even after the field was left empty.");
			}
			if(linkFromNetsuitePageObject.cemEmailWarningIsDisplayed()) {
				softAssert.assertTrue(true);
				logger.info("Warning for empty CEM Email field is displayed.");
			}
			else {
				softAssert.assertTrue(false);
				logger.info("Warning for empty CEM Email field is not displayed even after the field was left empty.");
			}
		}
		softAssert.assertAll();
	}
	
	//@Test
	public void EngageProductDetailsEmptyFields() {
		//Required objects
		TC_LinkFromNetsuite_002 TC_LinkFromNetsuite_002_Object = new TC_LinkFromNetsuite_002();
		engageProductDetailsPage engageProductDetailsPageObject = new engageProductDetailsPage(driver, wait);
		setEngageProductDetails setEngageProductDetailsObject = new setEngageProductDetails();
		
		TC_LinkFromNetsuite_002_Object.linkFromNetsuite();
		if (engageProductDetailsPageObject.headingEngageProductDetailsIsDisplayed()) {
			logger.info("Successfully redirected to Engage Product Details page.");
			setEngageProductDetailsObject.sendInputEngageProductDetails();
			engageProductDetailsPageObject.clickNextButton();
			if(engageProductDetailsPageObject.projectNameFieldWarningIsDisplayed()) {
				softAssert.assertTrue(true);
				logger.info("Warning for empty Project Name field is displayed.");
			}
			else {
				softAssert.assertTrue(false);
				logger.info("Warning for empty Project Name field is not displayed even after the field was left empty.");
			}
			if(engageProductDetailsPageObject.dlSponsorNameFieldIsDisplayed()) {
				softAssert.assertTrue(true);
				logger.info("Warning for empty DL Sponsor Name field is displayed.");
			}
			else {
				softAssert.assertTrue(false);
				logger.info("Warning for empty DL Sponsor Name field is not displayed even after the field was left empty.");
			}
			if(engageProductDetailsPageObject.dlSponsorEmailFieldWarningIsDisplayed()) {
				softAssert.assertTrue(true);
				logger.info("Warning for empty DL Sponsor Email field is displayed.");
			}
			else {
				softAssert.assertTrue(false);
				logger.info("Warning for empty DL Sponsor Email field is not displayed even after the field was left empty.");
			}
		}
		softAssert.assertAll();
	}
	
	@Test
	public void OtherDetailsEmptyFields() {
		//Required objects
		TC_LinkFromNetsuite_002 TC_LinkFromNetsuite_002_Object = new TC_LinkFromNetsuite_002();
		TC_EngageProductDetails_003 TC_EngageProductDetails_003_Object = new TC_EngageProductDetails_003();
		otherDetailsPage otherDetailsPageObject = new otherDetailsPage(driver, wait);
		
		TC_LinkFromNetsuite_002_Object.linkFromNetsuite();
		TC_EngageProductDetails_003_Object.engageProductDetails();
		if (otherDetailsPageObject.headingOtherDetailsIsDisplayed()) {
			logger.info("Successfully redirected to Other Details page.");
			
			otherDetailsPageObject.clickIsEhiPhcExemptedYesRadioButton();
			logger.info("Yes radio button for EHI-PHC exemption is clicked.");
			
			otherDetailsPageObject.clickAddButton();
			logger.info("Add button is clicked.");
			
			if(otherDetailsPageObject.exemptionReasonFieldWarningIsDisplayed()) {
				softAssert.assertTrue(true);
				logger.info("Warning for empty Exemption Reason field is displayed.");
			}
			else {
				softAssert.assertTrue(false);
				logger.info("Warning for empty Exemption Reason field is not displayed even after the field was left empty.");
			}
			
			if(otherDetailsPageObject.dateFieldWarningIsDisplayed()) {
				softAssert.assertTrue(true);
				logger.info("Warning for empty Date field is displayed.");
			}
			else {
				softAssert.assertTrue(false);
				logger.info("Warning for empty Date field is not displayed even after the field was left empty.");
			}
		}
		softAssert.assertAll();
	}
}
