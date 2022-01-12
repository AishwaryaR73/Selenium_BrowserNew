package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OrangeHRM extends OrangeHrmBaseClass {
	@Test
	public void login() throws InterruptedException {
		System.out.println("The page title is:" + driver.getTitle());
		WebElement un = driver.findElement(By.cssSelector("#txtUsername"));
		un.clear();
		un.sendKeys("Admin");
		WebElement pwd = driver.findElement(By.cssSelector("#txtPassword"));
		pwd.clear();
		pwd.sendKeys("admin123");
		driver.findElement(By.cssSelector(".button")).click();
		driver.findElement(By.cssSelector("#MP_link")).click();
		driver.findElement(By.xpath("//a[contains(@id,'menu_dashboard_index')]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(@id,'welcome')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}
}
