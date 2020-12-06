package com.webtest.demo;

import java.io.IOException;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;

public class FrontTest extends BaseTest{
	@DataProvider(name = "login")
	public Object[][] searchTeatDemo() throws IOException{
		ExcelDataProvider data=new ExcelDataProvider();
		return data.getTestData("D:\\SpringbootDemo","sheet.xls", "Sheet1");
	}

	@Test(dataProvider = "login",priority = 1)
	public void testLogin(String username,String password) throws InterruptedException {
		
		webtest.open("http://localhost:8089");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"header_ul\"]/li[3]/a");
		
		webtest.type("id=username", username);
		Thread.sleep(2000);
		webtest.type("id=password", password);
		Thread.sleep(2000);
		webtest.click("id=loginButton");
	}
	
	@Test(priority = 2)
	public void btnclick() throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		Actions actions=new Actions(driver);
		webtest.click("xpath=/html/body/div[2]/div[2]/ul/li[6]/a");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0, 300)");
//		actions.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]"))).perform();
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[1]/a/img");
//		actions.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[2]/div[4]"))).click().perform();
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0, 300)");

	}
	@Test(priority = 3)
	public void addtest() throws InterruptedException {
		webtest.click("xpath=//*[@id=\"num_add\"]");
		Thread.sleep(2000);
	}

}
