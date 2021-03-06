package com.org.lnt.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calculator {
	WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://juliemr.github.io/protractor-demo/");
	}

	@Test
	public void oneDigit() throws InterruptedException {
		driver.findElement(By.cssSelector("input[ng-model='first']")).sendKeys("1");
		driver.findElement(By.cssSelector("input[ng-model='second']")).sendKeys("8");
		driver.findElement(By.cssSelector("#gobutton")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.cssSelector(".ng-binding")).getText(), "9");
	}

	@Test
	public void twoDigit() throws InterruptedException {
		driver.findElement(By.cssSelector("input[ng-model='first']")).sendKeys("10");
		driver.findElement(By.cssSelector("input[ng-model='second']")).sendKeys("40");
		driver.findElement(By.cssSelector("#gobutton")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.cssSelector(".ng-binding")).getText(), "50");
	}

	@Test
	public void threeDigit() throws InterruptedException {
		driver.findElement(By.cssSelector("input[ng-model='first']")).sendKeys("108");
		driver.findElement(By.cssSelector("input[ng-model='second']")).sendKeys("407");
		driver.findElement(By.cssSelector("#gobutton")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.cssSelector(".ng-binding")).getText(), "515");
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
