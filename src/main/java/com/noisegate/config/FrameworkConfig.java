package com.noisegate.config;

import com.noisegate.config.converters.StringToBrowserTypeConverter;
import com.noisegate.config.converters.StringToURLConverter;
import com.noisegate.config.enums.BrowserType;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties",
})

public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @DefaultValue("http://127.0.0.1:4723/wd/hub")
    @ConverterClass(StringToURLConverter.class)
    URL localAppiumServerURL();

    
}