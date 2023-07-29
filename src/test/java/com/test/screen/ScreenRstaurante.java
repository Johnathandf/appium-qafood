package com.test.screen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class ScreenRstaurante extends BaseScreen{

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"add-item-buttom\"])[1]/android.widget.ImageView")
    @iOSFindBy(xpath = "(//XCUIElementTypeOther[@name=\"add-item-buttom\"])[1]")
    public RemoteWebElement AddItem;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"add-item-buttom\"])[2]/android.widget.ImageView")
    @iOSFindBy(xpath = "(//XCUIElementTypeOther[@name=\"add-item-buttom\"])[8]")
    public RemoteWebElement AddItemRefri;


    @AndroidFindBy(accessibility = "open-cart-button")
    @iOSFindBy(accessibility = "open-cart-button")
    public RemoteWebElement IrAoCarrinho;
}
