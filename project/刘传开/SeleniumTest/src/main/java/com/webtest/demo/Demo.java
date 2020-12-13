package com.webtest.demo;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
    @Test
    public void test1(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test2(){
        Assert.assertEquals(2,1);
    }

    @Test
    public void test3(){
        Assert.assertEquals(2,3);
    }
    @Test
    public void test4(){
        Assert.assertEquals(4,4);
    }
    @Test
    public void test5(){
        Assert.assertEquals(5,5);
    }



}
