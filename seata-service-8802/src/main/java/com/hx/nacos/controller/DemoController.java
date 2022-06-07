package com.hx.nacos.controller;

import com.hx.nacos.service.StockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

    @Resource
    private StockService stockService;

    @GetMapping("/stock/decr")
    public String decriment() {
        stockService.decr();
        return "库存减一";
    }
}
