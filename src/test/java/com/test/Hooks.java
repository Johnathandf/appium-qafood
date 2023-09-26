package com.test;

import com.test.screen.ScreenPagamento;
import com.test.screen.Utils;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class Hooks {
    ScreenPagamento pagamento = new ScreenPagamento();
    Utils utils = new Utils();
    private static AppiumDriver<?> driver;
    public static String platform = "";

    public static AppiumDriver<?> validateDriver() throws MalformedURLException {

        platform = System.getProperty("plataforma");
        System.out.println("Sua plataforma é: " + platform);

        if(platform.equals("android")) {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("appium:platformName", "Android");
            capabilities.setCapability("appium:deviceName", "emulator-5554");
            capabilities.setCapability("appium:app", "/Users/johnathanf/Documents/appium-qafood/apps/qafood.apk");
            capabilities.setCapability("appium:automationName", "UiAutomator2");
            driver = new AndroidDriver(new URL("http://localhost:4723/"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } else if (platform.equals("ios")) {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("appium:app", "/Users/johnathanf/Documents/appium-qafood/apps/qazandoqafood.app");
            capabilities.setCapability("appium:deviceName", "iPhone 15 Pro Max");
            capabilities.setCapability("appium:platformName", "IOS");
            capabilities.setCapability("appium:platformVersion", "17.0");
            capabilities.setCapability("appium:automationName", "XCUITest");
            capabilities.setCapability("appium:udid", "CBFF4773-9B3E-4B56-AE3D-2AD8ACF16B6C");
            capabilities.setCapability("appium:resetkeyBoard", true);
            capabilities.setCapability("appium:unicodeKeyBoard", true);
            driver = new IOSDriver<>(new URL("http://localhost:4723/"), capabilities);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        } else if (platform.equals("devicefarm")) {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            // Set your access credentials
            capabilities.setCapability("browserstack.user", "seu user");
            capabilities.setCapability("browserstack.key", "sua key");

            // Set URL of the application under test
            capabilities.setCapability("app", "bs://44ff73dea22d9887fef5d025889871525df95b76");

            // Specify device and os_version for testing
            capabilities.setCapability("device", "Google Pixel 3");
            capabilities.setCapability("os_version", "9.0");

            driver = new AndroidDriver(new URL("http://hub.browserstack.com/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        else {
            System.out.println("Plataforma não encontrada. Utilize android ou ios");
        }
        return driver;
    }

    public static AppiumDriver<?> getDriver(){
        return driver;
    }

    public static void quitDriver() {
        if(driver != null) {
            driver.quit();
        }
    }

    public void ScollPlatform(){
        String platform;
        platform = System.getProperty("plataforma");
        if(platform.equals("android")) {
            utils.scrollToTextAndroid("Dinheiro");
        }else{
            utils.scrollIos(pagamento.elementoDinheiro);
        }
    }

    @Before
    public static void startProject() throws MalformedURLException {
        if (getDriver() != null){
            getDriver().launchApp();
        } else {
            validateDriver();
        }
    }
}