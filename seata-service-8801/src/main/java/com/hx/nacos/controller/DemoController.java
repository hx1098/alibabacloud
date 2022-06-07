package com.hx.nacos.controller;

import com.hx.nacos.commons.JsonResult;
import com.hx.nacos.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
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
    private OrderService orderService;


    @GetMapping("order/create")
    @GlobalTransactional
    public String create() {
        log.info("订单开始创建了。。。。。。。");
        orderService.create();
        return "生成订单";
    }




}
