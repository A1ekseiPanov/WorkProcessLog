package ru.panov.workservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WorkServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorkServiceApplication.class, args);
    }
}