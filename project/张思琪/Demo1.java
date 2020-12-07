package testng;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.security.authentication.LoginAuthenticator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	public WebDriver driver;
	String urlString="http://localhost:8088/";
	/*@Test(priority = 1)
	public void test1() throws InterruptedException{
		System.setProperty("Webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(urlString);
		driver.findElement(By.linkText("亲，请登录")).click();//在首页点击登录
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("zsq");//输入用户名
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("123");//输入密码
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();//点击登录按钮
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='book/list?cateId=5']")).click();//点击生活
		Thread.sleep(2000);
		driver.findElement(By.className("form-control")).sendKeys("答案");//在搜索栏输入答案
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"searchForm\"]/button")).click();//点击搜索
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/ul/li[1]/div/p/a[1]")).click();//点击第一本书加入购物车
		Thread.sleep(2000);
		driver.findElement(By.className("toShopping")).click();//点击继续购物
		Thread.sleep(1000);
		driver.navigate().back();//点击后退
		driver.findElement(By.className("toCart")).click();//点击去购物车结算
		Thread.sleep(1000);
		//增加书籍数量
		for(int i=1;i<3;i++) {
			driver.findElement(By.xpath("//*[@id=\"cart_item121\"]/td[4]/div/a[1]")).click();
			Thread.sleep(1000);
		}
		//减少书籍数量
		for(int i=1;i<3;i++) {
			driver.findElement(By.xpath("//*[@id=\"cart_item121\"]/td[4]/div/a[2]")).click();
			Thread.sleep(1000);
		}
		//driver.findElement(By.linkText("清空购物车")).click();//点击清空购物车
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("删除")).click();//点击删除
		//Thread.sleep(2000);
		driver.findElement(By.linkText("填写订单")).click();//点击填写订单
		Thread.sleep(2000);
		driver.findElement(By.linkText("返回购物车")).click();//点击返回购物车
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("结算订单")).click();//点击结算订单
		Thread.sleep(2000);
		driver.findElement(By.linkText("查看所有订单")).click();//点击查看所有订单
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("支付")).click();//点击支付
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(priority = 2)
	public void test2() throws InterruptedException{
		System.setProperty("Webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(urlString);
		//点击横向栏生活
		driver.findElement(By.xpath("//a[@href='index/category/5']")).click();
		Thread.sleep(2000);
		//点击新书上架中的书籍
		driver.findElement(By.xpath("//a[@href='book/info/132']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(priority = 3)
	public void test3() throws InterruptedException{
		System.setProperty("Webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(urlString);
		//点击纵向栏生活
		driver.findElement(By.xpath("//a[@href='book/list?cateId=5']")).click();
		Thread.sleep(2000);
		//点击答案之书的收藏
		driver.findElement(By.className("search_btn_collect")).click();
		Thread.sleep(2000);
		//在生活页面点击下一页
		driver.findElement(By.linkText("下一页")).click();
		Thread.sleep(2000);
		//在生活页面点击上一页
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		//在生活页面点击下方页面数字3
		driver.findElement(By.linkText("3")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	
	/*@Test(priority = 4)
	public void test4() throws InterruptedException{
		System.setProperty("Webdriver.gecko.driver","D:\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(urlString);
		driver.findElement(By.xpath("//a[@href='book/list?cateId=5']")).click();
		Thread.sleep(2000);
		//将鼠标悬浮在书籍图片上
		WebElement a =driver.findElement(By.xpath("//a[@href='book/info/121']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(a).perform();
		Thread.sleep(2000);
		a.click();//点击书籍图片跳转页面
		Thread.sleep(2000);	
		driver.quit();
	}
	
	@Test(priority = 5)
	public void test5() throws InterruptedException{
		System.setProperty("Webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(urlString);
		driver.findElement(By.xpath("//a[@href='book/list?cateId=5']")).click();
		Thread.sleep(2000);
		//将鼠标悬浮在全部商品上
		WebElement a1 =driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li"));
		Actions ac1=new Actions(driver);
		ac1.moveToElement(a1).perform();
		Thread.sleep(2000);
		//将鼠标悬浮在书籍标题上
		WebElement a =driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/ul/li[1]/p[1]/a"));
		Actions ac=new Actions(driver);
		ac.moveToElement(a).perform();
		Thread.sleep(2000);
		a.click();//点击书籍标题跳转页面
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(priority = 6)
	public void test6() throws InterruptedException{
		System.setProperty("Webdriver.gecko.driver","D:\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(urlString);
		driver.findElement(By.xpath("//a[@href='book/list?cateId=5']")).click();//点击生活
		Thread.sleep(2000);
		//将鼠标悬浮在书籍作者上
		WebElement a =driver.findElement(By.linkText("保罗，酷威文化 出品"));
		Actions ac=new Actions(driver);
		ac.moveToElement(a).perform();
		Thread.sleep(2000);
		a.click();//点击书籍作者跳转到首页
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='book/list?cateId=5']")).click();
		Thread.sleep(2000);
		//将鼠标悬浮在书籍出版社上
		WebElement ab =driver.findElement(By.linkText("百花洲文艺出版社"));
		Actions acb=new Actions(driver);
		acb.moveToElement(ab).perform();
		Thread.sleep(2000);
		ab.click();//点击书籍出版社跳转到首页
		Thread.sleep(2000);
		driver.quit();
	}*/
	
	@Test(priority = 7)
	public void test7() throws InterruptedException{
		System.setProperty("Webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(urlString);
		driver.findElement(By.linkText("亲，请登录")).click();//在首页点击登录
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("zsq");//输入用户名
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("123");//输入密码
		Thread.sleep(1000);
	    WebElement input =driver.findElement(By.id("loginButton"));//点击ENTER键
	    input.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//点击纵向栏生活
		driver.findElement(By.xpath("//a[@href='book/list?cateId=5']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='index']")).click();//在生活页面点击左上方dd图片
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"header_ul\"]/li[5]/a")).click();//点击右上方首页
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.linkText("免费注册")).click();//点击右上方免费注册
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"header_ul\"]/li[4]/a")).click();//点击右上方用户名，跳转到个人信息页面
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"userInfoForm\"]/div[10]/div/button[1]")).click();//点击保存基本信息
		Thread.sleep(2000);
		driver.navigate().back();
		driver.quit();
	}
	
	@Test(priority = 8)
	public void test8() throws InterruptedException{
		System.setProperty("Webdriver.gecko.driver","D:\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(urlString);
		driver.findElement(By.linkText("亲，请登录")).click();//在首页点击登录
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("zsq");//输入用户名
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("123");//输入密码
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();//点击登录按钮
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"header_ul\"]/li[1]/div/button")).click();//点击我的dd
		Thread.sleep(1000);
		driver.findElement(By.linkText("后台管理")).click();//点击后台管理
		Thread.sleep(1000);
		driver.findElement(By.linkText("我的店铺")).click();//点击我的店铺
		Thread.sleep(1000);
		driver.findElement(By.linkText("订单管理")).click();//点击订单管理
		Thread.sleep(1000);
		driver.findElement(By.className("btn btn-xs btn-info")).click();//点击查看订单
		Thread.sleep(1000);
		driver.findElement(By.className("btn btn-xs btn-default")).click();//保存订单信息
		Thread.sleep(1000);
		driver.findElement(By.linkText("订单管理")).click();//点击订单管理
		Thread.sleep(1000);
		WebElement a =driver.findElement(By.id("buyerInfo"));//将鼠标悬浮在买家信息上
		Actions ac=new Actions(driver);
		ac.moveToElement(a).perform();
		Thread.sleep(2000);
		driver.findElement(By.className("btn btn-xs btn-danger")).click();//点击取消订单
		Thread.sleep(1000);
		
	}
}

