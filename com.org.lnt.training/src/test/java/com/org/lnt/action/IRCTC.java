package com.org.lnt.action;

import java.util.Set;
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

public class IRCTC {
	WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		// driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void launch() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[contains(@class,'fa fa-align-justify')])[1]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'HOTELS')])[1]")).click();
		Set<String> allWindow = driver.getWindowHandles();
		String main = (String) allWindow.toArray()[0];
		System.out.print("\n main window handle code = " + allWindow.toArray()[0]);
		Thread.sleep(3000);
		String hotel = (String) allWindow.toArray()[1];
		System.out.print("\n hotel window handle code = " + allWindow.toArray()[1]);
		driver.switchTo().window(hotel);
		WebElement loginHotel = driver.findElement(By.xpath("(//a[contains(@class,'nav-link')])[2]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].click();", loginHotel);
		driver.findElement(By.xpath("(//button[contains(@type,'button')])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().window(main);
		driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@class,'fa fa-window-close pull-right')]")).click();
		System.out.println("\n the page title is:" + driver.getTitle());
		WebElement holidayText = driver.findElement(By.xpath("//label[contains(text(),'HOLIDAY PACKAGES')]"));
		System.out.println("\n The hoilday text is:" + holidayText.getText());
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
