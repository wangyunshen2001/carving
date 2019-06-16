package com.example.lx.solarfragment;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;

public class UiautomatorPrictice {

    private UiDevice device ;

    @Test
    public void testSolar(){
    //��¼
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        //���Home��
        device.pressHome();

        //���SolarApp
        UiObject logo = device.findObject(new UiSelector().text("Solar"));
        try {
            logo.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }

        //�����û�������
        UiObject username = device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/login_name"));
        UiObject password = device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/password"));
        UiObject login = device.findObject(new UiSelector().text(" ��  ¼ "));
        try {
            username.setText("jia");
            password.setText("4589567659");
            login.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }

    //������������
        //���ONE
        UiObject one = device.findObject(new UiSelector().text("ONE"));
        try {
            one.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
        //��ʼ��ʱ
        UiObject start = device.findObject(new UiSelector().text("25"));
        try {
            start.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
        //����
        device.pressBack();
    //��������
        //�����������
        UiObject more = device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/btn_more"));
        try {
            more.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    //�鿴����
        UiObject score = device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/ll_score_details"));
        try {
            score.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
        device.pressBack();
    //�л��˺�
        UiObject change = device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/ll_change_user"));
        try {
            change.click();
            username.setText("lisi");
            password.setText("123456");
            login.click();
            more.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }

    //ע�����û�
        UiObject register = device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/ll_zhu_ce"));
        try {
            register.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
        UiObject name = device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/username"));
        UiObject phone = device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/phone"));
        UiObject email = device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/email"));
        UiObject pwd = device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/password"));
        UiObject pwd2 = device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/qpassword"));

        try {
            name.setText("zhaosi");
            phone.setText("15222222223");
            email.setText("123@456.com");
            pwd.setText("123456");
            pwd2.setText("123456");
            device.findObject(new UiSelector().text("ע��")).click();
            username.setText("zhaosi");
            password.setText("123456");
            login.click();
            more.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }

    //����
        UiObject set = device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/ll_set_up"));
        try {
            set.click();
            device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/switch1"));
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
        device.pressBack();
    //�˳�
        UiObject logout = device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/ll_check_out"));
        try {
            logout.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testLinear(){
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        device.pressHome();
        try {
            device.findObject(new UiSelector().text("Linear")).click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
        //��¼
        UiObject login1 = device.findObject(new UiSelector().text("��¼"));
        UiObject username = device.findObject(new UiSelector().resourceId("me.tictok.linear:id/etUser"));
        UiObject password = device.findObject(new UiSelector().resourceId("me.tictok.linear:id/etPassword"));
        UiObject login2 = device.findObject(new UiSelector().resourceId("me.tictok.linear:id/btnLogin"));
        try {
            login1.click();
            username.setText("sienna");
            password.setText("123456");
            login2.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
        @Test
        //����һ���������Ӳ��ر�
        public  void test2() throws UiObjectNotFoundException,RemoteException {
            device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
            UiObject homeBtn =device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/image1"));
            homeBtn.click();
            UiObject oneBtn =device.findObject(new UiSelector().resourceId("com.example.lx.solarfragment:id/bt1"));
            oneBtn.click();
            UiObject tomatoBtn =device.findObject(new UiSelector().text("25"));
            tomatoBtn.click();
            UiObject giveupBtn =device.findObject(new UiSelector().text("GIVE UP"));
            giveupBtn.click();
        }
   
    //�˳���¼
        UiObject mine = device.findObject(new UiSelector().text("�ҵ�"));
        UiObject set = device.findObject(new UiSelector().text("����"));
        UiObject exit = device.findObject(new UiSelector().text("�˳���¼"));
        try {
            mine.click();
            set.click();
            exit.click();
            ok.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }


    }

}