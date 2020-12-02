package com.webtest.demo;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;

public class Frontfairy_Test extends BaseTest{
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
		webtest.click("xpath=/html/body/div[4]/div[1]/div[1]/ul/li[6]/a");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/div[3]/div/ul/li[1]/div/p/a[1]");
		Thread.sleep(2000);
	}

}
