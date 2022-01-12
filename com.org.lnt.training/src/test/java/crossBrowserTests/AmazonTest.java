package crossBrowserTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
//import org.testng.internal.Arguments;

public class AmazonTest extends AmazonBaseClass {

	@Test(priority = 1)
	public void open() throws InterruptedException {
		Thread.sleep(2000);
		WebElement laptops = driver.findElement(By.xpath("(//div[contains(@class,'a-cardui-header')])[20]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].scrollIntoView()", laptops);
		System.out.println("The festive text:" + laptops.getText());
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//a[contains(@class,'a-link-normal see-more truncate-1line')])[16]")));
		WebElement pet = driver
				.findElement(By.xpath("(//a[contains(@class,'a-link-normal see-more truncate-1line')])[16]"));
		pet.click();
		System.out.println("the page title is:" + driver.getTitle());

	}

	@Test(priority = 2)
	public void getTitle() {
		System.out.println("the page title is:" + driver.getTitle());
	}

}
