//package stepsDefination;
//
//import org.apache.commons.lang.RandomStringUtils;
//import org.apache.commons.logging.Log;
//import org.apache.log4j.Logger;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class CustomerSteps  extends BaseTest{
//	WebDriver driver;
//	public static String randomestring(){
//		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
//		return (generatedString1);
//		}
//	@Given("User launch the browser")
//	public void user_launch_the_browser() {
//		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//	   
//	}
//
//	@When("User open  the url {string}")
//	public void user_open_the_url(String appUrl) {
//		driver.get(appUrl);
////		//fo("*** Application gets launch ***");
//		driver.manage().window().maximize();
//	}
//
//	@When("User enters email id as {string} and password as {string}")
//	public void user_enters_email_id_as_and_password_as(String email, String pwd) {
//		driver.findElement(By.id("Email")).clear();
//		//fo("Clear the email text");
//		driver.findElement(By.id("Email")).sendKeys(email);
//		//fo("Enter the email");
//		driver.findElement(By.name("Password")).clear();
//		//fo("Clear the password text");
//		driver.findElement(By.name("Password")).sendKeys(pwd);
//		//fo("Enter the password");
//	}
//
//	@When("Click on login button")
//	public void click_on_login_button() {
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		//fo("Click on login button");
//	}
//
//	@Then("The page title should be {string}")
//	public void the_page_title_should_be(String expectTitle) {
//		System.out.println("the title is:" + driver.getTitle());
//		String actualTitle = driver.getTitle();
//		Assert.assertEquals(expectTitle, actualTitle);
//	}
//
//	@Then("Click on logout button")
//	public void click_on_logout_button() {
//		driver.findElement(By.linkText("Logout")).click();
//		//fo("Click on logout button");
//	}
//
//	@Then("Close the browser")
//	public void close_the_browser() {
//	    driver.close();
//	    //fo("***Browser is close****");
//	}
//
//	@When("User click on login button")
//	public void user_click_on_login_button() {
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		//fo("Click login button");
//	}
//
//	@Then("User click on customer tab")
//	public void user_click_on_customer_tab() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//p[contains(text(),'Customers')])[1]")).click();
//		//fo("Click on customer tab");
//	}
//
//	@Then("User click on sub customer tab")
//	public void user_click_on_sub_customer_tab() throws InterruptedException {
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//p[text()=' Customers']")).click();
//		//fo("Click on sub customer tab");
//		//driver.findElement(By.xpath("//a[@href='/Admin/Customer/List'])[1]")).click();
//	}
//
//	@Then("User click on add new button")
//	public void user_click_on_add_new_button() {
//	   driver.findElement(By.linkText("Add new")).click();
//	   //fo("Click on add new button");
//	}
//
//	@Then("Enter email id")
//	public void enter_email_id() {
//		String randomEmail = randomestring() + "@gmail.com";
//	   driver.findElement(By.id("Email")).sendKeys(randomEmail);
//	   //fo("Enter email id");
//	}
//
//	@Then("Enter password")
//	public void enter_password() {
//		 driver.findElement(By.id("Password")).sendKeys("ais3422");
//		 //fo("Enter password");
//	}
//
//	@Then("Enter first name")
//	public void enter_first_name() {
//		driver.findElement(By.id("FirstName")).sendKeys("Aishwarya");
//		//fo("Enter first name");
//	}
//
//	@Then("Enter last name")
//	public void enter_last_name() {
//		driver.findElement(By.id("LastName")).sendKeys("Rahate");
//		//fo("Enter last name");
//	}
//
//	@Then("Enter comapny name")
//	public void enter_comapny_name() {
//		driver.findElement(By.id("Company")).sendKeys("LNNT");
//		//fo("Enter company name");
//	}
//
//	@Then("Click on save button")
//	public void click_on_save_button() {
//		driver.findElement(By.name("save")).click();
//		//fo("Click on save button");
//	}
//
//
//
//}
