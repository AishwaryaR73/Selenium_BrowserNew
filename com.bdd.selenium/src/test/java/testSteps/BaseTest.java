package testSteps;

import java.util.Properties;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import nopCommercePages.AddCustomerPage;
import nopCommercePages.LoginPage;

public class BaseTest {
	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage addCust;
	// public SearchCustomerPage searchCust;
	public static Logger logger;
	public Properties configProp;
	
	public void  alldata() {
		logger=Logger.getLogger("nopCommerceDemoRun");
		PropertyConfigurator.configure("log4j.properties");
		lp=new LoginPage(driver);
		
	}
	// Created for generating random string for Unique email
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
	/*
	 * WebDriver driver; Properties prop; LoginPage lp; // SearchCustomerPage
	 * searchcust; AddCustomerPage addCust;
	 * 
	 * Logger log; public void openBrowser() throws Throwable { log =
	 * Logger.getLogger("log1"); String logFilePath = Constants.TestData_Path +
	 * Constants.logFile_Path; PropertyConfigurator.configure(logFilePath); //
	 * WebDriverManager.chromedriver().setup(); // driver = new ChromeDriver(); lp =
	 * new LoginPage(driver); // searchcust = new SearchCustomerPage(driver);
	 * addCust = new AddCustomerPage(driver); readConfig();
	 * driver.get(prop.getProperty("Url")); driver.manage().window().maximize(); }
	 * 
	 * public void readConfig() throws Throwable { String filePath =
	 * Constants.PropertyFile_Path; FileInputStream fi = new
	 * FileInputStream(filePath); prop = new Properties(); prop.load(fi); }
	 * 
	 * public static String randomestring() { String generatedString1 =
	 * RandomStringUtils.randomAlphabetic(6); // String generatedString1 =
	 * RandomStringUtils.randomAlphabetic(5); return (generatedString1); }
	 * 
	 * 
	 */

}
