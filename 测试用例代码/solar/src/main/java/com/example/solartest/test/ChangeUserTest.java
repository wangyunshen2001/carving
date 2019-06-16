package com.example.solartest.test;

import com.example.solartest.base.BaseTest;
import com.example.solartest.pages.ChangeUserPage;
import com.example.solartest.pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ChangeUserTest extends BaseTest {
    @BeforeClass
    public void login() throws InterruptedException {
        LoginPage login = new LoginPage(getDriver());
        login.login("jia","4589567659");
    }

    @Test
    public void changeuser(){
        ChangeUserPage change = new ChangeUserPage(getDriver());
        change.change("hyi","iuoi");
        Assert.assertEquals(getDriver().currentActivity(),".MainActivity");
    }
}
