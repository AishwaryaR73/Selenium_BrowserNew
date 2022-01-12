package testSteps;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NopAddCustomer extends BaseTest{
	
//	public void setUp() {
//	logger=Logger.getLogger("nopCommerceDemoRun");
//	PropertyConfigurator.configure("log4j.properties");
//}
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		//lp=new LoginPage(driver);
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	   // logger.info("***** The browser is launch ******");
	}

	@When("User add the url as {string}")
	public void user_add_the_url_as(String appUrl) {
	    driver.get(appUrl);
	    driver.manage().window().maximize();
	}

	@Then("User enter the email id as {string} and password as {string}")
	public void user_enter_the_email_id_as_and_password_as(String emails, String pwds) {
	   logger.info("Enter the email id");
	    lp.enterUserName(emails);
	    //logger.info("Enter the password ");
	    lp.enterPassword(pwds);
	}

	@Then("Click on the login button")
	public void click_on_the_login_button() throws Exception {
		logger.info("Click on login button");
	   lp.clickLoginButton();
	}

	@Then("Verify the title as {string}")
	public void verify_the_title_as(String expectedTitle) {
	  logger.info("Verify the title");
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("Click on logout button")
	public void click_on_logout_button() {
		logger.info("Click on logout button");
	   lp.clickLogout();
	}

	@Then("Close the browser")
	public void close_the_browser() {
	   logger.info("***** Close the browser *****");
	   driver.close();
	}

	@Then("Click on customer tab")
	public void click_on_customer_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click on sub customer tab")
	public void click_on_sub_customer_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click on add new button")
	public void click_on_add_new_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Enter the email id")
	public void enter_the_email_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Enter the password")
	public void enter_the_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Enter the first name")
	public void enter_the_first_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Enter the last name")
	public void enter_the_last_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Enter the comapny")
	public void enter_the_comapny() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click on save button")
	public void click_on_save_button() {
	    
	}




}
