package com.test.screen;

import com.test.Hooks;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BaseScreen {

    public BaseScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(Hooks.getDriver()), this);
    }
}
