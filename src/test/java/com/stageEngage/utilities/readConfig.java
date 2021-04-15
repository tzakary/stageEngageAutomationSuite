package com.stageEngage.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {
	
	Properties props;
	
	public readConfig() {
		File source = new File("./Configuration/config.properties");
		try {
			FileInputStream getFile = new FileInputStream(source);
			props = new Properties();
			props.load(getFile);
		} catch (Exception exception) {
			System.out.println("Following exception occured: " + exception.getMessage());
		}
	}
	
	public String getGoogleUser() {
		return props.getProperty("googleUser");
	}
	
	public String getGooglePassword() {
		return props.getProperty("googlePassword");
	}
	
	public String getGoogleURL() {
		return props.getProperty("googleURL");
	}
	
	public String getEngageURL() {
		return props.getProperty("engageURL");
	}
	
	public String getChromeDriverPath() {
		return props.getProperty("chromeDriverPath");
	}
	
	public String getFirefoxDriverPath() {
		return props.getProperty("firefoxDriverPath");
	}
	
	public String getIEDriverPath() {
		return props.getProperty("IEDriverPath");
	}
	
	public String getDlName() {
		return props.getProperty("dlName");
	}
	
	public String getCemName() {
		return props.getProperty("cemName");
	}
	
	public String getClientName() {
		return props.getProperty("clientName");
	}
	
	public String getDlEmail() {
		return props.getProperty("dlEmail");
	}
	
	public String getCemEmail() {
		return props.getProperty("cemEmail");
	}
	
	public String getProjectName() {
		return props.getProperty("projectName");
	}
	
	public String getDlSponsorName() {
		return props.getProperty("dlSponsorName");
	}
	
	public String getDlSponsorEmail() {
		return props.getProperty("dlSponsorEmail");
	}
	
	public String getEhiExemptionReason() {
		return props.getProperty("ehiExemptionReason");
	}
	
	public String getDlEmailWarningEmptyText() {
		return props.getProperty("dlEmailWarningEmptyText");
	}
	
	public String getCemEmailWarningEmptyText() {
		return props.getProperty("cemEmailWarningEmptyText");
	}
	
	public String getInvalidEmailWarningText() {
		return props.getProperty("InvalidEmailWarningText");
	}
}
