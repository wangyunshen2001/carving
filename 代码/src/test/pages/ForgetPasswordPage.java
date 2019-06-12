package com.example.solartest.pages;

import com.example.solartest.utils.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ForgetPasswordPage {
    AndroidDriver driver;
    Actions action;
   @FindBy(id = "com.example.lx.solarfragment:id/btn_forget")
   WebElement btn_forget;
   @FindBy(id = "com.example.lx.solarfragment:id/et_name")
   WebElement txt_name;
   @FindBy(id = "com.example.lx.solarfragment:id/et_phone")
   WebElement txt_phone;
    @FindBy(id = "com.example.lx.solarfragment:id/et_email")
    WebElement txt_email;
    @FindBy(id = "com.example.lx.solarfragment:id/btn")
    WebElement btn_submit;


    public ForgetPasswordPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }
    public void forgetPassword(String name,String phone,String email) throws InterruptedException {
        Thread.sleep(5000);
        action.click(btn_forget);
        action.type(txt_name,name);
        action.type(txt_phone,phone);
        action.type(txt_email,email);
        action.click(btn_submit);
    }
}