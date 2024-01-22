package com.noisegate.driver.manager.mobile.remote;


import com.noisegate.config.factory.BrowserStackConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.HashMap;

public final class BrowserStackAndroidManager {

  private BrowserStackAndroidManager() {
  }

  public static WebDriver getDriver() {
    DesiredCapabilities capabilities = new DesiredCapabilities();

    // Set W3C standard capabilities
    capabilities.setCapability("browserName", "android");
    capabilities.setCapability("deviceName", "Google Pixel 3");
    capabilities.setCapability("platformVersion", "9.0");
    capabilities.setCapability("platformName", "Android");

    // BrowserStack specific capabilities
    HashMap<String, Object> browserstackOptions = new HashMap<>();
    browserstackOptions.put("app", "bs://067b3d9696fb162c26cd37417fa5cf1a64cdcc87");
    browserstackOptions.put("projectName", "First Java Project");
    browserstackOptions.put("buildName", "browserstack-build-1");
    browserstackOptions.put("sessionName", "first_test");

    // Adding BrowserStack options to the desired capabilities
    capabilities.setCapability("bstack:options", browserstackOptions);

    // Returning the RemoteWebDriver instance
    return new RemoteWebDriver(BrowserStackConfigFactory.getConfig()
                                 .browserStackURL(), capabilities);
  }
}