package nopCommerceTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.Contants;

public class LoginTest extends BaseTest {
	
	@Test
	public void data() {
		log.info("Enter username");
		lp.getUn(prop.getProperty("username"));
		log.info("Enter password");
		lp.getpwd(prop.getProperty("password"));
		log.info("Click on login button");
		lp.clickLoginButton();
		log.info("Verifying the home page logo img");
		Assert.assertTrue(lp.imgLogoDisplay(), "Validation of application logo");
		log.info("Verifying the home page title");
		System.out.println("The page title is:"+driver.getTitle());
		log.info("Click on logout button and verify the page title");
		lp.clickLogoutButton();
		
		
	}

}
