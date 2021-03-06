package com.hx.nacos.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

/**
 *
 * @author hx
 */
@Slf4j
@RestController
@RequestMapping("/hx")
public class DemoController {

    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/get")
    public String getString() {
        return "gateWay:" + serverPort;
    }

    public static void main(String[] args) {
        ZonedDateTime da = ZonedDateTime.now();
        System.out.println(da);
    }




}
