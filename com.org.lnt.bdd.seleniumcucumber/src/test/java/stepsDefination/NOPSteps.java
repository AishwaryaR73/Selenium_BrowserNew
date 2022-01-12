package stepsDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NOPSteps {
	WebDriver driver;

	@Given("User launch the browser")
	public void user_launch_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@When("User open  the url {string}")
	public void user_open_the_url(String appUrl) {
		driver.get(appUrl);
		driver.manage().window().maximize();

	}

	@When("User enters email id as {string} and password as {string}")
	public void user_enters_email_id_as_and_password_as(String email, String pwd) {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys(pwd);
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Then("The page title should be {string}")
	public void the_page_title_should_be(String expectTitle) {
		System.out.println("the title is:" + driver.getTitle());
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectTitle, actualTitle);

	}

	@When("User click on logout button")
	public void user_click_on_logout_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
	}

	@Then("Close the browser")
	public void close_the_browser() {
		driver.close();
	}

}
