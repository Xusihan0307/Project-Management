package com.webtest.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ManagePower extends BaseTest{
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
	//测试添加节点按钮
	public void AddButton() throws InterruptedException{
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
		webtest.click("id=privilegeTree_28_span");
		webtest.click("id=addBtn_privilegeTree_28");
	}
	@Test(priority = 3)
	//重命名按钮
	public void RenameButton() throws InterruptedException {
		webtest.click("id=privilegeTree_32_span");
		webtest.click("id=privilegeTree_32_edit");
		webtest.getAlert();
		Thread.sleep(1000);
		webtest.alertAccept();
		Thread.sleep(1000);
		webtest.type("id=privilegeTree_32_input", "测试");
		webtest.click("id=privilegeTree_31_span");
	}
	@Test(priority = 4)
	//删除按钮
	public void DeleteButton() throws InterruptedException {
		webtest.click("id=privilegeTree_32_span");
		webtest.click("id=privilegeTree_32_remove");
		webtest.getAlert();
		Thread.sleep(1000);
		webtest.alertAccept();
		Thread.sleep(1000);		
	}

}
