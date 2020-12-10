package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class Demo extends BaseTest{
	//��¼
	/*
	@Test(priority=1,dataProvider="excel1",dataProviderClass=NSDataProvider.class)
	public void openWeb(String s1,String s2) throws InterruptedException {
		webtest.open("/page/login");
		webtest.type("name=username", s1);
		webtest.type("name=password", s2);
		webtest.click("xpath=//input[@type='submit']");
	}
	*/
	@Test(priority=1)
	public void test1() {
		webtest.open("http://127.0.0.1:8088/page/login");
		webtest.type("name=username", "admin");
		webtest.type("name=password", "123");
		webtest.click("xpath=//input[@type='submit']");
		
	}

//��ѧ���䲿��	
	//��ҳ-��ѧ����
	@Test(priority=2) 
	public void test2() throws InterruptedException {
		webtest.click("xpath=//*[@id=\"3\"]/a");
		Thread.sleep(1000);
	}
	
	//��ҳ-��ѧ����-�����ϼ�-ͼ������1
	@Test(priority=3) 
	public void test3() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[1]/p[1]/a");
		Thread.sleep(1000);
	}
		
	//��ҳ-��ѧ����-�����ϼ�-ͼ������2
	@Test(priority=3) 
	public void test4() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[2]/p[1]/a");
		Thread.sleep(1000);
	}
		
	//��ҳ-��ѧ����-�����ϼ�-ͼ������3
	@Test(priority=3) 
	public void test5() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[3]/p[1]/a");
		Thread.sleep(1000);
	}
		
	//��ҳ-��ѧ����-�����ϼ�-ͼ������4
	@Test(priority=3) 
	public void test6() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[4]/p[1]/a");
		Thread.sleep(1000);
	}
		
	//��ҳ-��ѧ����-�����ϼ�-ͼ������5
	@Test(priority=3) 
	public void test7() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[5]/p[1]/a");
		Thread.sleep(1000);
	}
		
	//��ҳ-��ѧ����-�����ϼ�-ͼ������6
	@Test(priority=3) 
	public void test8() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[6]/p[1]/a");
		Thread.sleep(1000);
	}		
	
	//��ҳ-��ѧ����-�����ϼ�-ͼ������7
	@Test(priority=3) 
	public void test9() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[7]/p[1]/a");
		Thread.sleep(1000);
	}
	
	//��ҳ-��ѧ����-�����ϼ�-ͼ������8
	@Test(priority=3) 
	public void test10() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[8]/p[1]/a");
		Thread.sleep(1000);
	}

	//��ҳ-��ѧ����-�����ϼ�-ͼ��ͼƬ1
	@Test(priority=3) 
	public void test11() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[1]/a/img");
		Thread.sleep(1000);
	}
	
	//��ҳ-��ѧ����-�����ϼ�-ͼ��ͼƬ2
	@Test(priority=3) 
	public void test12() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[2]/a/img");
		Thread.sleep(1000);
	}
	
	//��ҳ-��ѧ����-�����ϼ�-ͼ��ͼƬ3
	@Test(priority=3) 
	public void test13() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[3]/a/img");
		Thread.sleep(1000);
	}
	
	//��ҳ-��ѧ����-�����ϼ�-ͼ��ͼƬ4
	@Test(priority=3) 
	public void test14() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[4]/a/img");
		Thread.sleep(1000);
	}
	
	//��ҳ-��ѧ����-�����ϼ�-ͼ��ͼƬ5
	@Test(priority=3) 
	public void test15() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[5]/a/img");
		Thread.sleep(1000);
	}
	
	//��ҳ-��ѧ����-�����ϼ�-ͼ��ͼƬ6
	@Test(priority=3) 
	public void test16() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[6]/a/img");
		Thread.sleep(1000);
	}
		
	//��ҳ-��ѧ����-�����ϼ�-ͼ��ͼƬ7
	@Test(priority=3) 
	public void test17() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[7]/a/img");
		Thread.sleep(1000);
	}
	
	//��ҳ-��ѧ����-�����ϼ�-ͼ��ͼƬ8
	@Test(priority=3) 
	public void test18() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[8]/a/img");
		Thread.sleep(1000);
	}

	//��ҳ-��ѧ����-�����Ƽ�-ͼ������1
	@Test(priority=3) 
	public void test19() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[1]/p[1]/a");
		Thread.sleep(1000);
	}	
	
	//��ҳ-��ѧ����-�����Ƽ�-ͼ������2
	@Test(priority=3) 
	public void test20() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[2]/p[1]/a");
		Thread.sleep(1000);
	}	
	
	//��ҳ-��ѧ����-�����Ƽ�-ͼ������3
	@Test(priority=3) 
	public void test21() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[3]/p[1]/a");
		Thread.sleep(1000);
	}	
	
	//��ҳ-��ѧ����-�����Ƽ�-ͼ������4
	@Test(priority=3) 
	public void test22() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[4]/p[1]/a");
		Thread.sleep(1000);
	}	
	
	//��ҳ-��ѧ����-�����Ƽ�-ͼ������5
	@Test(priority=3) 
	public void test23() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[5]/p[1]/a");
		Thread.sleep(1000);
	}	
	
	//��ҳ-��ѧ����-�����Ƽ�-ͼ������6
	@Test(priority=3) 
	public void test24() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[6]/p[1]/a");
		Thread.sleep(1000);
	}	
	
	//��ҳ-��ѧ����-�����Ƽ�-ͼ������7
	@Test(priority=3) 
	public void test25() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[7]/p[1]/a");
		Thread.sleep(1000);
	}	
	
	//��ҳ-��ѧ����-�����Ƽ�-ͼ������8
	@Test(priority=3) 
	public void test26() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[8]/p[1]/a");
		Thread.sleep(1000);
	}	
	
	//��ҳ-��ѧ����-�����Ƽ�-ͼ������9
	@Test(priority=3) 
	public void test27() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[9]/p[1]/a");
		Thread.sleep(1000);
	}	
	
	//��ҳ-��ѧ����-�����Ƽ�-ͼ������10
	@Test(priority=3) 
	public void test28() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[10]/p[1]/a");
		Thread.sleep(1000);
	}	

	//��ҳ-��ѧ����-�����Ƽ�-ͼ��ͼƬ1
	@Test(priority=3) 
	public void test29() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[1]/a/img");
		Thread.sleep(1000);
	}	
	
	//��ҳ-��ѧ����-�����Ƽ�-ͼ��ͼƬ2
	@Test(priority=3) 
	public void test30() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[2]/a/img");
		Thread.sleep(1000);
	}	
	
	//��ҳ-��ѧ����-�����Ƽ�-ͼ��ͼƬ3
	@Test(priority=3) 
	public void test31() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[3]/a/img");
		Thread.sleep(1000);
	}	
	
	//��ҳ-��ѧ����-�����Ƽ�-ͼ��ͼƬ4
	@Test(priority=3) 
	public void test32() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[4]/a/img");
		Thread.sleep(1000);
	}	
	
	//��ҳ-��ѧ����-�����Ƽ�-ͼ��ͼƬ5
	@Test(priority=3) 
	public void test33() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[5]/a/img");
		Thread.sleep(1000);
	}	
	
	//��ҳ-��ѧ����-�����Ƽ�-ͼ��ͼƬ6
	@Test(priority=3) 
	public void test34() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[6]/a/img");
		Thread.sleep(1000);
	}	
	
	//��ҳ-��ѧ����-�����Ƽ�-ͼ��ͼƬ7
	@Test(priority=3) 
	public void test35() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[7]/a/img");
		Thread.sleep(1000);
	}	
	
	//��ҳ-��ѧ����-�����Ƽ�-ͼ��ͼƬ8
	@Test(priority=3) 
	public void test36() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[8]/a/img");
		Thread.sleep(1000);
	}	
	
	//��ҳ-��ѧ����-�����Ƽ�-ͼ��ͼƬ9
	@Test(priority=3) 
	public void test37() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[9]/a/img");
		Thread.sleep(1000);
	}	
	
	//��ҳ-��ѧ����-�����Ƽ�-ͼ��ͼƬ10
	@Test(priority=3) 
	public void test38() throws InterruptedException {
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[10]/a/img");
		Thread.sleep(1000);
	}

