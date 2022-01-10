package com.hx.nacos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return "gateWay" + serverPort;
    }


}
