package com.webtest.demo;

import org.apache.poi.hssf.record.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class adminPage {


    public WebDriver driver;
    String url="http://localhost:8088/admin";
    @Test
    public void test36() {
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/admin");
    }
    @Test
    public void test37(){
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[3]/div[1]/ul/li[1]")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/");
    }
    @Test
    public void test38(){
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[3]/div[2]/ul/li[1]")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/");
    }

    @BeforeMethod
    public void BeforeTest() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","D:\\demo\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(url);
        Thread.sleep(1000);
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("123");
        Thread.sleep(1000);
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(1000);
    }
    @AfterMethod
    public void AfterTest() {

        driver.quit();
    }

}
