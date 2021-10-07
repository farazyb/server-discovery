package com.fyb.serverdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerDiscoveryApplication {

    public static void main(String[] args) {


        System.out.println("hi");
        SpringApplication.run(ServerDiscoveryApplication.class, args);
    }

}
