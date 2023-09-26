package com.test.screen;

import com.test.Hooks;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.HashMap;

public class ScreenLogin extends BaseScreen {

    @AndroidFindBy(accessibility = "email")
    @iOSXCUITFindBy(accessibility = "email")
    public MobileElement fieldEmail;

    @AndroidFindBy(accessibility = "password")
    @iOSXCUITFindBy(accessibility = "password")
    public MobileElement fieldPass;

    @AndroidFindBy(accessibility = "login-button")
    @iOSXCUITFindBy(accessibility = "login-button")
    public MobileElement btnLogin;

    @AndroidFindBy(id = "login_button")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"55555\"])[2]")
    public MobileElement elementoios;

    public void writeEmail() {
        fieldEmail.sendKeys("teste@teste.com");
    }

    public void writePass() {
        fieldPass.sendKeys("123456");
    }

    public void clickButtonEnter() {
        btnLogin.click();
    }

    public void writeEmail2(String txt) {
        fieldEmail.sendKeys(txt);
    }

}