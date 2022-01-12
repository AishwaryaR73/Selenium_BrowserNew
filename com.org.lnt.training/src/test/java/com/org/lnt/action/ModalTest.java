package com.org.lnt.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ModalTest {
	WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestpractice.com/Students/Switchto");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void click() {
		driver.findElement(By.xpath("//button[contains(text(),' Launch modal')] ")).click();
		WebElement headerText = driver.findElement(By.xpath("//h4[contains(@class,'modal-title')]"));
		System.out.println("The header text is:" + headerText.getText());
		WebElement headerBody = driver.findElement(By.xpath("//div[contains(@class,'modal-body')]"));
		System.out.println("The header body text is:" + headerBody.getText());
		driver.findElement(By.xpath("//button[contains(text(),'Ok')] ")).click();

	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
