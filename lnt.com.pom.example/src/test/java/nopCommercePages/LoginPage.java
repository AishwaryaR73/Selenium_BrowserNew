package nopCommercePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility.Contants;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver rdriver) {
		this.driver = rdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	WebElement txtUsername;
	@FindBy(name = "Password")
	WebElement txtPassword;
	@FindBy(xpath = "//button[contains(@type,'submit')]")
	WebElement clickLogin;
	@FindBy(xpath = "//a[contains(@href,'logout')]")
	WebElement clickLogout;
	@FindBy(xpath="(//img[contains(@alt,'logo.png')])[2]")
	WebElement logoimg;

	public String getUn(String un) {
		txtUsername.clear();
		txtUsername.sendKeys(un);
		return un;
	}

	public String getpwd(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
		return pwd;
	}

	public void clickLoginButton() {
		clickLogin.click();

	}
	public void clickLogoutButton() {
		clickLogout.click();
		Assert.assertEquals(driver.getTitle(), Contants.expectedTitle);
}
	public boolean imgLogoDisplay() {
		return logoimg.isDisplayed();
}
	public void loginAll(String username,String password) {
		getUn(username);
		getpwd(password);
		clickLoginButton();
	}
	public void logoutAll() {
		clickLogoutButton();
	}
	}
