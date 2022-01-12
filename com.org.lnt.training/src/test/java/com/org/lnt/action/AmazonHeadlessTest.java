package com.org.lnt.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonHeadlessTest {
	WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		// driver=new ChromeDriver();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		driver = new ChromeDriver(option);
	}

	@Test
	public void launch() {
		driver.get("https://www.amazon.com/");
		System.out.println("The page title is :" + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Amazon"));
	}

	@AfterClass
	public void close() {
		driver.quit();
	}

}
