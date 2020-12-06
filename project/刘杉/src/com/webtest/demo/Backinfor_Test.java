package com.webtest.demo;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;

public class Backinfor_Test extends BaseTest{
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
		webtest.click("xpath=/html/body/div[1]/div/ul/li[1]/div/button");
		webtest.click("xpath=/html/body/div[1]/div/ul/li[1]/div/ul/li[2]/a");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"left-menu-main\"]/div[6]/div[1]/h4/a");
		webtest.click("xpath=//*[@id=\"collapseSix\"]/div/ul/li/a");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"man\"]");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/form/div[11]/div/button");
		Thread.sleep(1000);
	}
	@Test(priority = 3)
	public void test3() throws InterruptedException {
		webtest.type("xpath=//*[@id=\"email\"]", "111@qq.com");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/form/div[11]/div/button");
		Thread.sleep(1000);
	}
	@Test(priority = 4)
	public void test4() throws InterruptedException {
		webtest.type("xpath=//*[@id=\"phone\"]","139");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/form/div[11]/div/button");
		Thread.sleep(1000);
	}
	@Test(priority = 5)
	public void test5() throws InterruptedException {
		webtest.click("xpath=//*[@id=\"location\"]");
		webtest.click("xpath=//*[@id=\"location\"]/option[3]");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/form/div[11]/div/button");
		Thread.sleep(1000);
	}
	@Test(priority = 6)
	public void test6() throws InterruptedException {
		webtest.click("xpath=//*[@id=\"student\"]");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/form/div[11]/div/button");
		Thread.sleep(1000);
	}
	@Test(priority = 7)
	public void test7() throws InterruptedException {
		webtest.type("xpath=//*[@id=\"detailAddress\"]", "π„÷› –");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/form/div[11]/div/button");
		Thread.sleep(1000);
	}
	@Test(priority = 8)
	public void test8() throws InterruptedException {
		webtest.click("xpath=//*[@id=\"roleIds\"]/option[2]");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/form/div[11]/div/button");
		Thread.sleep(1000);
	}
	@Test(priority = 9)
	public void test9() throws InterruptedException {
		webtest.click("id=teacher");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/form/div[11]/div/button");
		Thread.sleep(1000);
	}
	@Test(priority = 10)
	public void test10() throws InterruptedException {
		webtest.click("id=administrators");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/form/div[11]/div/button");
		Thread.sleep(1000);
	}

}
