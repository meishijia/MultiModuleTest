package com.example.myservice;

import com.example.common.KeyStorageConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@ComponentScan(basePackages = {"com.example.common"})
@EnableConfigurationProperties(KeyStorageConfig.class)
public class Service1 {

    @Autowired
    private KeyStorageConfig keyStorageConfig;

    public String keyStorage(){
        return keyStorageConfig.getStorage();
    }
}
