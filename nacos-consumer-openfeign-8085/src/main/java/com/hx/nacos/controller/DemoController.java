package com.hx.nacos.controller;

import com.hx.nacos.commons.JsonResult;
import com.hx.nacos.feignapi.DemoFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@Slf4j
@RestController
public class DemoController {

    @Autowired
    private DemoFeignService demoFeignService;

   /* @GetMapping("info/{id}")
    public JsonResult<String> mysql(@PathVariable("id") long id) {
        JsonResult<String> mysql = demoFeignService.mysql(id);
        return mysql;
    }*/


    @GetMapping("info/{id}")
    public JsonResult<String> mysql(@PathVariable("id") long id) {
        if (id > 3) {
            throw new RuntimeException("没有该id");
        }
        JsonResult<String> mysql = demoFeignService.mysql(id);
        return mysql;
    }







}
