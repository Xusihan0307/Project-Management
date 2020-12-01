package com.webtest.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Demo {
    public WebDriver driver;
    String url = "http://localhost:8088/";


/*
    @BeforeTest
    public void BeforeTest() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","D:\\demo\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        Thread.sleep(1000);
    }
    */

    @Test
    public void test1() {

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[2]/a")).click();
        String title = driver.getCurrentUrl();
        Assert.assertEquals(title, "http://localhost:8088/index/category/2");
        driver.quit();

    }

    @Test
    public void test2() {
        driver.findElement(By.className("carousel-inner")).click();
        String title = driver.getTitle();
        Assert.assertEquals(title, "dd图书，买你所想，买你所爱，你值得拥有");
        driver.quit();
    }

    @Test
    public void test3() {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[1]/a/img")).click();
        String FirstHandle = driver.getWindowHandle();     //首先得到最先的窗口 权柄
            for (String winHandle : driver.getWindowHandles()) {    //得到浏览器所有窗口的权柄为Set集合，遍历
                if (winHandle.equals(FirstHandle)) {                //如果为 最先的窗口 权柄跳出
                    continue;
                }
                driver.switchTo().window(winHandle);             //如果不为 最先的窗口 权柄，将 新窗口的操作权柄  给 driver
                System.out.println(driver.getCurrentUrl());     //打印是否为新窗口
                Assert.assertEquals(driver.getTitle(), "书籍详情");
        }
        driver.quit();

    }

    @Test
    public void test4() {

        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/ul/li[1]/a/img")).click();
        String FirstHandle = driver.getWindowHandle();     //首先得到最先的窗口 权柄
        for (String winHandle : driver.getWindowHandles()) {    //得到浏览器所有窗口的权柄为Set集合，遍历
            if (winHandle.equals(FirstHandle)) {                //如果为 最先的窗口 权柄跳出
                continue;
            }
            driver.switchTo().window(winHandle);             //如果不为 最先的窗口 权柄，将 新窗口的操作权柄  给 driver
            System.out.println(driver.getCurrentUrl());     //打印是否为新窗口
            Assert.assertEquals(driver.getTitle(), "书籍详情");
            driver.quit();
        }
    }


    @Test
    public void test5 () {
        driver.get("http://localhost:8088/book/info/10");
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[1]/div/a/img")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/book/info/10");
        driver.quit();

    }

    @Test
    public void test6 (){
        driver.get("http://localhost:8088/book/info/10");
        int  i;
        for(i=0;i<15;i++)
        {
            driver.findElement(By.xpath("//*[@id=\"num_add\"]")).click();
        }
        String num=driver.findElement(By.id("buy_num")).getText();
        Assert.assertEquals(num,"10");
        driver.quit();
    }
    @Test
    public void test7 (){
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[1]/a/img")).click();
        String FirstHandle = driver.getWindowHandle();     //首先得到最先的窗口 权柄
        for (String winHandle : driver.getWindowHandles()) {    //得到浏览器所有窗口的权柄为Set集合，遍历
            if (winHandle.equals(FirstHandle)) {                //如果为 最先的窗口 权柄跳出
                continue;
            }
            driver.switchTo().window(winHandle);             //如果不为 最先的窗口 权柄，将 新窗口的操作权柄  给 driver
            System.out.println(driver.getCurrentUrl());
            driver.findElement(By.xpath("/html/body/div[4]/div[4]/div[1]/div/ul/li[1]/p[1]/a/img")).click();
            String SecondHandle = driver.getWindowHandle();     //首先得到最先的窗口 权柄
            for (String win1Handle : driver.getWindowHandles()) {    //得到浏览器所有窗口的权柄为Set集合，遍历
                if (win1Handle.equals(SecondHandle)) {                //如果为 最先的窗口 权柄跳出
                    continue;
                }
            }
        }
        driver.quit();

    }

    @Test
    public void test8(){
        driver.get("http://localhost:8088/book/info/10");
        driver.findElement(By.className("add_cart")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/page/login");
        driver.quit();
    }
    @Test
    public void test9(){
        driver.get("http://localhost:8088/book/info/10");
        driver.findElement(By.className("buy_now")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/page/login");
        driver.quit();
    }

    @Test
    public void test10(){
        driver.get("http://localhost:8088/book/info/10");
        driver.findElement(By.xpath("/html/body/div[4]/div[4]/div[2]/ul/li[2]/a")).click();
        String commit =driver.findElement(By.id("book_comment_content")).getText();
        Assert.assertEquals(commit,"商品评论");
        driver.quit();
    }

    @Test
    public void test11(){
        driver.get("http://localhost:8088/book/info/10");
        driver.findElement(By.className("add_cart")).click();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.id("loginButton")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088");
        driver.quit();
    }

    @Test
    public void test12(){
        driver.get("http://localhost:8088/book/info/10");
        driver.findElement(By.className("buy_now")).click();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.id("loginButton")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088");
        driver.quit();
    }

    @Test
    public void test13(){

        driver.findElement(By.xpath("/html/body/div[4]/div[4]/div[1]/div")).click();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[3]/ul/li[1]/a/img")).click();
        String FirstHandle = driver.getWindowHandle();     //首先得到最先的窗口 权柄
        for (String winHandle : driver.getWindowHandles()) {    //得到浏览器所有窗口的权柄为Set集合，遍历
            if (winHandle.equals(FirstHandle)) {                //如果为 最先的窗口 权柄跳出
                continue;
            }
            driver.switchTo().window(winHandle);             //如果不为 最先的窗口 权柄，将 新窗口的操作权柄  给 driver
            driver.findElement(By.className("buy_now")).click();
            String sentence = driver.findElement(By.className("success_text")).getText();
            Assert.assertEquals(sentence, "商品已成功添加到购物车中！");
        }
    }

    @Test
    public void test14(){
        driver.get("http://localhost:8088/book/info/10");
        driver.findElement(By.className("buy_now")).click();
        String sentence = driver.findElement(By.className("title order_title")).getText();
        Assert.assertEquals(sentence,"收货人信息");
    }

    @Test
    public void test15(){
        driver.get("http://localhost:8088/order/info?bookId=10&buyNum=1");
        driver.findElement(By.id("address")).clear();
        driver.findElement(By.id("checkout_btn")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/order/creation");
    }

    @Test
    public void test16(){
        driver.get("http://localhost:8088/order/info?bookId=10&buyNum=1");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.id("checkout_btn")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/order/creation");
    }
    @Test
    public void test17(){
        driver.get("http://localhost:8088/order/creation");
        driver.findElement(By.className("toShopping")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/order/list");
    }

    @Test
    public void test18(){
        driver.get("http://localhost:8088/order/creation");
        driver.findElement(By.className("toCart")).click();
        String sentence=driver.findElement(By.className("lt-text ft-yh")).getText();
        Assert.assertEquals(sentence,"登陆支付宝账户付款");
    }
    @Test
    public void test19(){
        driver.get("http://localhost:8088/order/creation");
        driver.findElement(By.className("toCart")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[2]/ul/li/div/form/div/div[1]/div/div[2]/div/div[5]/div[2]/a/span"))
        .click();
        Assert.assertEquals(driver.findElement(By.className("mi-form-explain fn-inline")).getText(),"请填写支付宝账户");
    }
    @Test
    public void test20(){
        driver.get("http://localhost:8088/order/creation");
        driver.findElement(By.className("toCart")).click();
        driver.findElement(By.name("payPasswd_rsainput")).sendKeys("111111");
        String username=driver.findElement(By.id("J_tLoginId")).getText();
        Assert.assertEquals(username,":ynkltg9762@sandbox.com");
    }
    @Test
    public void test21(){
        driver.get("http://localhost:8088/order/creation");
        driver.findElement(By.className("toCart")).click();
        driver.findElement(By.id("J_tLoginId")).sendKeys("ynkltg9762@sandbox.com");
        String password=driver.findElement(By.name("payPasswd_rsainput")).getText();
        Assert.assertEquals(password,"111111");
    }

    @Test
    public void test22(){
        driver.get("http://localhost:8088/order/creation");
        driver.findElement(By.className("toCart")).click();
        driver.findElement(By.id("J_tLoginId")).sendKeys("lynkltg9762@sandbox.com");
        driver.findElement(By.name("payPasswd_rsainput")).sendKeys("111111");
        Assert.assertEquals(driver.findElement(By.id("J_tLoginId")).getText(),"lynkltg9762@sandbox.com");
    }
    @Test
    public void test23(){
        driver.get("http://localhost:8088/order/creation");
        driver.findElement(By.className("toCart")).click();
        driver.findElement(By.id("J_tLoginId")).sendKeys("ynkltg9762@sandbox.com");
        driver.findElement(By.name("payPasswd_rsainput")).sendKeys("1111111");
        Assert.assertEquals(driver.findElement(By.name("payPasswd_rsainput")).getText(),"111111");
    }
    @Test
    public void test24(){
        driver.get("http://localhost:8088/order/creation");
        driver.findElement(By.className("toCart")).click();
        driver.findElement(By.id("J_tLoginId")).sendKeys("ynkltg9762@sandbox.com");
        driver.findElement(By.name("payPasswd_rsainput")).sendKeys("111111");
        Assert.assertEquals(driver.findElement(By.name("payPasswd_rsainput")).getText(),"111111");
        Assert.assertEquals(driver.findElement(By.id("J_tLoginId")).getText(),"lynkltg9762@sandbox.com");
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[2]/ul/li/div/form/div/div[1]/div/div[2]/div/div[5]/div[2]/a/span"))
                .click();
    }
    @Test
    public void test25(){
        driver.get("https://cashier.alipaydev.com/standard/lightpay/lightPayCashier.htm?orderId=1125ce42dd838d465f0000-2-2NN1103&bizIdentity=trade20001&outBizNo=2020112522001411100501391999&timeStamp=1606271846916&country=CN");
        driver.findElement(By.xpath("/*[@id=\"ch-0\"]")).click();
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/h1")).getText(),"502 Bad Gateway");

    }//*[@id="ch-0"]

    @Test
    public void test26(){
        driver.get("http://localhost:8088/order/info?bookId=10&buyNum=1");
        driver.findElement(By.xpath("/html/body/div[4]/form/div[5]/dl/select")).click();
        driver.findElement(By.xpath("/html/body/div[4]/form/div[5]/dl/select/option[2]")).click();
        driver.findElement(By.id("checkout_btn")).click();
        driver.findElement(By.className("toCart")).click();
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/h1[4]")).getText(),"打开微信扫一扫");

    }//*[@id="orderForm"]
    @Test
    public void test27(){
        driver.get("http://localhost:8088");
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[2]/a")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/book/list?cateId=2");

    }
    @Test
    public void test28(){
        driver.get("http://localhost:8088/book/list?cateId=2");
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/ul/li[1]/div/p/a[2]")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/book/list?cateId=2");
    }
    @Test
    public void test29(){
        driver.get("http://localhost:8088/book/list?cateId=2");
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/ul/li[1]/a/img")).click();
        String FirstHandle = driver.getWindowHandle();     //首先得到最先的窗口 权柄
        for (String winHandle : driver.getWindowHandles()) {    //得到浏览器所有窗口的权柄为Set集合，遍历
            if (winHandle.equals(FirstHandle)) {                //如果为 最先的窗口 权柄跳出
                continue;
            }
            driver.switchTo().window(winHandle);             //如果不为 最先的窗口 权柄，将 新窗口的操作权柄  给 driver
            System.out.println(driver.getCurrentUrl());

            Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:8088/book/info/1");
        }
    }
    @Test
    public void test30(){
        driver.get("http://localhost:8088/book/list?keywords=&cateId=2&page=1");
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[1]/a")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/book/list?keywords=&cateId=2&page=1");
    }

    @Test
    public void test31(){
        driver.get("http://localhost:8088/book/list?keywords=&cateId=2&page=1");
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[8]/a")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/book/list?keywords=&cateId=2&page=2");
    }

    @Test
    public void test32(){
        driver.get("http://localhost:8088/book/list?keywords=&cateId=2&page=1");
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[3]/a")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/book/list?keywords=&cateId=2&page=2");

    }
    @Test
    public void test33(){
        driver.get("http://localhost:8088/book/list?keywords=&cateId=2&page=6");
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[8]/a")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/book/list?keywords=&cateId=2&page=6");
    }
    @Test
    public void test34(){
        driver.get("http://localhost:8088/book/list?keywords=&cateId=2&page=1");
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/ul/li[1]/div/p/a[1]")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/cart/addition?bookId=1&buyNum=1");
    }

    @Test
    public void test35(){
        driver.get("http://localhost:8088/book/info/10");
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[2]/div[2]/span[1]/a[1]")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088");
    }
    @Test
    public void test36(){
        driver.get("http://localhost:8088/admin");
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/admin");
    }
    @Test
    public void test37(){
        driver.get("http://localhost:8088/admin");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[5]/div[1]/h4/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[5]/div[2]/div/ul/li[1]/a")).click();
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/svg/text[1]/tspan")).getText(),"书籍访问量前8名");
    }
    @Test
    public void test38(){
        driver.get("http://localhost:8088/admin");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[7]/div[1]/h4/a")).click();
        driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[7]/div[2]/div/ul/li[1]/a")).click();
        String FirstHandle = driver.getWindowHandle();     //首先得到最先的窗口 权柄
        for (String winHandle : driver.getWindowHandles()) {    //得到浏览器所有窗口的权柄为Set集合，遍历
            if (winHandle.equals(FirstHandle)) {                //如果为 最先的窗口 权柄跳出
                continue;
            }
            driver.switchTo().window(winHandle);             //如果不为 最先的窗口 权柄，将 新窗口的操作权柄  给 driver
            System.out.println(driver.getCurrentUrl());
        }
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088");
    }
    @Test
    public void test39(){
        driver.get("http://localhost:8088");
        driver.findElement(By.xpath("/html/body/div[6]/div/dl[1]/dd[1]/a")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088");
    }
    @Test
    public void test40(){
        driver.get("http://localhost:8088");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/a/img")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088");
    }
    @Test
    public void test41(){
        driver.get("http://localhost:8088/book/info/10");
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/a/img")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088");
    }
    @Test
    public void test42(){
        driver.get("http://localhost:8088/book/info/10");
        for(int i=0;i<15;i++) {
            driver.findElement(By.xpath("//*[@id=\"num_sub\"]")).click();
        }
        String num=driver.findElement(By.id("buy_num")).getText();
        Assert.assertEquals(num,"1");
        }

        @Test
        public void test43(){
        driver.get("http://localhost:8088/order/info?bookId=10&buyNum=1");
        driver.findElement(By.xpath("/html/body/div[4]/form/div[1]")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/cart/items");
        }
        @Test
        public void test44(){
            driver.get("http://localhost:8088");
            driver.findElement(By.id("keywords")).sendKeys("java");
            Assert.assertEquals(driver.findElement(By.className("search_word")).getText(),"java");
        }
        @Test
        public void test45(){
            driver.get("http://localhost:8088");
            driver.findElement(By.id("keywords")).sendKeys("!@#$#@$%$");
            Assert.assertEquals(driver.findElement(By.className("red")).getText(),"0");
        }
        @Test
        public void test46(){
            driver.get("http://localhost:8088");
            driver.findElement(By.id("keywords")).sendKeys("");
            Assert.assertEquals(driver.findElement(By.className("searc_word")).getText(),"java");
        }
        @Test
        public void test47(){
            driver.get("http://localhost:8088");
            driver.findElement(By.id("keywords")).sendKeys("agfdghgfcdvfbghytrfesddtrtewea243457643245675643524331eqwfwsrg54352qewdafesgrzey5434rwfsgrhdt5y4twefsgdbfnxtj6y5etgvbfdngfxytjryegdbfngmkyuu6ryegdhfgnyk7u65y4tesgdfhtrsy5e4atwfqasdgrhezy534twf");
            Assert.assertEquals(driver.findElement(By.className("red")).getText(),"0");
        }
        @Test
        public void test48(){
            driver.get("http://localhost:8088");
            driver.findElement(By.className("title")).click();
            Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8088/");
        }
        @Test
        public void test49(){
            driver.get("http://localhost:8088/order/info?bookId=10&buyNum=1");
            driver.findElement(By.xpath("/html/body/div[4]/form/div[3]/table/tbody/tr[1]/td[1]/a/img")).click();
            Assert.assertEquals(driver.getTitle(),"书籍详情");
        }
        @Test
        public void test50(){
        driver.get("http://localhost:8088/order/list");
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/table/tbody/tr[1]/td[6]/button[2]")).click();
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[4]/div/h1")).getText(),"亲，您还没有已提交的订单，再逛一逛吧!");
        }
        @BeforeTest
    public void BeforeTest() throws InterruptedException {
            driver.get("http://localhost:8088/book/list?keywords=&cateId=2&page=6"); System.setProperty("webdriver.gecko.driver","D:\\demo\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        Thread.sleep(1000);
    }


//    @AfterTest
//    public void AfterTest() {
//        driver.quit();
//    }

}
