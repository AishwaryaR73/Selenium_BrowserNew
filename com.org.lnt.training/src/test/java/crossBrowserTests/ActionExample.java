package crossBrowserTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionExample extends ActionBaseClass {
	
	@Test(priority = 0)
	public void openImg() throws InterruptedException {
			Actions act = new Actions(driver);
			driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame.lazyloaded")));
			System.out.println("Frame is open!!");
			Thread.sleep(3000);
			WebElement source = driver.findElement(By.xpath("//img[contains(@src,'images/high_tatras_min.jpg')]"));
			WebElement target = driver.findElement(By.xpath("//div[contains(@id,'trash')]"));
			Thread.sleep(3000);
			act.dragAndDrop(source, target).build().perform();
			// act.clickAndHold(target).moveToElement(source).release().build().perform();
	}
	@Test(priority = 1)
	public void title() {
		System.out.println("The title is:"+driver.getTitle());
	}

}
