package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;
import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.utils.Log;
import com.webtest.utils.ReadProperties;



public class Admin_Login  extends BaseTest{
	
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
	public void test1(){
		
	}

}
