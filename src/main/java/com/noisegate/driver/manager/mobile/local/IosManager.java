package com.noisegate.driver.manager.mobile.local;

import com.noisegate.config.factory.ConfigFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public final class IosManager {

    private IosManager() {
    }

    public static WebDriver getDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", Platform.IOS);
        capabilities.setCapability("appium:automationName", "XCUItest");
        capabilities.setCapability("appium:app", System.getProperty("user.dir") + "/ApiDemos-debug.ipa");
        capabilities.setCapability("appium:deviceName", "iPhone Simulator");
        capabilities.setCapability("appium:platformVersion", "17.2");

        return new RemoteWebDriver(ConfigFactory.getConfig().localAppiumServerURL(), capabilities);
    }
}