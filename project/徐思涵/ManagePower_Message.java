package com.webtest.demo;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;



public class ManagePower_Message extends BaseTest{
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
	//添加节点权限代码信息
	public void AddPointCode() throws InterruptedException {
		//进入后台页面
		webtest.click("xpath=//*[@id=\"header_ul\"]/li[1]/div/button");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"header_ul\"]/li[1]/div/ul/li[2]/a");
		Thread.sleep(1000);
		//点击 我的图书
		webtest.enterFrame(0);		
		webtest.enterFrame("leftFrame");
		webtest.click("xpath=//*[@id=\"left-menu-main\"]/div[3]/div[1]/h4/a");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='权限管理']");	
		//点击个人中心的添加按钮
		webtest.leaveFrame();
		webtest.enterFrame(0);
		webtest.enterFrame("centerFrame");
		Thread.sleep(1000);	
		webtest.click("id=privilegeTree_28_switch");
		webtest.click("id=privilegeTree_33_span");
		webtest.type("id=code", "ceshi");
	}
	@Test(priority = 3)
	//添加节点资源url信息
	public void AddPointURL() throws InterruptedException {
		webtest.type("id=url", "ceshi");
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		webtest.leaveFrame();
		webtest.runJs("window.scrollTo(500,500)");
		webtest.enterFrame(0);
		webtest.enterFrame("centerFrame");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div/div[3]/form/div[4]/div/button");
		Thread.sleep(1000);
		webtest.getAlert();
		Thread.sleep(1000);
		webtest.alertAccept();
		Thread.sleep(1000);		
	}

}
