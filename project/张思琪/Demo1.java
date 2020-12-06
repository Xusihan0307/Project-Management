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
		driver.findElement(By.linkText("�ף����¼")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("zdd");//�����û���
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("123");//��������
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();//�����¼
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='book/list?cateId=5']")).click();//�������
		Thread.sleep(2000);
		driver.findElement(By.className("form-control")).sendKeys("��");//�������������
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"searchForm\"]/button")).click();//�������
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/ul/li[1]/div/p/a[1]")).click();//�����һ������빺�ﳵ
		Thread.sleep(2000);
		driver.findElement(By.className("toCart")).click();//���ȥ���ﳵ����
		Thread.sleep(1000);
		//�����鼮����
		for(int i=1;i<3;i++) {
			driver.findElement(By.xpath("//*[@id=\"cart_item121\"]/td[4]/div/a[1]")).click();
			Thread.sleep(1000);
		}
		//�����鼮����
		for(int i=1;i<3;i++) {
			driver.findElement(By.xpath("//*[@id=\"cart_item121\"]/td[4]/div/a[2]")).click();
			Thread.sleep(1000);
		}
		driver.findElement(By.linkText("��д����")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("���㶩��")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("֧��")).click();
		//Thread.sleep(2000);
		driver.findElement(By.linkText("�鿴���ж���")).click();
		Thread.sleep(2000);
		driver.quit();
	}*/
	//�������������
	/*@Test(priority = 2)
	public void test2() throws InterruptedException{
		System.setProperty("Webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(urlString);
		driver.findElement(By.xpath("//a[@href='index/category/5']")).click();
		Thread.sleep(2000);
		//��������ϼ��е��鼮
		driver.findElement(By.xpath("//a[@href='book/info/132']")).click();
		Thread.sleep(2000);
		driver.quit();
	}*/
	
	@Test(priority = 3)
	public void test3() throws InterruptedException{
		System.setProperty("Webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(urlString);
		//�������������
		driver.findElement(By.xpath("//a[@href='book/list?cateId=5']")).click();
		Thread.sleep(2000);
		//�����֮����ղ�
		driver.findElement(By.className("search_btn_collect")).click();
		Thread.sleep(2000);
		//������ҳ������һҳ
		driver.findElement(By.linkText("��һҳ")).click();
		Thread.sleep(2000);
		//������ҳ������һҳ
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

