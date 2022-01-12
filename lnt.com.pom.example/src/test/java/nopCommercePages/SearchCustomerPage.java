package nopCommercePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchCustomerPage {
	WebDriver driver;

	public SearchCustomerPage(WebDriver rdriver) {
		this.driver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "(//p[contains(text(),'Customers')])[1]")
	WebElement clickOnCustomer;

	@FindBy(xpath = "(//a[@href='/Admin/Customer/List'])[1]")
	WebElement clickOnSubCustomer;
	@FindBy(xpath="//div[contains(text(),'Search')]")
	WebElement clickSearchtext;

	@FindBy(name =  "SearchEmail")
	WebElement searchemail;
	
	@FindBy(css = "button#search-customers")
	WebElement searchClick;

	public void clickCustomer() {
		clickOnCustomer.click();
	}

	public void clickSubCustomers() {
		clickOnSubCustomer.click();
	}
	public void clickSearchText() {
		clickSearchtext.click();
	}

	public void searchCust(String un) {
		searchemail.sendKeys(un);
	}

	public void clickSearchcust() {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(searchClick));
		
		searchClick.click();
	}
	public void searchTheCustomer() {
		clickCustomer();
		clickSubCustomers();
	}
}
