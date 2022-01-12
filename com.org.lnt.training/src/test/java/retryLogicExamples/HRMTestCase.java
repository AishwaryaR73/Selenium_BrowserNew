package retryLogicExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HRMTestCase extends BaseClassHRM {
	@Test(priority = 1)
	public void login() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
	}

	@Test(priority = 2)
	public void dashboarDisplay() {
		Assert.assertTrue(driver.findElement(By.xpath("//h1")).isDisplayed(), "Verification of dashboard get failed");

	}

	@Test(priority = 3)
	public void logout() {
		driver.findElement(By.id("welcome")).click();

		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));

	}

}
