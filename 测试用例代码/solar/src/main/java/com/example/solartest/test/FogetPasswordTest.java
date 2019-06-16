package com.example.solartest.test;

import com.example.solartest.base.BaseTest;
import com.example.solartest.pages.ForgetPasswordPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FogetPasswordTest extends BaseTest {

    @Test
    public void fpSuccess() throws InterruptedException {
        ForgetPasswordPage fp = new ForgetPasswordPage(getDriver());
        fp.forgetPassword("jia","74658932","43785485");
        Assert.assertEquals(getDriver().currentActivity(),".LoginActivity");
        
    }

    @Test
    public void fpFail() throws InterruptedException {
        ForgetPasswordPage fp = new ForgetPasswordPage(getDriver());
        fp.forgetPassword("jia","74658932","43785485");
        Assert.assertEquals(getDriver().currentActivity(),".ForgetActivity");
      
        getDriver().navigate().back();
    }
}
