package com.webtest.demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.edu.dataprovider.ExcelDataProvider;
import com.webtest.core.BaseTest;

public class NewBooks_Test extends BaseTest{
	@Test
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
	public class Text  extends BaseTest{
		@DataProvider(name = "Text")
		public Object[][] loginTestDemo() throws IOException{
			ExcelDataProvider data = new ExcelDataProvider();
			return data.getTestDataByExcel("E://Test.xlsx", "Sheet1");
		}
	}
	@Test(dataProvider = "Text")
	//图书上新的测试
	public void NewBooks(String Text) throws InterruptedException {
		//点击我的dd
		webtest.click("xpath=/html/body/div[1]/div/ul/li[1]/div/button");
		//点击下拉列表内的后台管理
		webtest.click("xpath=/html/body/div[1]/div/ul/li[1]/div/ul/li[2]/a");
		Thread.sleep(1000);
		webtest.enterFrame(0);
		webtest.enterFrame(0);
		Thread.sleep(1000);

		//点击 我的店铺
		webtest.click("xpath=//a[text()='我的店铺']");
		//点击 图书上新
		webtest.click("xpath=//a[text()='图书上新']");
		Thread.sleep(2000);
		webtest.enterFrame(1);
		webtest.type("id=name", "假如给我三天光明");
		webtest.type("id=price", "45");
		webtest.type("id=marketPrice", "50");
		webtest.type("id=storeMount", "9999");
		//点击日期
		webtest.click("id=publishDate");
		webtest.type("class=col-sm-5", "中国文学出版社");
		//点击下拉列表的图书分类
		webtest.click("id=bookCategoryId");
		//上传图片
		driver.findElement(By.name("pictureFile")).sendKeys("D:\\images\\a1.png");
		//添加描述（数据驱动）
		webtest.type("class=view",Text);
		webtest.click("class=btn btn-lg btn-default");
	}

}
