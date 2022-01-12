package automateAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alert extends BaseClass {
	@Test
	public void login() {
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		WebElement fname = driver.findElement(By.xpath("//input[contains(@name,'fname')]"));
		fname.sendKeys("Aishwarya");
		WebElement checkBike = driver.findElement(By.xpath("//input[contains(@value,'Bi')]"));
		checkBike.click();
		WebElement checkCar = driver.findElement(By.xpath("//input[@value='Car']"));
		checkCar.click();
		WebElement radioF = driver.findElement(By.xpath("//input[contains(@value,'female')]"));
		radioF.click();
	}

}
