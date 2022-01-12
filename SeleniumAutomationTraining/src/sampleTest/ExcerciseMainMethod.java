package sampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcerciseMainMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
//		System.setProperty("webdriver.chrome.driver",
//				".\\Alldrivers\\chromedriver.exe");
//		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().setSize(new Dimension(1050, 614));
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.cssSelector(".button-1")).click();
		driver.findElement(By.linkText("Customers")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".menu-open .nav-item:nth-child(1) > .nav-link")).click();
		driver.findElement(By.id("SearchEmail")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("SearchEmail")).sendKeys("aura@gmail.com");
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}

}
