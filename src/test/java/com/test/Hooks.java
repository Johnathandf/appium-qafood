package com.test;

import com.test.screen.ScreenPagamento;
import com.test.screen.Utils;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

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
            capabilities.setCapability("app", "/Users/johnathanf/Documents/appium-qafood/apps/qafood.apk");
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("platformName", "Android");
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } else if (platform.equals("ios")) {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "/Users/johnathanf/Documents/appium-qafood/apps/qazandoqafood.app");
            capabilities.setCapability("deviceName", "iPhone 14 Pro");
            capabilities.setCapability("platformName", "IOS");
            capabilities.setCapability("platformVersion", "16.4");
            capabilities.setCapability("automationName", "XCUITest");
            capabilities.setCapability("udid", "9B72B42A-EA44-4A10-8B76-C09F11F58947");
            capabilities.setCapability("resetkeyBoard", true);
            capabilities.setCapability("unicodeKeyBoard", true);
            driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
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