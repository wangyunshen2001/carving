package com.example.solartest.test;

import com.example.solartest.base.BaseTest;
import com.example.solartest.pages.LoginPage;
import com.example.solartest.pages.TaskPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DeleteTaskTest extends BaseTest {
    @BeforeClass
    public void login() throws InterruptedException {
        LoginPage login = new LoginPage(getDriver());
        login.login("jia","4589567659");
    }

    @Test
    public void delete(){
        TaskPage taskPage = new TaskPage(getDriver());
        taskPage.deleteTask(1);
    
    }
}
