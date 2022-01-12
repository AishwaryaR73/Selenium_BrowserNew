package automateAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon extends BaseClass {
	//@Test(priority = 1)
	public void click() {
		String ActualPageTitle = driver.getTitle();
		String ExpectedPageTitle = "Amazon.com. Spend less. Smile more.";
		System.out.println("The page title is :" + ActualPageTitle);
		Assert.assertEquals(ActualPageTitle, ExpectedPageTitle);
		WebElement account = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		Actions act = new Actions(driver);
		act.moveToElement(account).build().perform();
		WebElement wishlist = driver.findElement(By.xpath("//span[contains(text(),'Create a List')]"));
		wishlist.click();
	}

	//@Test(priority = 2)
	public void clickOnWishlist() {
		WebElement account = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		Actions act = new Actions(driver);
		WebElement wishlist = driver.findElement(By.xpath("//span[contains(text(),'Create a List')]"));
		act.moveToElement(account).moveToElement(wishlist).click().build().perform();
		String acctualWishlistTitle = driver.getTitle();
		System.out.println("The wishlist page title is:" + acctualWishlistTitle);
		String expectedWishlistTitle = "Your List";
		Assert.assertEquals(expectedWishlistTitle, acctualWishlistTitle);
		Assert.assertTrue(acctualWishlistTitle.contains(expectedWishlistTitle));
	}
	//@Test(priority = 3)
	public void clickOnDeals() {
		driver.get("https://www.amazon.com/");
		WebElement dealsTitle=driver.findElement(By.xpath("//h2[contains(text(),'Deals & Promotions')]"));
		System.out.println("the title is:"+dealsTitle.getText());
		Actions act11 = new Actions(driver);
		WebElement deals = driver.findElement(By.xpath("//img[contains(@alt,'Deals & Promotions')]"));
		act11.moveToElement(deals).click().build().perform();
		String acctualDealsPageTitle = driver.getTitle();
		System.out.println("The deals page title is:" + acctualDealsPageTitle);
		String expectedDealsPageTitle = "Amazon.com - Epic Daily Deals";
		Assert.assertEquals(acctualDealsPageTitle, expectedDealsPageTitle);
		Assert.assertTrue(acctualDealsPageTitle.contains("Deals"));
	}
	@Test(priority = 4)
	public void clickOnElectroniGifts() throws Throwable {
		//driver.get("https://www.amazon.com/");
		//driver.navigate().back();
		WebElement ElectronTitle=driver.findElement(By.xpath("(//img[contains(@alt,'Electronic Gifts')])[1]"));
		String expectedTitle="Amazon.com: Electronics Gift Guide";
		Actions act = new Actions(driver);
		//act.moveToElement(ElectronTitle).doubleClick().build().perform();
		//act.moveToElement(ElectronTitle).click().build().perform();
		act.click(ElectronTitle).perform();
		Thread.sleep(2000);
		String electronicTitle=driver.getTitle();
		System.out.println("The page title is:"+electronicTitle);
		Assert.assertEquals(electronicTitle,expectedTitle);
	
		

}
}