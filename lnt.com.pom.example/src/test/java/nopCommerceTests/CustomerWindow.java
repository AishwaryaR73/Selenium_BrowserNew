package nopCommerceTests;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CustomerWindow extends BaseTest {
	@Test
	public void window() throws InterruptedException {
		log.info("Home page is launch");
		lp.loginAll(prop.getProperty("username"), prop.getProperty("password"));
		driver.findElement(By.xpath("(//p[contains(text(),'Customers')])[1]")).click();
		driver.findElement(By.xpath("//p[contains(text(),' Online customers')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'online customers')]")).click();
		Set<String> allWindow = driver.getWindowHandles();
		String main = (String) allWindow.toArray()[0];
		System.out.print("\n main window handle code = " + allWindow.toArray()[0]);
		Thread.sleep(3000);
		String customer = (String) allWindow.toArray()[1];
		System.out.print("\n hotel window handle code = " + allWindow.toArray()[1]);
		driver.switchTo().window(customer);
		lp.clickLogoutButton();
		
	}

}
