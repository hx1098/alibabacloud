package com.hx.nacos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hx
 * @version 1.0.0
 * @createTime 2021/11/29 14:04
 * @description
 * @editUser hx
 * @editTime 2021/11/29 14:04
 * @editDescription
 */
@RestController
public class DemoController {

    @GetMapping("/testA")
    @SentinelResource(value = "testA")
    public String testA() {
        System.out.println("=====testA=====");
        return "===testA====";
    }

    @GetMapping("/testB")
    @SentinelResource(value = "testB")
    public String testB() {
        System.out.println("=====testB=====");
        return "===testB====";
    }







}
