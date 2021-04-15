package com.stageEngage.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.stageEngage.pageObjects.engageProductDetailsPage;
import com.stageEngage.pageObjects.otherDetailsPage;
import com.stageEngage.utilities.setEngageProductDetails;

public class TC_EngageProductDetails_003 extends BaseClass {

	@Test
	public void engageProductDetails() {
		//Required objects
		engageProductDetailsPage engageProductDetailsPageObject = new engageProductDetailsPage(driver, wait);
		otherDetailsPage otherDetailsPageObject = new otherDetailsPage(driver, wait);
		setEngageProductDetails setEngageProductDetailsObject = new setEngageProductDetails();
		
		if (engageProductDetailsPageObject.headingEngageProductDetailsIsDisplayed()) {
			logger.info("Successfully redirected to Engage Product Details page.");
			setEngageProductDetailsObject.sendInputEngageProductDetails();
			engageProductDetailsPageObject.clickNextButton();
			
			Assert.assertTrue(otherDetailsPageObject.headingOtherDetailsIsDisplayed(), "The NEXT button didn't work even upon entering valid values.");
		}
	}
}
