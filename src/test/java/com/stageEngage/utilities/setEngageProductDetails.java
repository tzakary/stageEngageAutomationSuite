package com.stageEngage.utilities;

import com.stageEngage.pageObjects.engageProductDetailsPage;
import com.stageEngage.testCases.BaseClass;

public class setEngageProductDetails extends BaseClass{
	
	public void sendInputEngageProductDetails() {
		//Required objects
		engageProductDetailsPage engageProductDetailsPageObject = new engageProductDetailsPage(driver, wait);
		
		engageProductDetailsPageObject.inputProjectName(projectName);
		logger.info("Project Name field is filled with valid input.");
		engageProductDetailsPageObject.inputSponsorName(dlSponsorName);
		logger.info("DL Sponsor Name field is filled with valid input.");
		engageProductDetailsPageObject.inputSponsorEmail(dlSponsorEmail);
		logger.info("DL Sponsor Email field is filled with valid input.");
	}
}
