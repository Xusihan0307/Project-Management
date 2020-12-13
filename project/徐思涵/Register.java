package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Register extends BaseTest{
	/*姓名：徐思涵
	 * 学号：2018011753
	 * 模块：新用户注册
	 */
	@Test(priority = 1)
	public void OrdinaryUsersRegister() throws InterruptedException {
		//普通用户注册
		webtest.open("http://localhost:8088/");
		webtest.click("xpath=//*[@id=\"header_ul\"]/li[2]/a");
		webtest.type("xpath=/html/body/div[4]/form/div/table/tbody/tr[1]/td[2]/input", "测试4");
		Thread.sleep(1000);
		webtest.type("xpath=/html/body/div[4]/form/div/table/tbody/tr[2]/td[2]/input", "12345");
		Thread.sleep(1000);
		webtest.type("xpath=/html/body/div[4]/form/div/table/tbody/tr[3]/td[2]/input", "12345");
		Thread.sleep(1000);
		webtest.type("xpath=/html/body/div[4]/form/div/table/tbody/tr[4]/td[2]/input", "672079202@qq.com");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/form/div/table/tbody/tr[5]/td[2]/input[1]");
		webtest.click("xpath=/html/body/div[4]/form/div/table/tbody/tr[6]/td[2]/input");
		webtest.click("xpath=//*[@id=\"regbutton\"]");
		
	}
	@Test(priority = 2)
	public void MerchantsRegister() throws InterruptedException {
		webtest.click("xpath=/html/body/div[2]/div[2]/a[2]");
		webtest.click("xpath=//*[@id=\"header_ul\"]/li[2]/a");
		webtest.type("xpath=/html/body/div[4]/form/div/table/tbody/tr[1]/td[2]/input", "测试5");
		Thread.sleep(1000);
		webtest.type("xpath=/html/body/div[4]/form/div/table/tbody/tr[2]/td[2]/input", "12345");
		Thread.sleep(1000);
		webtest.type("xpath=/html/body/div[4]/form/div/table/tbody/tr[3]/td[2]/input", "12345");
		Thread.sleep(1000);
		webtest.type("xpath=/html/body/div[4]/form/div/table/tbody/tr[4]/td[2]/input", "672079201@qq.com");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/form/div/table/tbody/tr[5]/td[2]/input[2]");
		webtest.click("xpath=/html/body/div[4]/form/div/table/tbody/tr[6]/td[2]/input");
		webtest.click("xpath=//*[@id=\"regbutton\"]");
	}
	

}
