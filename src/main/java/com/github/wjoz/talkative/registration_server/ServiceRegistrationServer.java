package com.github.wjoz.talkative.registration_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistrationServer {
    public static void main( String[] args ) {
        SpringApplication.run(ServiceRegistrationServer.class, args);
    }
}
