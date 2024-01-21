package com.noisegate.tests;

import com.noisegate.config.factory.ConfigFactory;
import com.noisegate.driver.Driver;
import org.testng.annotations.Test;
public class PlaygroundTest {

    @Test
    public void test() {
        System.out.println(ConfigFactory.getConfig().browser());
        System.out.println(ConfigFactory.getConfig().localAppiumServerURL());
        Driver.initDriverForWeb();

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com");
//        driver.quit();
    }

}