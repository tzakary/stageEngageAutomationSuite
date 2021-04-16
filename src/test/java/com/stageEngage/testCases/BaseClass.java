package com.stageEngage.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.stageEngage.utilities.readConfig;

public class BaseClass {
	
	readConfig rConfig = new readConfig();
	
	public String googleUser = rConfig.getGoogleUser();
	public String googlePassword = rConfig.getGooglePassword();
	public String googleURL = rConfig.getGoogleURL();
	public String engageURL = rConfig.getEngageURL();
	public String dlName = rConfig.getDlName();
	public String cemName = rConfig.getCemName();
	public String clientName = rConfig.getClientName();
	public String dlEmail = rConfig.getDlEmail();
	public String cemEmail = rConfig.getCemEmail();
	public String projectName = rConfig.getProjectName();
	public String dlSponsorName = rConfig.getDlSponsorName();
	public String dlSponsorEmail = rConfig.getDlSponsorEmail();
	public String ehiExemptionReason = rConfig.getEhiExemptionReason();
	public String dlEmailWarningEmptyText = rConfig.getDlEmailWarningEmptyText();
	public String cemEmailWarningEmptyText = rConfig.getCemEmailWarningEmptyText();
	public String invalidEmailWarningText = rConfig.getInvalidEmailWarningText();
	
	public static WebDriverWait wait;
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void start(String browserPath){
		
		if (browserPath.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", rConfig.getChromeDriverPath());
			driver = new ChromeDriver();
		}
		else if (browserPath.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", rConfig.getFirefoxDriverPath());
			driver = new FirefoxDriver();
		}
		else if (browserPath.equals("ie")) {
			System.setProperty("webdriver.chrome.driver", rConfig.getIEDriverPath());
			driver = new InternetExplorerDriver();
		}
		
		wait = new WebDriverWait(driver, 240);
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger("EngageAutomation");
		
	}
	
	@AfterClass
	public void end() {
		driver.quit();
	}
}
