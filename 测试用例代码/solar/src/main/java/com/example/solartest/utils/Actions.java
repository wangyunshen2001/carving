package com.example.solartest.utils;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

public class Actions {
    AndroidDriver<WebElement> driver;
    AndroidTouchAction aca;
    TouchAction ta;
    public Actions(AndroidDriver<WebElement> driver){
        this.driver=driver;
        aca= new AndroidTouchAction(driver);
        ta = new TouchAction(driver);
    }

    public void type(WebElement element,String context){
        element.sendKeys(context);
    }

    public void click(WebElement element){
        element.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
   
    public void longPress(WebElement ele){
        ta.longPress(element(ele)).perform();
    }
   
 
    public void type(WebElement element,String Context){
        element.sendKeys(Context);
    }


    public void click(WebElement element){
        element.click();
    }

 
    public void longPress(WebElement ele){
//        this.dragDrop.longPress(element(ele)).perform();
        WebElement node = driver.findElementById("com.example.todolist:id/toDoItemDetailTv");
            TouchAction LongPress = new TouchAction(driver);
            LongPress.longPress(element(node)).perform();


    }
}
