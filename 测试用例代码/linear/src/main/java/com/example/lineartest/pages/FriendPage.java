package com.example.lineartest.pages;

import com.example.lineartest.utils.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;

public class FriendPage {

    @FindBy(id = "me.tictok.linear:id/input_text")
    WebElement input_text;
    @FindBy(id = "me.tictok.linear:id/send")
    WebElement img_send;

    public FriendPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        actions = new Actions(driver);
    }
    //鎵惧埌涓�涓ソ鍙�
    public WebElement findfriend(int i){
        List<WebElement> friend = driver.findElementsById("me.tictok.linear:id/recentContent");
        return friend.get(i);
    }

    public void chat(int friendnum,String text){
        index.click_index("濂藉弸");
        action.click(findfriend(friendnum));
        action.type(input_text,text);
        action.click(img_send);

    }
}
