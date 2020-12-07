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
		driver.findElement(By.linkText("�ף����¼")).click();//����ҳ�����¼
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("zsq");//�����û���
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("123");//��������
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();//�����¼��ť
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='book/list?cateId=5']")).click();//�������
		Thread.sleep(2000);
		driver.findElement(By.className("form-control")).sendKeys("��");//�������������
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"searchForm\"]/button")).click();//�������
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/ul/li[1]/div/p/a[1]")).click();//�����һ������빺�ﳵ
		Thread.sleep(2000);
		driver.findElement(By.className("toShopping")).click();//�����������
		Thread.sleep(1000);
		driver.navigate().back();//�������
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
		//driver.findElement(By.linkText("��չ��ﳵ")).click();//�����չ��ﳵ
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("ɾ��")).click();//���ɾ��
		//Thread.sleep(2000);
		driver.findElement(By.linkText("��д����")).click();//�����д����
		Thread.sleep(2000);
		driver.findElement(By.linkText("���ع��ﳵ")).click();//������ع��ﳵ
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("���㶩��")).click();//������㶩��
		Thread.sleep(2000);
		driver.findElement(By.linkText("�鿴���ж���")).click();//����鿴���ж���
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("֧��")).click();//���֧��
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(priority = 2)
	public void test2() throws InterruptedException{
		System.setProperty("Webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(urlString);
		//�������������
		driver.findElement(By.xpath("//a[@href='index/category/5']")).click();
		Thread.sleep(2000);
		//��������ϼ��е��鼮
		driver.findElement(By.xpath("//a[@href='book/info/132']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	
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
		//������ҳ�����·�ҳ������3
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
		//������������鼮ͼƬ��
		WebElement a =driver.findElement(By.xpath("//a[@href='book/info/121']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(a).perform();
		Thread.sleep(2000);
		a.click();//����鼮ͼƬ��תҳ��
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
		//�����������ȫ����Ʒ��
		WebElement a1 =driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li"));
		Actions ac1=new Actions(driver);
		ac1.moveToElement(a1).perform();
		Thread.sleep(2000);
		//������������鼮������
		WebElement a =driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/ul/li[1]/p[1]/a"));
		Actions ac=new Actions(driver);
		ac.moveToElement(a).perform();
		Thread.sleep(2000);
		a.click();//����鼮������תҳ��
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(priority = 6)
	public void test6() throws InterruptedException{
		System.setProperty("Webdriver.gecko.driver","D:\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(urlString);
		driver.findElement(By.xpath("//a[@href='book/list?cateId=5']")).click();//�������
		Thread.sleep(2000);
		//������������鼮������
		WebElement a =driver.findElement(By.linkText("���ޣ������Ļ� ��Ʒ"));
		Actions ac=new Actions(driver);
		ac.moveToElement(a).perform();
		Thread.sleep(2000);
		a.click();//����鼮������ת����ҳ
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='book/list?cateId=5']")).click();
		Thread.sleep(2000);
		//������������鼮��������
		WebElement ab =driver.findElement(By.linkText("�ٻ������ճ�����"));
		Actions acb=new Actions(driver);
		acb.moveToElement(ab).perform();
		Thread.sleep(2000);
		ab.click();//����鼮��������ת����ҳ
		Thread.sleep(2000);
		driver.quit();
	}*/
	
	@Test(priority = 7)
	public void test7() throws InterruptedException{
		System.setProperty("Webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(urlString);
		driver.findElement(By.linkText("�ף����¼")).click();//����ҳ�����¼
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("zsq");//�����û���
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("123");//��������
		Thread.sleep(1000);
	    WebElement input =driver.findElement(By.id("loginButton"));//���ENTER��
	    input.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//�������������
		driver.findElement(By.xpath("//a[@href='book/list?cateId=5']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='index']")).click();//������ҳ�������Ϸ�ddͼƬ
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"header_ul\"]/li[5]/a")).click();//������Ϸ���ҳ
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.linkText("���ע��")).click();//������Ϸ����ע��
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"header_ul\"]/li[4]/a")).click();//������Ϸ��û�������ת��������Ϣҳ��
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"userInfoForm\"]/div[10]/div/button[1]")).click();//������������Ϣ
		Thread.sleep(2000);
		driver.navigate().back();
		driver.quit();
	}
	
	@Test(priority = 8)
	public void test8() throws InterruptedException{
		System.setProperty("Webdriver.gecko.driver","D:\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(urlString);
		driver.findElement(By.linkText("�ף����¼")).click();//����ҳ�����¼
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("zsq");//�����û���
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("123");//��������
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();//�����¼��ť
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"header_ul\"]/li[1]/div/button")).click();//����ҵ�dd
		Thread.sleep(1000);
		driver.findElement(By.linkText("��̨����")).click();//�����̨����
		Thread.sleep(1000);
		driver.findElement(By.linkText("�ҵĵ���")).click();//����ҵĵ���
		Thread.sleep(1000);
		driver.findElement(By.linkText("��������")).click();//�����������
		Thread.sleep(1000);
		driver.findElement(By.className("btn btn-xs btn-info")).click();//����鿴����
		Thread.sleep(1000);
		driver.findElement(By.className("btn btn-xs btn-default")).click();//���涩����Ϣ
		Thread.sleep(1000);
		driver.findElement(By.linkText("��������")).click();//�����������
		Thread.sleep(1000);
		WebElement a =driver.findElement(By.id("buyerInfo"));//����������������Ϣ��
		Actions ac=new Actions(driver);
		ac.moveToElement(a).perform();
		Thread.sleep(2000);
		driver.findElement(By.className("btn btn-xs btn-danger")).click();//���ȡ������
		Thread.sleep(1000);
		
	}
}

