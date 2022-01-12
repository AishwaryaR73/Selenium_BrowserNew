package automateAlerts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertBoxExample extends BaseClass {
	@Test(priority = 1)
	public void alertClick() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Show Me Confirmation')]")).click();
		Alert alertBox = driver.switchTo().alert();
		System.out.println("The alert box message is:" + alertBox.getText());
		assertTrue(alertBox.getText().contains("or"), "the message is right!!");
		Thread.sleep(2000);
		alertBox.accept();
	String text=driver.findElement(By.cssSelector("#demo")).getText();
	System.out.println("the text message is :"+text);
	Assert.assertTrue(text.contains("OK"),"the validation is:");
	}

	@Test(priority = 2)
	public void showMeAlert() throws InterruptedException {
		driver.findElement(By.xpath("(//input[contains(@type,'button')])[3]")).click();
		Alert showMeBox = driver.switchTo().alert();
		System.out.println("The show me alert box message is:" + showMeBox.getText());
		Thread.sleep(2000);
		showMeBox.accept();
	}

	@Test(priority = 3)
	public void showMePrompt() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
		Alert showMePromptAlert = driver.switchTo().alert();
		System.out.println("The show me alert box message is:" + showMePromptAlert.getText());
		Thread.sleep(2000);
		showMePromptAlert.sendKeys("Aishwarya");
		Thread.sleep(2000);
		showMePromptAlert.dismiss();
	}

}
