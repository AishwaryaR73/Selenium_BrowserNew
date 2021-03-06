package nopCommerceTests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrokenLinks extends BaseTest {
	WebDriver driver;

	@Test
	public void links() {
		log.info("Home page is open");
		//lp.loginAll(prop.getProperty("username"), prop.getProperty("password"));
		List<WebElement> links = driver.findElements(By.tagName("href"));
		System.out.println("Number of links" + links.size());
		List<String> urlList = new ArrayList<String>();
		for (WebElement e : links) {
			String url = e.getAttribute("href");
			urlList.add(url);

		}
		long stTime = System.currentTimeMillis();
		urlList.parallelStream().forEach(e -> checkBrokenLink(e));
		long endTime = System.currentTimeMillis();
		System.out.println("total time taken:" + (endTime - stTime));
		//driver.quit();
	}

}