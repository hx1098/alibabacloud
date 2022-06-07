package com.hx.nacos.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author hx
 * @version 1.0.0
 * @createTime 2022/6/7 17:35
 * @description
 * @editUser hx
 * @editTime 2022/6/7 17:35
 * @editDescription
 */

@FeignClient(value = "seata-stock")
public interface StockClient {

    @GetMapping("/stock/decr")
    public String decriment();
}
