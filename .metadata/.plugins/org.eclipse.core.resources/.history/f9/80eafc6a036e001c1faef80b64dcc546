package nopTests;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import nopPages.AddCustomerPage;
import nopPages.LoginPage;
import nopPages.SearchCustomerPage;
import nopUtility.Constants;

public class BaseTest {
	WebDriver driver;
	Properties prop;
	LoginPage lp;
	SearchCustomerPage searchcust;
	AddCustomerPage addCust;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	Logger log;

	public void readConfig() throws Throwable {
		 String filePath = Constants.PropertyFile_Path;
		FileInputStream fi = new FileInputStream(filePath);
		prop = new Properties();
		prop.load(fi);
	}

	
	public static String randomestring(){
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
		}
	@BeforeClass
	public void openBrowser() throws Throwable {
		log = Logger.getLogger("log1");
		String logFilePath=Constants.TestData_Path+Constants.logFile_Path;
		PropertyConfigurator.configure(logFilePath);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
		searchcust = new SearchCustomerPage(driver);
		addCust=new AddCustomerPage(driver);
		readConfig();
		driver.get(prop.getProperty("Url"));
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	}
