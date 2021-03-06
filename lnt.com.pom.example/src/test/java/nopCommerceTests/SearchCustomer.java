package nopCommerceTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchCustomer extends BaseTest {

	@Test(priority = 0)
	public void loginCusts() throws Exception {
		lp.loginAll(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 1)
	public void clickCustomer1() throws Exception {
		Thread.sleep(1000);
		log.info("Click on customer tab");
		searchcust.clickCustomer();
	}

	@Test(priority = 2)
	public void clickSubCustomer2() throws InterruptedException {
		Thread.sleep(2000);
		log.info("Click on sub customer tab");
		searchcust.clickSubCustomers();
	}

	@Test(priority = 3)
	public void searchTheCustomer() throws InterruptedException {
		Thread.sleep(4000);
		log.info("Click on search text");
		searchcust.clickSearchText();
		log.info("Enter the email id");
		searchcust.searchCust(prop.getProperty("username"));
		log.info("Click on search button");
		searchcust.clickSearchcust();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='admin@yourStore.com']")));
		WebElement admin = driver.findElement(By.xpath("//td[text()='admin@yourStore.com']"));
		String adminText=driver.findElement(By.xpath("//td[text()='admin@yourStore.com']")).getText();
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].scrollIntoView()", admin);
		log.info("Verify the expected result to the actual result");
		Assert.assertTrue(prop.getProperty("username").contains("admin"), "The data is find");
		Assert.assertEquals(adminText, "admin@yourStore.com");
		
	}
}
