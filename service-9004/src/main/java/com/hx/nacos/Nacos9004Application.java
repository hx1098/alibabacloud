package com.hx.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Nacos9004Application {

    public static void main(String[] args) {
        SpringApplication.run(Nacos9004Application.class, args);
    }

}
