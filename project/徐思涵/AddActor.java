package com.webtest.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddActor extends BaseTest{
	@Test(priority = 1)
	//登录
	public void Login() throws InterruptedException{
		//打开网站
		webtest.open("http://localhost:8088/");
		Thread.sleep(2000);
		//点击 亲，请登录
		webtest.click("xpath=//*[@id=\"header_ul\"]/li[3]/a");
		//输入用户名和密码、点击登录按钮
		webtest.type("xpath=//*[@id=\"username\"]", "admin");
		webtest.type("xpath=//*[@id=\"password\"]", "abc");
		
		webtest.click("xpath=//*[@id=\"loginButton\"]");
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void AddName() throws InterruptedException {
		//进入后台页面
		webtest.click("xpath=//*[@id=\"header_ul\"]/li[1]/div/button");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"header_ul\"]/li[1]/div/ul/li[2]/a");
		Thread.sleep(1000);
		//点击 我的图书
		webtest.enterFrame(0);
		
		webtest.enterFrame("leftFrame");
		webtest.click("xpath=/html/body/div/div[2]/div[3]/div[1]/h4/a");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='添加角色']");
		//编辑我的图书
		webtest.leaveFrame();
		webtest.enterFrame(0);
		webtest.enterFrame("centerFrame");
		Thread.sleep(1000);		
		webtest.type("id=name", "测试1");
	}
	@Test(priority = 3)
	public void AddCode() {
		webtest.type("id=code", "1234");
	}
	@Test(priority = 4)
	public void AddDescription() {
		webtest.type("id=description","这是测试");
		webtest.click("xpath=/html/body/div/form/div[4]/div/button");
	}

}
