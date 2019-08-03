package com.example.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Component
@ConfigurationProperties(prefix = "key")
//@PropertySource("classpath:/application.properties")
public class KeyStorageConfig {

    private static Logger logger= LoggerFactory.getLogger(KeyStorageConfig.class);
    private static String storage;

    public void setStorage(String var) {
        logger.info("set Storage");
        storage = var;
        logger.info(storage);
    }

    public String getStorage() {
        logger.info("get Storage");
        return storage;
    }

}
