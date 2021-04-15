package com.stageEngage.testCases;

import org.testng.annotations.Test;

import com.stageEngage.pageObjects.productDetailsPage;

public class TC_AddNewProduct_005 extends TC_EngageLogin_001 {
	
	@Test
	public void addNewProduct() {
		//Required objects
		TC_LinkFromNetsuite_002 TC_LinkFromNetsuite_002_Object = new TC_LinkFromNetsuite_002();
		TC_EngageProductDetails_003 TC_EngageProductDetails_003_Object = new TC_EngageProductDetails_003();
		TC_OtherDetails_004 TC_OtherDetails_004_Object = new TC_OtherDetails_004();
		productDetailsPage productDetailsPageObject = new productDetailsPage(driver, wait); 
		
		TC_LinkFromNetsuite_002_Object.linkFromNetsuite();
		logger.info("Link From Netsuite subtask is completed.");
		
		TC_EngageProductDetails_003_Object.engageProductDetails();
		logger.info("Engage product details subtask is completed.");
		
		TC_OtherDetails_004_Object.otherDetails();
		logger.info("Other Details subtask is completed.");
		
		if(productDetailsPageObject.headingProductDetailsIsDisplayed())
			logger.info("Product added successfully");
	}
}
