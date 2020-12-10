package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SearchBox extends BaseTest{
	@Test(priority = 1)
	//测试 搜索按钮功能
	public void SearchBtn() throws InterruptedException {
		webtest.open("http://localhost:8088/");
		Thread.sleep(2000);
		webtest.type("id=keywords", "你是人间四月天");
		webtest.click("xpath=/html/body/div[2]/div[1]/div[2]/form/button");
	}
	@Test(priority = 2)
	//测试 是否可以英文搜索
	public void SearchEnglish() {
		webtest.click("xpath=/html/body/div[1]/div/ul/li[5]/a");
		webtest.type("id=keywords", "Java");
		webtest.click("xpath=/html/body/div[2]/div[1]/div[2]/form/button");
	}
	@Test(priority = 3)
	//测试 是否可以进行模糊搜索
	public void FuzzySearch() {
		webtest.click("xpath=/html/body/div[1]/div/ul/li[5]/a");
		webtest.type("id=keywords", "+");
		webtest.click("xpath=/html/body/div[2]/div[1]/div[2]/form/button");
	}
	@Test(priority = 4)
	//测试 是否可以进行完全搜索
	public void FullSearch() {
		webtest.click("xpath=/html/body/div[1]/div/ul/li[5]/a");
		webtest.type("id=keywords", "童%话");
		webtest.click("xpath=/html/body/div[2]/div[1]/div[2]/form/button");
	}
	@Test(priority = 5)
	//输入过长的信息 搜索框是否可以截取允许的长度来检索结果
	public void LongInput() {
		webtest.click("xpath=/html/body/div[1]/div/ul/li[5]/a");
		webtest.type("id=keywords", "红鞋子童话拼音版（注音版童书，小学老师审核，为小学生量身打造/入选清华大学附属小学校长阅读书目/中国好书得主湖南师大教授笨狼妈妈代表性作品/已有超过30000名读者给予好评");
		webtest.click("xpath=/html/body/div[2]/div[1]/div[2]/form/button");
	}
	@Test(priority = 6)
	//空输入
	public void EmptyInput() throws InterruptedException {
		webtest.open("http://localhost:8088/");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/div/ul/li[5]/a");
		webtest.click("id=keywords");
		webtest.click("xpath=/html/body/div[2]/div[1]/div[2]/form/button");
	}
}
