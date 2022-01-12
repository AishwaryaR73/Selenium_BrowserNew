package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NopCommerce extends NopBaseClass {
	@Test(priority = 1)
	public void login() throws InterruptedException {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(2000);
		String pageTitle = driver.getTitle();
		System.out.println("The page title is:" + pageTitle);
		WebElement username = driver.findElement(By.xpath("//input[@id='Email']"));
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("admin@yourstore.com");
		WebElement password = driver.findElement(By.xpath("//input[contains(@id,'Password')]"));
		password.clear();
		password.sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		String HomePageTitle = driver.getTitle();
		String Expectedtitle="Dashboard / nopCommerce administration.";
		System.out.println("The home page title is:" + HomePageTitle);
		String HomePageUrl = driver.getCurrentUrl();
		System.out.println("The home page title is:" + HomePageUrl);
		Assert.assertEquals(HomePageTitle, Expectedtitle,"the title is same");
		Assert.assertTrue(HomePageTitle==Expectedtitle, "the title is correct");
	}

	@Test(priority = 2)
	public void addUser() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[contains(text(),'Customers')])[1]")).click();
		driver.findElement(By.xpath("(//a[@href='/Admin/Customer/List'])[1]")).click();
		driver.findElement(By.linkText("Add new")).click();
		driver.findElement(By.xpath("//input[contains(@name,'Email')]")).sendKeys("Aishwarya");
		driver.findElement(By.linkText("Logout")).click();
	}

}
