package com.webtest.demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;

public class BackTest extends BaseTest{
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
	public void informationtest() throws InterruptedException {
		webtest.click("xpath=/html/body/div[1]/div/ul/li[1]/div/button");
		webtest.click("xpath=/html/body/div[1]/div/ul/li[1]/div/ul/li[2]/a");
		Thread.sleep(1000);
		
	}
	@Test(priority = 2)
	public void changetest() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.getWindow(0);
		String handle = driver.getWindowHandle();
		driver.switchTo().window(handle);
//		webtest.click("xpath=//*[@id=\"left-menu-main\"]/div[6]/div[1]/h4/a");
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"left-menu-main\"]/div[6]/div[1]/h4/a"));
		System.out.println(ele);
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"collapseSix\"]/div/ul/li/a");
		Thread.sleep(1000);
		webtest.type("id=nickname", "aa");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/form/div[11]/div/button");
		Thread.sleep(1000);
	}

}
