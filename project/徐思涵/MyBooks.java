package com.webtest.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import net.bytebuddy.asm.Advice.Enter;

public class MyBooks extends BaseTest{
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
	public void EditBooks() throws InterruptedException {
		//进入后台页面
		webtest.click("xpath=//*[@id=\"header_ul\"]/li[1]/div/button");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"header_ul\"]/li[1]/div/ul/li[2]/a");
		Thread.sleep(1000);
		//点击 我的图书
		webtest.enterFrame(0);
		
		webtest.enterFrame("leftFrame");
		webtest.click("xpath=//*[@id=\"left-menu-main\"]/div[4]/div[1]/h4/a");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='我的图书']");
		//编辑我的图书
		webtest.leaveFrame();
		webtest.enterFrame(0);
		webtest.enterFrame("centerFrame");
		Thread.sleep(1000);		
		webtest.click("xpath=//table/tbody/tr/td[10]/button[1]");
		driver.findElement(By.id("name")).clear();
		webtest.type("id=name","测试");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[2]/form/div[13]/div/button");
		
	}
	
	@Test(priority = 3)
	public void DownBooks() throws InterruptedException {
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		webtest.leaveFrame();
		webtest.runJs("window.scrollTo(10,10)");
		webtest.enterFrame(0);
		webtest.enterFrame("centerFrame");
		Thread.sleep(1000);	
		//编辑我的图书	
		webtest.click("xpath=/html/body/div/table/tbody/tr/td[10]/button[2]");
		Thread.sleep(2000);	
		webtest.getAlert();
		webtest.alertAccept();
		Thread.sleep(1000);
	}
	@Test(priority = 4)
	public void DeleteBooks() throws InterruptedException {
		webtest.click("xpath=/html/body/div/table/tbody/tr/td[10]/button[3]");
		Thread.sleep(2000);	
		webtest.getAlert();
		Thread.sleep(1000);
		webtest.alertAccept();
		Thread.sleep(1000);
	}
}
