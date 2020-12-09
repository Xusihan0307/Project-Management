package com.webtest.demo;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Actor extends BaseTest{
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
	public void ActorPower() throws InterruptedException{
		//进入后台页面
		webtest.click("xpath=//*[@id=\"header_ul\"]/li[1]/div/button");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"header_ul\"]/li[1]/div/ul/li[2]/a");
		Thread.sleep(1000);
		//点击 角色列表
		webtest.enterFrame(0);		
		webtest.enterFrame("leftFrame");
		webtest.click("xpath=/html/body/div/div[2]/div[3]/div[1]/h4/a");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='角色列表']");	
		webtest.leaveFrame();
		webtest.enterFrame(0);
		webtest.enterFrame("centerFrame");
		webtest.click("xpath=/html/body/div/table/tbody/tr[2]/td[7]/button[1]");
		webtest.click("xpath=//*[@id=\"privilegeTree_1_check\"]");
		Thread.sleep(2000);
		
		//使用actions模拟鼠标滑动和键盘输入
		
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		webtest.leaveFrame();
		webtest.runJs("window.scrollTo(300,300)");
		webtest.enterFrame(0);
		webtest.enterFrame("centerFrame");		
		
		webtest.click("xpath=/html/body/div/div[3]/button");
		webtest.click("xpath=/html/body/div/div[3]/a");
	}
	@Test(priority = 3)
	public void ChangeActor() throws InterruptedException {
		webtest.click("xpath=/html/body/div/table/tbody/tr[9]/td[7]/button[2]");
		driver.findElement(By.id("name")).clear();
		Thread.sleep(1000);
		webtest.type("id=name", "测试一下");
		Thread.sleep(1000);
		driver.findElement(By.id("code")).clear();
		Thread.sleep(1000);
		webtest.type("id=code", "test");
		Thread.sleep(1000);
		driver.findElement(By.id("description")).clear();
		Thread.sleep(1000);
		webtest.type("id=description", "测试一下");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/form/div[4]/div/button");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/form/a");
	}
	@Test(priority = 4)
	public void DeleteActor() throws InterruptedException {
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		webtest.leaveFrame();
		webtest.runJs("window.scrollTo(300,300)");
		webtest.enterFrame(0);
		webtest.enterFrame("centerFrame");			
		webtest.click("xpath=/html/body/div/table/tbody/tr[9]/td[7]/button[3]");
		webtest.getAlert();
		webtest.alertAccept();
		Thread.sleep(1000);
	}

}
