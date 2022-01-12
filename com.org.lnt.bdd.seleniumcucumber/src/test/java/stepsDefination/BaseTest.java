//package stepsDefination;
//
//import java.util.Properties;
//
//import org.apache.commons.lang.RandomStringUtils;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
//import org.openqa.selenium.WebDriver;
//
//import nopPages.AddCustomerPage;
//import nopPages.Constants;
//import nopPages.LoginPage;
//import nopPages.SearchCustomerPage;
//
//public class BaseTest {
//	WebDriver driver;
//	Properties prop;
//	LoginPage lp;
//	SearchCustomerPage searchcust;
//	Logger log;
//	protected AddCustomerPage addCust;
//
//	public static String randomestring() {
//		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
//		return (generatedString1);
//	}
//
//	public void openBrowsers() throws Throwable {
//		Logger log = Logger.getLogger("log1");
//		String logFilePath = Constants.TestData_Path + Constants.logFile_Path;
//		PropertyConfigurator.configure(logFilePath);
//		lp = new LoginPage(driver);
//		searchcust = new SearchCustomerPage(driver);
//		addCust = new AddCustomerPage(driver);
//		driver.get(prop.getProperty("Url"));
//		driver.manage().window().maximize();
//	}
//
//}
