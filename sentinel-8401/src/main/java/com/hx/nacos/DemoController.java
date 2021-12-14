package com.hx.nacos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author hx
 * @version 1.0.0
 * @createTime 2021/11/29 14:04
 * @description
 * @editUser hx
 * @editTime 2021/11/29 14:04
 * @editDescription
 */
@Slf4j
@RestController
public class DemoController {

    @Autowired
    TestService testService;




    @GetMapping("/testA")
    public String testA() {
        System.out.println("testA");
        return testService.common();
    }

    @GetMapping("/testB")
    public String testB() {
        System.out.println("tesB");
        return testService.common();
    }


    /* @GetMapping("/testA")
    @SentinelResource(value = "testA")
    public String testA() throws InterruptedException {

      *//*  TimeUnit.SECONDS.sleep(1);*//*

        System.out.println("=====testA=====");
        return "===testA====";
    }

    @GetMapping("/testB")
    @SentinelResource(value = "testB")
    public String testB() {
        System.out.println("=====testB=====");
        return "===testB====";
    }*/


    @GetMapping("/testC")
    public String testC() {
        log.info("currentThread is  testC::[{}]", Thread.currentThread().getName());
        return testService.common();
    }






}
