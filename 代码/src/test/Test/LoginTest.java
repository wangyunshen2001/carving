package com.example.solartest.test;

import com.example.solartest.base.BaseTest;
import com.example.solartest.dataprovider.NSDataProvider;
import com.example.solartest.pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

 
public class LoginTest extends BaseTest {
    @Test
    public void loginSuccess() throws InterruptedException {
        LoginPage loginsuccess = new LoginPage(getDriver());
        loginsuccess.login("jia","4589567659");
        Assert.assertEquals(getDriver().currentActivity(),".MainActivity");
    }

    @Test
    public void loginFail() throws InterruptedException {
        LoginPage loginsuccess = new LoginPage(getDriver());
        loginsuccess.login("jia","000");
        Assert.assertEquals(getDriver().currentActivity(),".LoginActivity");
    }
}