package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample {
	WebDriver driver;
	@BeforeClass
	public void login() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
	}
	@Test
	public void open() {
		Actions act=new Actions(driver);
		WebElement fn=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(fn);
		System.out.println("Frame is open");
		WebElement drag=driver.findElement(By.cssSelector("#draggable"));
		WebElement d=driver.findElement(By.cssSelector("#droppable"));
		//act.dragAndDrop(drag, d).build().perform();
		act.click(drag).moveToElement(d).build().perform();	
	}

	@AfterClass
	public void close() {
		driver.close();
	}
}
