package com.javastrong.photapp.discovery.photoappdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PhotoappdiscoveryserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoappdiscoveryserviceApplication.class, args);
    }

}
