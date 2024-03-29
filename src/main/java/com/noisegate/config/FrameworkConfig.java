package com.noisegate.config;

import com.noisegate.config.converters.*;
import com.noisegate.config.enums.*;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties",
        "file:${user.dir}/src/test/resources/sit.properties",
})
public interface FrameworkConfig extends Config {

    @DefaultValue("sit")
    String environment();

    @Key("${environment}.webUrl")
    String webUrl();

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @ConverterClass(StringToURLConverter.class)
    @DefaultValue("http://127.0.0.1:4723/wd/hub")
    URL localAppiumServerURL();

    @ConverterClass(StringToMobilePlatformTypeConverter.class)
    @DefaultValue("ios")
    MobilePlatformType mobilePlatformType();
}