package ru.panov.workprocesslogserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WorkProcessLogServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorkProcessLogServerApplication.class, args);
    }

}