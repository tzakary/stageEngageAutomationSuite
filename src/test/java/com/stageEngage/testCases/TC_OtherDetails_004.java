package com.stageEngage.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.stageEngage.pageObjects.addProductDetailsPage;
import com.stageEngage.pageObjects.otherDetailsPage;

public class TC_OtherDetails_004 extends BaseClass {

	@Test
	public void otherDetails() {
	//Required objects
	otherDetailsPage otherDetailsPageObject = new otherDetailsPage(driver, wait);
	addProductDetailsPage addProductDetailsPageObject = new addProductDetailsPage(driver, wait);
	
	if (otherDetailsPageObject.headingOtherDetailsIsDisplayed()) {
		logger.info("Successfully redirected to Other Details page.");
		
		otherDetailsPageObject.clickIsEhiPhcExemptedYesRadioButton();
		logger.info("Yes radio button for EHI-PHC exemption is clicked.");
		Assert.assertTrue(otherDetailsPageObject.ehiExemptionReasonFieldIsDisplayed(), "Exemption reason field is not displayed upon clicking Yes radio button for EHI-PHC Exempted.");
		
		otherDetailsPageObject.inputEhiExemptionReason(ehiExemptionReason);
		logger.info("Exemption reason was added.");
		
		Assert.assertFalse(otherDetailsPageObject.mandatoryEarDateYesRadioButtonIsEnabled(), "Yes radio button for mandatory EAR date is enabled even after Yes radio button for EHI-PHC exemption is clicked.");
		
		otherDetailsPageObject.clickEngagementTermSustainedRadioButton();
		logger.info("Sustained radio button for Engagement Term is clicked.");
		
		otherDetailsPageObject.clickDateField();
		otherDetailsPageObject.clickDate();
		otherDetailsPageObject.clickDateOkayButton();
		logger.info("Date is picked from the date picker.");
		
		otherDetailsPageObject.clickAddButton();
		logger.info("Add button is clicked.");
		
		addProductDetailsPageObject.waitForSuccessOkayButton();
		addProductDetailsPageObject.clickSuccessOkayButton();
		logger.info("Success okay button is clicked button is clicked.");
	}
	}
}
