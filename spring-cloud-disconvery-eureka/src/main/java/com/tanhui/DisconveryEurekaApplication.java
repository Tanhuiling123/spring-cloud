package com.tanhui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DisconveryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisconveryEurekaApplication.class,args);
    }

}
