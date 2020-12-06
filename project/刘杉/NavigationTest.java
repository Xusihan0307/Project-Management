package com.webtest.demo;

import java.io.IOException;

import org.openqa.selenium.interactions.ClickAction;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;

public class NavigationTest extends BaseTest{
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
	public void test2() throws InterruptedException {
		webtest.click("xpath=//*[@id=\"6\"]/a");
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[2]/p[1]/a");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/div[3]/div[2]/div[2]/span[1]/a[1]");
		Thread.sleep(1000);
	}
	@Test(priority = 3)
	public void test3() throws InterruptedException {
		webtest.open("http://localhost:8089/index/category/6");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[1]/p[1]/a");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/div[3]/div[2]/div[2]/span[2]/a");
		Thread.sleep(1000);
		
	}
	@Test(priority = 4)
	public void test4() throws InterruptedException {
		webtest.open("http://localhost:8089/index/category/6");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"book_comment\"]/a");
	}
	@Test(priority = 5)
	public void test5() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[3]/div[2]/div[4]/div[3]/a");
		Thread.sleep(1000);
		webtest.type("id=address", "π„÷›");
		Thread.sleep(1000);
		webtest.click("//*[@id=\"checkout_btn\"]");
		Thread.sleep(1000);
	}
	@Test(priority = 6)
	public void test6() throws InterruptedException {
		webtest.click("xpath=/html/body/div[2]/div[2]/a[2]");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"order_item1274496940350038\"]/td[6]/button[2]");
	}

}
