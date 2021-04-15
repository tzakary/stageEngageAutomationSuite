package com.stageEngage.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.stageEngage.pageObjects.engageProductDetailsPage;
import com.stageEngage.pageObjects.engageProductPage;
import com.stageEngage.pageObjects.linkFromNetsuitePage;
import com.stageEngage.utilities.setLinkFromNetsuite;

public class TC_LinkFromNetsuite_002 extends BaseClass{
	
	@Test
	public void linkFromNetsuite() {
		//Required objects
		engageProductPage engageProductPageObject = new engageProductPage(driver, wait);
		linkFromNetsuitePage linkFromNetsuitePageObject = new linkFromNetsuitePage(driver, wait);
		engageProductDetailsPage engageProductDetailsPageObject = new engageProductDetailsPage(driver, wait);
		setLinkFromNetsuite setLinkFromNetsuiteObject = new setLinkFromNetsuite();
		
		engageProductPageObject.clickAddNewProductButton();
		logger.info("Add New Product button was clicked.");
		if (linkFromNetsuitePageObject.headingLinkFromNetsuiteIsDisplayed()) {
			logger.info("Successfully landed on Add Product Details page.");
			
			//Validation of the disabled fields of Link From Nesuite sub-task
			if(! linkFromNetsuitePageObject.salesPortfolioFieldIsEnabled()){
				Assert.assertTrue(true, "Sales Portfolio field is disabled as expected");
			}
			else {
				Assert.assertTrue(false, "Sales Portfolio field is not disabled as expected.");
			}
			logger.info("Sales Portfolio field is verified.");
			if(! linkFromNetsuitePageObject.dlAllocationPercentageFieldIsEnabled()){
				Assert.assertTrue(true, "DL Allocation % field is disabled as expected");
				logger.info("DL Allocation % field is verified.");
			}
			else {
				Assert.assertTrue(false, "TC terminated as DL Allocation % field is not disabled as expected.");
			}
			
			//Sending data to input fields
			setLinkFromNetsuiteObject.sendInputLinkFromNetsuite();
			linkFromNetsuitePageObject.clickNextButton();
			
			Assert.assertTrue(engageProductDetailsPageObject.headingEngageProductDetailsIsDisplayed(),"The NEXT button didn't work even upon entering valid values.");
		}
	}
}
