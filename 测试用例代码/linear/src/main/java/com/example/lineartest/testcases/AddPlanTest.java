package com.example.lineartest.testcases;

import com.example.lineartest.base.BaseTest;
import com.example.lineartest.pages.AddPlanPage;
import com.example.lineartest.pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddPlanTest extends BaseTest {
    @BeforeClass
    public void login(){
        LoginPage login = new LoginPage(getDriver());
        login.login("sienna","123456");
    }

    @Test
    public void addPlanSuccess(){

        AddPlanPage add = new AddPlanPage(getDriver());
        add.addplan();
        Assert.assertEquals(getDriver().currentActivity(),".MainActivity");
    }
}
