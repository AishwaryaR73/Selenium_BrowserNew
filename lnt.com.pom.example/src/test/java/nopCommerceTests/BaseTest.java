package nopCommerceTests;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import nopCommercePages.AddCustomerPage;
import nopCommercePages.LoginPage;
import nopCommercePages.SearchCustomerPage;
import utility.Contants;

public class BaseTest {
	WebDriver driver;
	Properties prop;
	Logger log;
	LoginPage lp;
	AddCustomerPage addCust;
	SearchCustomerPage searchcust;

	public void readConfig() throws IOException {
		String filePath = Contants.Path_PropFile;
		FileInputStream fi = new FileInputStream(filePath);
		prop = new Properties();
		prop.load(fi);

	}

	public static void checkBrokenLink(String linkUrl) {
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
			httpUrlConnection.setConnectTimeout(5000);
			httpUrlConnection.connect();
			if (httpUrlConnection.getResponseCode() >= 400) {
				System.err.println(linkUrl + "----->" + httpUrlConnection.getResponseMessage() + "is broken link");
			} else {
				System.out.println(linkUrl + "----->" + httpUrlConnection.getResponseMessage());
			}
		} catch (Exception e) {

		}
	}

	public String randomString() {
		String generateString = RandomStringUtils.randomAlphanumeric(6);
		return generateString;

	}

	@BeforeClass
	public void openBrowser() throws IOException {
		log = Logger.getLogger("NOPCommerce_log");
		String logFilePath = Contants.Path_log4j;
		PropertyConfigurator.configure(logFilePath);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
		addCust = new AddCustomerPage(driver);
		searchcust=new SearchCustomerPage(driver);

		readConfig();
		driver.manage().window().maximize();
		String webUrl = Contants.URL;
		driver.get(webUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
