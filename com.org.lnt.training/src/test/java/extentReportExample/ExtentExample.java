package extentReportExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExtentExample extends ExtentBaseClass {
	Logger log;

	@Test(priority = 0)
	public void verifyTitle() {
		log = Logger.getLogger("LT_Logger");
		PropertyConfigurator.configure(".//testData//log4j.properties");
		log.info("Verify the Nop title");
		logger = extent.createTest("To verify NOP comm Application Title");
		System.out.println("The page title is:" + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Your store. Login");
	}
	
	@Test(priority = 1)
	public void verifyLogin() throws Exception {
		logger = extent.createTest("To verify Login feature");
		System.out.println("The page title is:" + driver.getTitle());
		log.info("Clear the email text");
		driver.findElement(By.name("Email")).clear();
		log.info("Enter the email");
		driver.findElement(By.name("Email")).sendKeys(prop.getProperty("Nop_username"));
		log.info("Clear the password text");
		driver.findElement(By.name("Password")).clear();
		log.info("Enter the password");
		driver.findElement(By.name("Password")).sendKeys(prop.getProperty("Nop_pwd"));
		log.info("Click on submit button");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Test(priority = 2)
	public void verifyLogout() {
		logger = extent.createTest("To verify Logout feature");
		driver.findElement(By.xpath("")).click();
	}
}
