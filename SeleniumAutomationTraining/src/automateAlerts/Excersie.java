package automateAlerts;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Excersie {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver",
//				".\\Alldrivers\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();

	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void test1() {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().setSize(new Dimension(1050, 614));
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.cssSelector(".button-1")).click();
		driver.findElement(By.linkText("Customers")).click();
//		driver.findElement(By.cssSelector(".menu-open .nav-item:nth-child(1) > .nav-link")).click();
//		driver.findElement(By.id("SearchEmail")).click();
//		driver.findElement(By.id("SearchEmail")).sendKeys("a@");
		driver.findElement(By.linkText("Logout")).click();
	}
}
