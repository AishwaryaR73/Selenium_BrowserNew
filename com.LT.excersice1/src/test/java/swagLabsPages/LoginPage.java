package swagLabsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver rdriver) {
		this.driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[contains(@id,'user-name')]")
	WebElement txtUsername;
	@FindBy(xpath = "//input[contains(@name,'password')]")
	WebElement txtPwd;
	@FindBy(css =  "#login-button")
	WebElement btnLogin;
	@FindBy(xpath =  "//span[contains(text(),'Name (A to Z)')]")
	WebElement dropAtoZ;
	public void enterUsername(String un)
	{
		txtUsername.sendKeys(un);
	}
	public void enterPassword(String pwd)
	{
		txtPwd.sendKeys(pwd);
	}
	public void clickLoginBtn()
	{
		
		btnLogin.click();
	}
	public boolean dropdownAtoZ()
	{
		return dropAtoZ.isDisplayed();
		
	}
	
}
