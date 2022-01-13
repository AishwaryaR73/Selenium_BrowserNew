package swagLabsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test(priority = 1)
	public void loginApp() {
		log.info("Enter username");
		lp.enterUsername(prop.getProperty("username"));
		log.info("Enter password");
		lp.enterPassword(prop.getProperty("password"));
		log.info("Click on login button");
		lp.clickLoginBtn();
		log.info("Verify the page title");
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
	}
		@Test(priority = 2)
		public void chcek() throws InterruptedException {
		log.info("Select A to Z dropdown");
		Assert.assertTrue(lp.dropdownAtoZ(), "[NAME (A TO Z)]");
		Select select = new Select(driver.findElement(By.xpath("//select[contains(@class,'product_sort_container')]")));
		log.info("Select sub  A to Z dropdown");
		select.selectByValue("az");
		System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
		log.info("Select Z to A dropdown");
		select.selectByValue("za");
		log.info("Select Price Low to High dropdown");
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='admin@yourStore.com']"))
		
		
		
	}

}
