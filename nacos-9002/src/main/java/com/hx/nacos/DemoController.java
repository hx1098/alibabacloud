package com.hx.nacos;

import org.springframework.beans.factory.annotation.Value;
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

    @Value("${server.port}")
    private String serverPort;



    @GetMapping(value = "test")
    public String  getServerPort() {
        return "hello nacos discovery" + serverPort;
    }







}
