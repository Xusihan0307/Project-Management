package com.webtest.demo;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;

public class ListTest extends BaseTest{
	@DataProvider(name = "login")
	public Object[][] searchTeatDemo() throws IOException{
		ExcelDataProvider data=new ExcelDataProvider();
		return data.getTestData("D:\\SpringbootDemo","sheet.xls", "Sheet1");
	}

	@Test(dataProvider = "login",priority = 1)
	public void testLogin(String username,String password) throws InterruptedException {
		
		webtest.open("http://localhost:8089");
		Thread.sleep(1000);
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
		webtest.enterFrame(0);
		webtest.enterFrame("leftFrame");
		webtest.click("xpath=//*[@id=\"left-menu-main\"]/div[1]/div[1]/h4/a");
		webtest.click("xpath=//*[@id=\"collapseOne\"]/div/ul/li[2]/a");
		Thread.sleep(1000);
	}
	@Test(priority = 3)
	public void test3() throws InterruptedException {
		webtest.leaveFrame();
		webtest.enterFrame(0);
		webtest.enterFrame("centerFrame");
		webtest.type("id=nickname", "lala");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"storeForm\"]/div[11]/div/button");
		Thread.sleep(1000);
	}
	@Test(priority = 4)
	public void test4() throws InterruptedException {
		webtest.type("id=username", "1");
		Thread.sleep(1000);
		String js="window.scrollTo(0,500);";
		webtest.runJs(js);
		Thread.sleep(1000);
		webtest.mouseToElementandClick("xpath=//*[@id=\"storeForm\"]/div[11]/div/button");
		System.out.println(webtest.getValue("xpath=//*[@id=\"storeForm\"]/div[11]/div/button"));
		webtest.click("xpath=//*[@id=\"storeForm\"]/div[11]/div/button");
		Thread.sleep(1000);
	}
	@Test(priority = 5)
	public void test5() throws InterruptedException {
		webtest.type("id=phone", "19832104171");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"storeForm\"]/div[11]/div/button");
		Thread.sleep(1000);
	}
	@Test(priority = 6)
	public void test6() throws InterruptedException {
		webtest.type("id=email", "409680375@qq.com");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"storeForm\"]/div[11]/div/button");
		Thread.sleep(1000);
	}
	@Test(priority = 7)
	public void test7() {
		webtest.type("detailAddress", "π„÷›");
	}
	@Test(priority = 8)
	public void test8() {
		webtest.click("xpath=//*[@id=\"roleIds\"]/option[1]");
	}
	@Test(priority = 9)
	public void test9() {
		webtest.click("id=worker");
	}

}
