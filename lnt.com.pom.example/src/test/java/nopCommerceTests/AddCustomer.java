package nopCommerceTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCustomer extends BaseTest {
	@Test(priority = 0)
	public void loginCusts() throws Exception {
		log.info("Home page is launched");
		lp.loginAll(prop.getProperty("username"), prop.getProperty("password"));
		searchcust.searchTheCustomer();
	}

	@Test(priority = 1)
	public void addCustomerDetails() throws InterruptedException {
		log.info("Click on Add New button");
		addCust.clickAdd();
		log.info("Enter Email Id");
		String randomEmail = randomString() + "@gmail.com";
		addCust.addEmail(randomEmail);
		System.out.println(randomEmail);
		log.info("Enter password ");
		addCust.addPwd(prop.getProperty("password"));
		log.info("Enter first name");
		addCust.addFn(prop.getProperty("fn"));
		log.info("Enter last name");
		addCust.addLn(prop.getProperty("ln"));
		log.info("Enter comapny name");
		addCust.addCompany(prop.getProperty("compnay"));
		log.info("Click on save button");
		addCust.saveCust();
		//Object message = addCust.sucessMessage();
		System.out.println("the message"+ addCust.sucessMessage());
		Assert.assertTrue(addCust.sucessMessage().contains("customer"), "User is not added");
		
	}

	@Test(priority = 2)
	public void logout() {
		lp.logoutAll();

	}

}
