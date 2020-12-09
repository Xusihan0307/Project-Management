package com.www.lw.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class demo extends BaseTest{
	String url = "http://localhost:8088/index";
	

	@BeforeMethod
//	登录
	public void test0() throws InterruptedException {
//		打开网页
		webtest.open(url);
//		点击用户名
		webtest.click("name=username");
//		输入用户名
		webtest.type("name=username", "llllll");
		webtest.click("name=password");
		webtest.type("name=password", "liujiahui");
		webtest.click("xpath=//input");
//		停顿1秒
		Thread.sleep(1000);	}


@Test
//	 首页点击特色书单
	public void test1() throws InterruptedException {
 //     打开网页
		webtest.open(url);
		webtest.click("xpath=//a[text()='特色书单']");
		Thread.sleep(1000);	
		}


  @Test
  public void test2() throws InterruptedException {
	    webtest.click("xpath=//a[text()='书海风云']");
	    Thread.sleep(1000);	
	    
  }    
	    
  @Test
  public void test3() throws InterruptedException {
	    webtest.click("xpath=//a[text()='图书排名']");
	    Thread.sleep(1000);	
	    
  }        
  
  
  
  @Test
  public void test4() throws InterruptedException {
	    webtest.click("xpath=//a[text()='图书推荐']");
	    Thread.sleep(1000);	
	    
  }   
  
  @Test
  public void test5() throws InterruptedException {
	    webtest.click("xpath=//a[text()='图书人气']");
	    Thread.sleep(1000);	
	    
  }   
  
  @Test
  public void test6() throws InterruptedException {
	    webtest.click("xpath=//a[text()='经典国学']");
	    Thread.sleep(1000);	
	    
  }   
  
  @Test
  public void test7() throws InterruptedException {
	    webtest.click("xpath=//a[text()='易经']");
	    Thread.sleep(1000);	
	    
  }    
  
  @Test
  public void test8() throws InterruptedException {
	    webtest.click("xpath=//a[text()='道德经']");
	    Thread.sleep(1000);	
	    
  }   
  
  @Test
  public void test9() throws InterruptedException {
	    webtest.click("xpath=//a[text()='黄帝内经']");
	    Thread.sleep(1000);	
	    
  }   
  
  @Test
  public void test10() throws InterruptedException {
	    webtest.click("xpath=//a[text()='会员中心']");
	    Thread.sleep(1000);	
	    
  }    
  
  @Test
  public void test11() throws InterruptedException {
	    webtest.click("xpath=//a[text()='资金管理']");
	    Thread.sleep(1000);	
	    
  }    
  
  @Test
  public void test12() throws InterruptedException {
	    webtest.click("xpath=//a[text()='特权礼包']");
	    Thread.sleep(1000);	
	    
  }    
  
  @Test
  public void test13() throws InterruptedException {
	    webtest.click("xpath=//a[text()='商城']");
	    Thread.sleep(1000);	
	    
  }    
  
  @Test
  public void test14() throws InterruptedException {
	    webtest.click("xpath=//a[text()='安全中心']");
	    Thread.sleep(1000);	
	    
  }    
  
  @Test
  public void test15() throws InterruptedException {
	    webtest.click("xpath=//a[text()='账号管理']");
	    Thread.sleep(1000);	
	    
  }    
  
  @Test
  public void test16() throws InterruptedException {
	    webtest.click("xpath=//a[text()='防盗号']");
	    Thread.sleep(1000);	
	    
  }    
  
  @Test
  public void test17() throws InterruptedException {
	    webtest.click("xpath=//a[text()='充值']");
	    Thread.sleep(1000);	
	    
  }    
  
  @Test
  public void test18() throws InterruptedException {
	    webtest.click("xpath=//a[text()='联系我们']");
	    Thread.sleep(1000);	
	    
  }    
  @Test
  public void test19() throws InterruptedException {
	    webtest.click("xpath=//a[text()='网站故障报告']");
	    Thread.sleep(1000);	
	    
  }    
  
  @Test
  public void test20() throws InterruptedException {
	    webtest.click("xpath=//a[text()='游戏咨询']");
	    Thread.sleep(1000);	
	    
  }   
  @Test
  public void test21() throws InterruptedException {
	    webtest.click("xpath=//a[text()='投诉与建议']");
	    Thread.sleep(1000);	
	    
  }  
  //搜索
  @Test
  public void test22() throws InterruptedException {
	    webtest.click("name=keywords");
	    webtest.type("name=keywords","111111111");
	    webtest.click("xpath=//button[@class=btn btn-info]");
	    Thread.sleep(1000);	
	    
  }    
//我的购物车
  @Test
  public void test23() throws InterruptedException {	  
	    webtest.click("xpath=//button[@class=btn btn-info]");
	    Thread.sleep(1000);	
	    
  }   
  
  //个人信息
  @Test
  public void test24() throws InterruptedException {	  
	    webtest.click("xpath=//button[@class=btn btn-default dropdown-toggle mybtn]");
	    webtest.click("xpath=//a[text()=' 个人信息']");
	    webtest.enterFrame("ifcontent");
	    Thread.sleep(1000);	    
  }    	    
  
  //编辑个人信息
  @Test
  public void test25() throws InterruptedException {	  
	    webtest.click("xpath=//button[@class=btn btn-default dropdown-toggle mybtn]");
	    webtest.click("xpath=//a[text()=' 个人信息']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("name=nickname");
	    webtest.type("name=nickname","不不不 ");
	    webtest.click("name=phone");
	    webtest.type("name=phone","15369751324");
	    webtest.click("xpath=//button[text()='保存基本信息']");
	    Thread.sleep(1000);	    
  }    	    
  
  //修改密码
  @Test
  public void test26() throws InterruptedException {	  
	    webtest.click("xpath=//button[@class=btn btn-default dropdown-toggle mybtn]");
	    webtest.click("xpath=//a[text()=' 个人信息']");
	    webtest.enterFrame("ifcontent");	    
	    webtest.click("xpath=//button[text()='修改密码']");
	    webtest.click("name=oldPassword");
	    webtest.type("name=oldPassword","liujiahui");
	    webtest.click("name=newPassword");
	    webtest.type("name=newPassword","liujiahui6");
	    webtest.click("name=rePassword");
	    webtest.type("name=rePassword","liujiahui6");
	    webtest.click("xpath=//button[text()='提交更改']");
	    Thread.sleep(1000);	    
  }   
  //修改密码
  @Test
  public void test27() throws InterruptedException {	  
	    webtest.click("xpath=//button[@class=btn btn-default dropdown-toggle mybtn]");
	    webtest.click("xpath=//a[text()=' 个人信息']");
	    webtest.enterFrame("ifcontent");	    
	    webtest.click("xpath=//button[text()='修改密码']");
	    webtest.click("xpath=//button[text()='关闭']");
	    Thread.sleep(1000);	    
  }   
  
  //注销
  @Test
  public void test28() throws InterruptedException {	  
	    webtest.click("xpath=//button[@class=btn btn-default dropdown-toggle mybtn]");
	    webtest.click("xpath=//a[text()=' 注销']");
	    webtest.enterFrame("ifcontent");
	    Thread.sleep(1000);	    
  }   
  
  @Test
  public void test30() throws InterruptedException {
	    webtest.click("xpath=//a[text()='科技']");
	    Thread.sleep(1000);	
  }
  
  @Test
  public void test31() throws InterruptedException {
	    webtest.click("xpath=//a[text()='文学经典']");
	    Thread.sleep(1000);	
  
  }
  
  @Test
  public void test32() throws InterruptedException {
	    webtest.click("xpath=//a[text()='人文社科']");
	    Thread.sleep(1000);	
  
  }
  
  @Test
  public void test33() throws InterruptedException {
	    webtest.click("xpath=//a[text()='生活']");
	    Thread.sleep(1000);	
  
  }
  @Test
  public void test34() throws InterruptedException {
	    webtest.click("xpath=//a[text()='图书']");
	    Thread.sleep(1000);	
  
  }
  @Test
  public void test35() throws InterruptedException {
	    webtest.click("xpath=//a[text()='小说']");
	    Thread.sleep(1000);	
  
  }
  
  @Test
  public void test36() throws InterruptedException {
	    webtest.click("xpath=//a[text()='全5册教育部指定 快乐读书吧丛书注音版儿童读物7-10岁二年级课外阅读必读上册 孤独的小螃蟹 小学生课外阅读小狗的小房']");
	    Thread.sleep(1000);	
  
  }
  
  @Test
  public void test37() throws InterruptedException {
	    webtest.click("xpath=//a[text()='郑渊洁四大名传（全4册）']");
	    Thread.sleep(1000);	
  
  }
  
  //搜索
  @Test
  public void test39() throws InterruptedException {
	    webtest.click("name=keywords");
	    webtest.type("name=keywords","java");
	    webtest.click("xpath=//button[@class=btn btn-info]");
	    Thread.sleep(1000);	
	    
  }    
  
  //搜索
  @Test
  public void test40() throws InterruptedException {
	    webtest.click("name=keywords");
	    webtest.type("name=keywords","杨洁");
	    webtest.click("xpath=//button[@class=btn btn-info]");
	    Thread.sleep(1000);	
	    
  }    
  //搜索
  @Test
  public void test41() throws InterruptedException {
	    webtest.click("name=keywords");
	    webtest.type("name=keywords","教育");
	    webtest.click("xpath=//button[@class=btn btn-info]");
	    Thread.sleep(1000);	
	    
  }  
  
  @Test
  public void test43() throws InterruptedException {
	    webtest.click("xpath=//a[text()='全5册教育部指定 快乐读书吧丛书注音版儿童读物7-10岁二年级课外阅读必读上册 孤独的小螃蟹 小学生课外阅读小狗的小房']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=add_cart]");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=toCart]");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=total_btn]");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=checkout_btn]");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=toCart]");
	    webtest.enterFrame("ifcontent");
	    Thread.sleep(1000);	
  
  }
  
  @Test
  public void test44() throws InterruptedException {
	    webtest.click("xpath=//a[text()='全5册教育部指定 快乐读书吧丛书注音版儿童读物7-10岁二年级课外阅读必读上册 孤独的小螃蟹 小学生课外阅读小狗的小房']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=add_cart]");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=toCart]");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=total_btn]");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=checkout_btn]");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=toShopping]");
	    webtest.enterFrame("ifcontent");
	    Thread.sleep(1000);	
  
  }
  @Test
  public void test45() throws InterruptedException {
	    webtest.click("xpath=//a[text()='全5册教育部指定 快乐读书吧丛书注音版儿童读物7-10岁二年级课外阅读必读上册 孤独的小螃蟹 小学生课外阅读小狗的小房']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=add_cart]");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=toCart]");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='清空购物车']");
	    webtest.enterFrame("ifcontent");
	    Thread.sleep(1000);	
  }
  @Test
  public void test47() throws InterruptedException {
	    webtest.click("xpath=//a[text()='全5册教育部指定 快乐读书吧丛书注音版儿童读物7-10岁二年级课外阅读必读上册 孤独的小螃蟹 小学生课外阅读小狗的小房']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=add_cart]");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=toCart]");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='继续购物']");
	    webtest.enterFrame("ifcontent");
	    Thread.sleep(1000);	
  }
  @Test
  public void test48() throws InterruptedException {
	    webtest.click("xpath=//a[text()='全5册教育部指定 快乐读书吧丛书注音版儿童读物7-10岁二年级课外阅读必读上册 孤独的小螃蟹 小学生课外阅读小狗的小房']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=add_cart]");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=toCart]");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=total_btn]");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='返回购物车']");
	    webtest.enterFrame("ifcontent");
	    Thread.sleep(1000);	
  
  }
  @Test
  public void test49() throws InterruptedException {
	    webtest.click("xpath=//a[text()='全5册教育部指定 快乐读书吧丛书注音版儿童读物7-10岁二年级课外阅读必读上册 孤独的小螃蟹 小学生课外阅读小狗的小房']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=buy_now]");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=total_btn]");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=checkout_btn]");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class=toCart]");
	    webtest.enterFrame("ifcontent");
	    
	    Thread.sleep(1000);	
  
  }
  
  
  



  
  
  
 