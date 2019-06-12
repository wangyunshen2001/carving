package com.example.solartest.pages;

import com.example.solartest.utils.Actions;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;


public class ChangeUserPage {
    AndroidDriver driver;
    Actions action;
    IndexPage indexPage;
    MorePage morePage;
    LoginPage loginPage;

    public ChangeUserPage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
        indexPage = new IndexPage(driver);
        morePage = new MorePage(driver);
        loginPage = new LoginPage(driver);
    }

    public void change(String name,String password){
        indexPage.click("more");
        morePage.click("«–ªª’À∫≈");
        try {
            loginPage.login(name,password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }