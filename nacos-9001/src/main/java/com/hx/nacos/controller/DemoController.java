package com.hx.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/hx")
public class DemoController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/test")
    public String  getServerPort() {
        System.out.println("请求过来了。。。。");
        return "hello nacos discovery" + serverPort;
    }

    @GetMapping(value = "/custom")
    public String  getCustom() {
        System.out.println("请求过来了。。。。custom");
        return "hello nacos custom" + serverPort;
    }
}
