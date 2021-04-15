package com.stageEngage.utilities;

import com.stageEngage.pageObjects.linkFromNetsuitePage;
import com.stageEngage.testCases.BaseClass;

public class setLinkFromNetsuite extends BaseClass{

	public void sendInputLinkFromNetsuite() {
		
		//Required objects
		linkFromNetsuitePage linkFromNetsuitePageObject = new linkFromNetsuitePage(driver, wait);
		
		linkFromNetsuitePageObject.inputDlName(dlName);
		logger.info("DL Name field is filled.");
		linkFromNetsuitePageObject.inputCemName(cemName);
		logger.info("CEM Name field is filled.");
		linkFromNetsuitePageObject.inputClientName(clientName);
		logger.info("DL Name field is filled.");
		linkFromNetsuitePageObject.inputDlEmail(dlEmail);
		logger.info("DL Name field is filled.");
		linkFromNetsuitePageObject.inputCemEmail(cemEmail);
		logger.info("DL Name field is filled.");
	}
}
