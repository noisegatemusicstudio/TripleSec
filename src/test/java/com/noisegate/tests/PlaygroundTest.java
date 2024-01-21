package com.noisegate.tests;

import com.noisegate.config.factory.ConfigFactory;
import org.testng.annotations.Test;
public class PlaygroundTest {

    @Test
    public void test() {
        System.out.println(ConfigFactory.getConfig().browser());

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com");
//        driver.quit();
    }

}