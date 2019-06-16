package com.example.lineartest.pages;

import com.example.lineartest.utils.Actions;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;


public class MyPage {
    AndroidDriver driver;
    Actions action;
    IndexPage index;

   
    @FindBy(id = "me.tictok.linear:id/settings")
    WebElement btn_settings;
    @FindBy(id = "me.tictok.linear:id/logout")
    WebElement btn_logout;
   
   
    @FindBy(id = "me.tictok.linear:id/ic_delete")
    WebElement btn_del;

    public MyPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
        index = new IndexPage(driver);
    }

 
    public void logout(){
        index.click_index("æˆ‘çš„");
        action.click(btn_settings);
        action.click(btn_logout);
    }

    
       
    AndroidDriver driver;
    Actions actions;
    public MinePage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        actions = new Actions(driver);
    }

  
    public void exit(){
        List<WebElement> texts = driver.findElementsByClassName("android.widget.TextView");
        for(int i=0;i<texts.size();i++){
            if(texts.get(i).getText().equals("ÎÒµÄ")){
                texts.get(i).click();
                break;
            }
        }
        actions.click(set);
        actions.click(exit);
        actions.click(btn_ok);

}
