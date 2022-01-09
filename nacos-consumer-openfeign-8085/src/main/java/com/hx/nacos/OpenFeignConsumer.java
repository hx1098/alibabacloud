package com.hx.nacos;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients // 添加feign的注解
public class OpenFeignConsumer {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignConsumer.class, args);
    }


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**开启feign*/
    @Bean
    Logger.Level feignLogLevel() {
        //full 开启详细日志.
        return Logger.Level.FULL;
    }



}
