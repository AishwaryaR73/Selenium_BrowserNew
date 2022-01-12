package automateAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop extends DragAndDropBaseClass {

	@Test
	public void open() throws InterruptedException {
		driver.get("https://jqueryui.com/droppable/");
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(name);
		// driver.switchTo().frame("frameName");
		System.out.println("Frame is open!!");
		WebElement source = driver.findElement(By.cssSelector("#draggable"));
		WebElement target = driver.findElement(By.cssSelector("#droppable"));
		// act.dragAndDrop(source, target).perform();
		Thread.sleep(2000);
		act.clickAndHold(source).moveToElement(target).release().build().perform();
	}
}
