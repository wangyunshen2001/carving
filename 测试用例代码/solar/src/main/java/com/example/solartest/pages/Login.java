package com.example.solartest.pages;

import com.example.solartest.utils.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Login{
    AndroidDriver driver;
    Actions action;
    @FindBy(id = "com.example.lx.solarfragment:id/login_name")
    WebElement txt_name;
    @FindBy(id="com.example.lx.solarfragment:id/password")
    WebElement txt_password;
    @FindBy(id="com.example.lx.solarfragment:id/login")
    WebElement btn_login;


    public Login(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }
    public void login(String name,String password) throws InterruptedException {
        Thread.sleep(5000);
      
        action.type(txt_name,name);
        action.type(txt_password,password);
      
        action.click(btn_login);
    }

}
