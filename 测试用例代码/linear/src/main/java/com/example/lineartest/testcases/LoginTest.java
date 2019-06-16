package com.example.lineartest.testcases;

import com.example.lineartest.base.BaseTest;
import com.example.lineartest.pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.prefs.BackingStoreException;


public class LoginTest extends BaseTest {
    @Test
    public void loginSuccess(){
        LoginPage login = new LoginPage(getDriver());
        login.login("sienna","123456");
        Assert.assertEquals(getDriver().currentActivity(),".MainActivity");
    }

    @Test
    public void testLoginFailed(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginInit("ugi","123456");
        if(getDriver().findElement(By.id("me.tictok.linear:id/btnLogin")).isDisplayed()) {
            assert (true);
            System.out.println("Linear:testLoginFailed≥…π¶");
        }
        else{
            assert(false);
            System.out.println("Linear:testLoginFailed ß∞‹");
        }
    }
}
