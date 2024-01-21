package com.noisegate.config;

import com.noisegate.config.converters.StringToBrowserTypeConverter;
import com.noisegate.config.enums.BrowserType;
import org.aeonbits.owner.Config;

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
}