package com.noisegate.tests.web;


import com.noisegate.config.factory.ConfigFactory;
import org.testng.annotations.Test;
public class PlaygroundTest extends WebBase {

    @Test
    public void test() {
       System.out.println(ConfigFactory.getConfig().webUrl());
//        System.out.println(ConfigFactory.getConfig().localAppiumServerURL());
//        Driver.initDriverForWeb();
//        Driver.initDriverForMobile(MobilePlatformType.ANDROID);

    }

}