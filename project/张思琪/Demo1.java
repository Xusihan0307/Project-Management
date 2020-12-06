package testng;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
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
		driver.findElement(By.linkText("亲，请登录")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("zdd");//输入用户名
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("123");//输入密码
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();//点击登录
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='book/list?cateId=5']")).click();//点击生活
		Thread.sleep(2000);
		driver.findElement(By.className("form-control")).sendKeys("答案");//在搜索栏输入答案
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"searchForm\"]/button")).click();//点击搜索
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/ul/li[1]/div/p/a[1]")).click();//点击第一本书加入购物车
		Thread.sleep(2000);
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
		driver.findElement(By.linkText("填写订单")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("结算订单")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("支付")).click();
		//Thread.sleep(2000);
		driver.findElement(By.linkText("查看所有订单")).click();
		Thread.sleep(2000);
		driver.quit();
	}*/
	//点击横向栏生活
	/*@Test(priority = 2)
	public void test2() throws InterruptedException{
		System.setProperty("Webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(urlString);
		driver.findElement(By.xpath("//a[@href='index/category/5']")).click();
		Thread.sleep(2000);
		//点击新书上架中的书籍
		driver.findElement(By.xpath("//a[@href='book/info/132']")).click();
		Thread.sleep(2000);
		driver.quit();
	}*/
	
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
		driver.findElement(By.linkText("3")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	/*@Test(priority = 5)
	public void test5() throws InterruptedException{
		System.setProperty("Webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(urlString);
		driver.findElement(By.xpath("//a[@href='book/list?cateId=5']")).click();
		Thread.sleep(2000);
		WebElement a =driver.findElement(By.xpath("//a[@href='book/info/121']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(a).perform();
		Thread.sleep(2000);
		a.click();
		Thread.sleep(2000);
		driver.quit();
	}*/
}