//��̨�����ҵ�ͼ�鲿��
	//�����̨����-�ҵĵ���-�ҵ�ͼ��
	@Test(priority=4) 
	public void test39() throws InterruptedException {
		webtest.open("http://127.0.0.1:8088/index");
		//�ҵ�dd
		webtest.click("xpath=//*[@id=\"header_ul\"]/li[1]/div/button");
		Thread.sleep(1000);
		//��̨����
		webtest.click("xpath=//*[@id=\"header_ul\"]/li[1]/div/ul/li[2]/a");
		Thread.sleep(1000);
	}	
	
	@Test(priority=5) 
	public void test() throws InterruptedException {
		//�ҵĵ���
		webtest.click("xpath=//*[@id=\"left-menu-main\"]/div[4]/div[1]/h4/a");
		Thread.sleep(1000);
		//�ҵ�ͼ��
		webtest.click("xpath=//*[@id=\"collapseFour\"]/div/ul/li[2]/a");
		Thread.sleep(1000);
	}	

	//ͼ���������
	/*
	@Test(priority=3,dataProvider="excel2",dataProviderClass=NSDataProvider.class)
	
	public void test40(String s1) throws InterruptedException {
		webtest.open("/admin");
		webtest.type("name=keywords", s1);
		webtest.click("xpath=//input[@type='submit']");
	}
	*/
	@Test(priority=6) 
	public void test40() {
		webtest.open("http://127.0.0.1:8088/admin");
		webtest.type("name=keywords", "ͼ��1");
		webtest.click("xpath=//input[@type='submit']");
		
	}
	
	//ͼ���¼�
	@Test(priority=7) 
	public void test41() throws InterruptedException {
		webtest.click("xpath=/html/body/div/table/tbody/tr/td[10]/button[2]");
		Thread.sleep(1000);
	}	
	
	//ͼ��ɾ��
	@Test(priority=7) 
	public void test42() throws InterruptedException {
		webtest.click("xpath=/html/body/div/table/tbody/tr/td[10]/button[3]");
		Thread.sleep(1000);
	}	
	
	//ͼ��༭
	@Test(priority=7) 
	public void test43() throws InterruptedException {
		webtest.click("xpath=/html/body/div/table/tbody/tr/td[10]/button[1]");
		Thread.sleep(1000);
	}	
	
	//ͼ��༭-���⡢�۸񡢶��ۡ���桢����
	@Test(priority=8) 
	public void test44() {
		webtest.type("name=name", "ͼ��2");
		webtest.type("nanme=price", "2");
		webtest.type("name=marketPrice", "2");
		webtest.type("name=storeMount", "2");
		webtest.type("name=author", "2");
		webtest.click("xpath=//input[@type='submit']");
	}
	
}
