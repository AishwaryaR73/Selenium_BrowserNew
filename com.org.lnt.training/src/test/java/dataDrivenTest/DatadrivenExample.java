package dataDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DatadrivenExample {
	WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	}

	@Test(dataProvider = "clientDataValid")
	public void loginTestCase(String user, String pwd) {
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys(user);
		driver.findElement(By.name("txtPassword")).clear();
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		WebElement message = driver.findElement(By.cssSelector("span#spanMessage"));
		Assert.assertEquals(message.getText(), "Invalid credentials");
	}

	@DataProvider(name = "testDataInvalid")
	public Object[][] smoke() {
		Object[][] data = { { "aish@gmail.com", "1232" }, { "2324", "abah@2" }, { "dshj$$", "930[haj" } };
		return data;
	}

	@DataProvider(name = "clientDataValid")
	public Object[][] sanity() {
		Object[][] data = { { "aish@gmail.com", "ahgehage" }, { "2324", "abah@2" }, { "Admin", "admin123" } };
		return data;
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
