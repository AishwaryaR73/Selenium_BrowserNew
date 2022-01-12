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

public class FlipkartTest {
	WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void open() throws InterruptedException {
		System.out.println("The page title is:"+driver.getTitle());
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		driver.findElement(By.xpath("//input[contains(@title,'Search for')]")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		WebElement iphone1=driver.findElement(By.xpath("(//span[contains(text(),'8% off')]//ancestor::div[@class='_3pLy-c row']/div/div[@class='_4rR01T'])[1]"));
		JavascriptExecutor Js=(JavascriptExecutor)driver;
		System.out.println("the iphone1 name is:"+iphone1.getText());
		WebElement iphone2=driver.findElement(By.xpath("(//span[contains(text(),'8% off')]//ancestor::div[@class='_3pLy-c row']/div/div[@class='_4rR01T'])[2]"));
		//Js.executeScript("arguments[1].scrollIntoView();", iphone2);
		System.out.println("the iphone1 name is:"+iphone2.getText());
		Js.executeScript("arguments[0].click();", iphone2);
		System.out.println("The page title is:"+driver.getTitle());
		//iphone1.click();
		
		
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}


}
