package com.hx.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Senstinel8401 {

    public static void main(String[] args) {
        SpringApplication.run(Senstinel8401.class, args);
    }

}
