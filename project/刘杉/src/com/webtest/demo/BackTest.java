package com.webtest.demo;

import java.io.IOException;

import org.apache.poi.ss.formula.functions.T;
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
		webtest.enterFrame(0);
		webtest.enterFrame("leftFrame");
		webtest.click("xpath=//*[@id=\"left-menu-main\"]/div[1]/div[1]/h4/a");
		webtest.click("xpath=//*[@id=\"collapseOne\"]/div/ul/li[1]/a");
		Thread.sleep(1000);
		webtest.leaveFrame();
		webtest.enterFrame(0);
		webtest.enterFrame("centerFrame");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/table/tbody/tr[1]/td[10]/button[1]");
		webtest.alertAccept();
	}
	@Test(priority = 3)
	public void test3() throws InterruptedException {
		webtest.leaveFrame();
		webtest.enterFrame(0);
		webtest.enterFrame("leftFrame");
		webtest.click("xpath=//*[@id=\"left-menu-main\"]/div[2]/div[1]/h4/a");
		webtest.click("xpath=//*[@id=\"collapseTwo\"]/div/ul/li[2]/a");
		webtest.leaveFrame();
		webtest.enterFrame(0);
		webtest.enterFrame("centerFrame");
		Thread.sleep(1000);
		webtest.click("id=storeManagerId");
		webtest.click("xpath=//*[@id=\"storeManagerId\"]/option[2]");
	}
	@Test(priority = 4)
	public void test4() throws InterruptedException {
		webtest.type("id=storeName", "la");
		Thread.sleep(1000);
	}
	@Test(priority = 5)
	public void test5() throws InterruptedException {
		webtest.type("id=storePhoneNum","19832104171");
		Thread.sleep(1000);
	}
	@Test(priority = 6)
	public void test6() throws InterruptedException {
		webtest.type("id=storeTelephone", "031566666");
		Thread.sleep(1000);
	}
	@Test(priority = 7)
	public void test7() throws InterruptedException {
		webtest.type("id=storePosition", "����");
		Thread.sleep(1000);
	}
	@Test(priority = 8)
	public void test8() {
		webtest.click("xpath=//*[@id=\"storeForm\"]/div[6]/div/button");
	}

}
