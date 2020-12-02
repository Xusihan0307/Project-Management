package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.edu.dataprovider.ExcelDataProvider;
import com.webtest.core.BaseTest;



public class Admin_Login  extends BaseTest{
	@DataProvider(name = "login")
	public Object[][] loginTestDemo() throws IOException{
		ExcelDataProvider data = new ExcelDataProvider();
		return data.getTestDataByExcel("E://Test.xlsx", "Sheet1");
	}

	@Test(dataProvider = "login",priority = 1)
	public void Login(String username,String password) throws InterruptedException{
		//打开网站
		webtest.open("http://localhost:8088/");
//		Thread.sleep(2000);
		//点击 亲，请登录
		webtest.click("xpath=//*[@id=\"header_ul\"]/li[3]/a");
		//输入用户名和密码、点击登录按钮
		webtest.type("xpath=//*[@id=\"username\"]", username);
		webtest.type("xpath=//*[@id=\"password\"]", password);
		
		webtest.click("xpath=//*[@id=\"loginButton\"]");
		Thread.sleep(2000);
	}

}
