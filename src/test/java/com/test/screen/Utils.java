package com.test.screen;

import com.test.Hooks;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;
import java.util.HashMap;

import static com.test.Hooks.getDriver;

public class Utils {

    public void validateTxt(RemoteWebElement element, String txt) {
        String texto = element.getText();
        assert texto.equals(txt);
    }

    public void scrollToTextAndroid(String txt) {
        try {
            ((AndroidDriver)getDriver()).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + txt + "\").instance(0))");
        } catch (Exception e) {
            throw new NoSuchElementException("Não encontrado" + e);
        }
    }

    public void scrollIos(RemoteWebElement elemento) {
        HashMap scrollObjects = new HashMap();
        scrollObjects.put("element", elemento);
        scrollObjects.put("direction", "up");
        Hooks.getDriver().executeScript("mobile: swipe", scrollObjects);
    }

    public void scroll(double inicio, double fim) {
        Dimension size = getDriver().manage().window().getSize();

        int x = size.width / 2;
        int start_y = (int) (size.height * inicio);
        int end_y = (int) (size.height * fim);
        new TouchAction(getDriver()).press(PointOption.point(new Point(x, start_y))).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).moveTo(PointOption.point(new Point(x, end_y))).release().perform();
    }

    public void validateProduto(MobileElement element, String txt) {
        String texto = element.getText();
        assert texto.equals(txt);
    }



}