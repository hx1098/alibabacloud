package com.hx.nacos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String testC() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        log.info("currentThread is  testC::[{}]", Thread.currentThread().getName());
        return "testC------";
    }

    @GetMapping("/testD")
    public String testD(Integer id) {
        if (id != null && id > 1) {
            throw new RuntimeException("异常比例测试!");
        }
        log.info("currentThread is  testC::[{}]", Thread.currentThread().getName());
        return testService.common();
    }

    @GetMapping("/testE")
    public String testE(Integer id) {
        if (id != null && id > 1) {
            throw new RuntimeException("异常数量测试!");
        }
        return testService.common();
    }



    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "handlerHotKey",fallback = "testHotKeyThrowError")
    public String testHotData(@RequestParam(value = "hot1",required = false)String hot1,
                              @RequestParam(value = "hot2",required = false)String hot2,
                              @RequestParam(value = "hot3",required = false)String hot3) {
        //System.out.println(hot1);
        if ("wangLiHong".equalsIgnoreCase(hot1)) {
            throw new RuntimeException("某某某明星又上头条了， 这瓜包熟哇!!!");
        }
        /*int cc = 1 / 0;*/
        return "testHotKey";
    }

    /**
     * 限流降级的时候跑出的错误
     * @return String
     */
    public String handlerHotKey(String hot1,String hot2, String hot3, BlockException e) {
        return "由于这家伙流量太大, 程序员小哥正在抢修中......";
    }

    /**
     * 报错有异常时候报出的错误
     * @return String
     */
    public String testHotKeyThrowError(String hot1,String hot2, String hot3,Throwable e) {
        return "这次接口是真的报错了!!!";
    }







}
