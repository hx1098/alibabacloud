package com.hx.nacos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.hx.nacos.mapper")
@EnableFeignClients
public class Seata8801Application {

    public static void main(String[] args) {
        SpringApplication.run(Seata8801Application.class, args);
    }

}
