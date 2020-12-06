package com.edu.bigwork;

import static org.testng.Assert.assertThrows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BigWork {
	@Test
	public void Test() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "‪‪D:\\demo\\geckodriver.exe");
		String url="http://www.roqisoft.com/zhsx/";
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		driver.findElement(By.linkText("登录"));
		driver.findElement(By.id("user")).sendKeys("ls2020");
		driver.findElement(By.id("pw")).sendKeys("123456");
		driver.findElement(By.id("pw")).submit();
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav\"]/font/li[8]/a/strong"))).perform();
		action.moveToElement(driver.findElement(By.linkText("个人游记"))).perform();
		action.click().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("点我写游记")).click();
		driver.findElement(By.id("title")).sendKeys("个人游记");
		driver.switchTo().frame(0);
		driver.findElement(By.tagName("body")).click();
		driver.findElement(By.tagName("body")).sendKeys("今天玩的很开心，天气很好。");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"post_button\"]/input[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("点击进入智慧首页")).click();
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav\"]/font/li[8]/a/strong"))).perform();
		action.moveToElement(driver.findElement(By.linkText("个人相册"))).perform();
		action.click().perform();
		Thread.sleep(2000);
		driver.findElement(By.name("attach[]")).sendKeys("‪C:\\Users\\Lenovo\\Desktop\\work.jpg");
		driver.findElement(By.name("html-upload")).click();
		Thread.sleep(2000);
		driver.get("http://www.roqisoft.com/zhsx/blog/");
		Thread.sleep(2000);
		int random=(int)(Math.random()*10);
		List<WebElement> list=driver.findElements(By.tagName("img"));
		list.get(random).click();
		driver.findElement(By.name("comment")).sendKeys("文章写的超级棒！！！！！");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
