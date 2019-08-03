package com.example.myweb;

import com.example.myservice.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.myservice"})
public class MyWebApplication {

    @Autowired
    private Service1 service1;

    @RequestMapping("/keystorage")
    public String keyStorage(){
        return service1.keyStorage();
    }

    public static void main(String[] args) {
        SpringApplication.run(MyWebApplication.class, args);
    }

}
