package practice;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.html5.AddApplicationCache;
import org.testng.annotations.Test;



public class LifeTest {
	
	public  static void main(String[] args) throws InterruptedException{
		
		System.setProperty("Webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8088/index");
		
		driver.findElement(By.linkText("�ף����¼")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);  
		
		driver.findElement(By.xpath("//a[@href='index/category/5']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='book/list?cateId=5']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='book/info/121']")).click();
		Thread.sleep(1000);
		
		
		//��������

			driver.findElement(By.id("num_add")).click();
			Thread.sleep(1000);

		//��������

			driver.findElement(By.id("num_sub")).click();
			Thread.sleep(1000);

		//������빺�ﳵ
		driver.findElement(By.className("add_cart")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("toCart")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("total_btn")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
