package com.org.lnt.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMScreenShot {
	WebDriver driver;

	@BeforeClass

	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--headless");
//		driver = new ChromeDriver(option);
	}

	@Test
	public void launch() throws IOException {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println("The page title is :" + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Orange"));
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		scrrenShot();
	}

	public void scrrenShot() throws IOException {
		File fileSource = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File fileDestination = new File(".//Screenshots/ss1.png");
		FileUtils.copyFile(fileSource, fileDestination);
	}

	@AfterClass
	public void close() {
		driver.quit();
	}
}
