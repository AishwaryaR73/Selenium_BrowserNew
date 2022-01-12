package com.org.lnt.action;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OrangeHRM extends OrangeHRMBase {

	@Test
	public void newData() throws IOException {
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("txtPassword")).sendKeys(prop.getProperty("pwd"));
		driver.findElement(By.id("btnLogin")).click();
	}
}
