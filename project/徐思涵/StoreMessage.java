package com.webtest.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class StoreMessage extends BaseTest{
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
	public void ChangeName() throws InterruptedException {
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
		webtest.click("xpath=//a[text()='店铺信息']");
		//编辑我的图书
		webtest.leaveFrame();
		webtest.enterFrame(0);
		webtest.enterFrame("centerFrame");
		Thread.sleep(1000);		
		driver.findElement(By.id("storeName")).clear();
		Thread.sleep(1000);	
		webtest.type("name=storeName", "管理员商店（测试）");
		Thread.sleep(1000);	
		webtest.click("xpath=/html/body/div/form/div[7]/div/button");
	}
	@Test(priority = 3)
	public void ChangeMobilephoneNum() throws InterruptedException {	
		driver.findElement(By.id("storePhoneNum")).clear();
		Thread.sleep(1000);	
		webtest.type("name=storePhoneNum", "15814516280");
		Thread.sleep(1000);	
		webtest.click("xpath=/html/body/div/form/div[7]/div/button");		
	}
	@Test(priority = 4)
	public void ChangeTelNum() throws InterruptedException {	
		driver.findElement(By.id("storeTelephone")).clear();
		Thread.sleep(1000);	
		webtest.type("name=storeTelephone", "1008611");
		Thread.sleep(1000);	
		webtest.click("xpath=/html/body/div/form/div[7]/div/button");		
	}
	@Test(priority = 5)
	public void ChangeAdd() throws InterruptedException {	
		driver.findElement(By.id("storePosition")).clear();
		Thread.sleep(1000);	
		webtest.type("name=storePosition", "北京");
		Thread.sleep(1000);	
		webtest.click("xpath=/html/body/div/form/div[7]/div/button");		
	}
}
