package com.noisegate.driver.manager.mobile;

import com.noisegate.config.factory.ConfigFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public final class AndroidManager {

    private AndroidManager() {
    }

    public static WebDriver getDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", Platform.ANDROID);
        capabilities.setCapability("appium:automationName", "UIAutomator2");
        capabilities.setCapability("appium:app", System.getProperty("user.dir") + "/android-app.apk");
        capabilities.setCapability("appium:platformVersion", "14.0");

        return new RemoteWebDriver(ConfigFactory.getConfig().localAppiumServerURL(), capabilities);

    }
}