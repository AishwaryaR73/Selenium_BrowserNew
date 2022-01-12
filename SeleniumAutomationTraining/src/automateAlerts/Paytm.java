package automateAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paytm {
	WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void open() throws InterruptedException {
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Click here.')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'/v1/api/login')]")));
		System.out.println("The frame is open!!");
		WebElement text = driver.findElement(By.xpath("//h1[contains(text(),'Access Denied')]"));
		System.out.println("The frame text is:" + text.getText());
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[contains(@alt,'close Modal')]")).click();
	}

	@AfterClass
	public void close() {
		driver.close();
	}

}
