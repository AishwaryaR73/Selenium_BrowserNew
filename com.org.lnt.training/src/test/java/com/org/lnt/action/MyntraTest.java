package com.org.lnt.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraTest {
	WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void open() throws InterruptedException {
		Thread.sleep(4000);
//		WebDriverWait wait=new WebDriverWait(driver, 50);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[contains(@class,'image-image undefined image-hand')])[20]")));
		WebElement winterWear=driver.findElement(By.cssSelector("img.image-image.undefined.image-hand"));
		JavascriptExecutor Js=(JavascriptExecutor)driver;
		Js.executeScript("arguments[0].scrollIntoView();", winterWear);
		Js.executeScript("arguments[0].click();", winterWear);
		System.out.println("The page title is:"+driver.getTitle());
		//winterWear.click();
	}
	@AfterClass
	public void close() {
		driver.quit();
	}

}
