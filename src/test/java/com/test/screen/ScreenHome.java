package com.test.screen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class ScreenHome extends  BaseScreen{

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"address-button\"]/android.view.ViewGroup/android.widget.TextView")
    @iOSFindBy(id = "address-button")
    public RemoteWebElement SelectAddress;

    @AndroidFindBy(id = "android:id/button1")
    @iOSFindBy(id = "Permitir")
    public RemoteWebElement PoupUpPermitir;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"store-list-item\"])[1]")
    @iOSFindBy(xpath = "(//XCUIElementTypeOther[@name=\"store-list-item\"])[1]")
    public RemoteWebElement Restaurante;






    }
