package com.webtest.demo;

import java.io.IOException;

import org.apache.poi.ss.formula.functions.T;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.edu.dataprovider.ExcelDataProvider;
import com.webtest.core.BaseTest;

public class ShoppingCart extends BaseTest{
	@Test(priority = 1)
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
	//添加商品至购物车
	public void ShopBooks() throws InterruptedException {
		//点击首页小说分类
		webtest.click("id=7");
		//选择第一本小说
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[1]/a/img");
		Thread.sleep(2000);
				
		webtest.runJs("window.scrollTo(500,500)");
		Thread.sleep(2000);
		webtest.click("class=cart");
		Thread.sleep(2000);
		//点击 去购物车结算
		webtest.click("class=toCart");
		Thread.sleep(3000);
		//点击填写订单信息
		webtest.click("class=total_btn");
		
		Thread.sleep(3000);
		//点击 结算订单
		webtest.click("id=checkout_btn");
		
	}

}
