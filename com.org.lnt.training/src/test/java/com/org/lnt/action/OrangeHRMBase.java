package com.org.lnt.action;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMBase {
	WebDriver driver;
	public Properties prop;

	public void readConfig() throws IOException {
		FileInputStream fi = new FileInputStream(".\\testData\\config.properties");
		prop = new Properties();
		prop.load(fi);
	}

	@BeforeClass
	public void open() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		readConfig();
		driver.get(prop.getProperty("Url"));

	}

	@AfterClass
	public void close() {
		driver.quit();

	}

}
