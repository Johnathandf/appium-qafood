package com.test.screen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class ScreenCarrinho extends  BaseScreen{

    @AndroidFindBy(accessibility = "confirm-order-button")
    @iOSFindBy(accessibility = "confirm-order-button")
    public RemoteWebElement botaoConfirmarPedido;
}
