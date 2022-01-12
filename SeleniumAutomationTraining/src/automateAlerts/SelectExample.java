package automateAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectExample extends BaseClass {
	@Test
	public void selectPath() throws Exception {
		WebElement llistBox=driver.findElement(By.xpath("//select[1]"));
		Select list=new Select(llistBox);
		//System.out.println("is listbox select multiple selection:"+list.isMultiple());
		//Assert.assertTrue(list.isMultiple());
		//Assert.assertFalse(list.isMultiple(),"validation of multiple selection gets failed");
		Thread.sleep(2000);
		//list.selectByIndex(2);
		list.selectByValue("Singapore");
		//list.selectByVisibleText("Saab");
	}
	@Test(priority = 1)
	public  void select() throws InterruptedException {
		WebElement list1=driver.findElement(By.xpath("(//select)[2]"));
		//WebElement list1=driver.findElement(By.xpath("//select[contains(@name,'From')]"));
		Select listNew=new Select(list1);
		Thread.sleep(2000);
		listNew.selectByIndex(4);//India
		Thread.sleep(2000);
		listNew.selectByValue("Mexico");
		Thread.sleep(2000);
		listNew.selectByVisibleText("Italy");
		Thread.sleep(2000);
		listNew.deselectByIndex(4);
		Thread.sleep(2000);
		listNew.deselectAll();
		
	}

}
