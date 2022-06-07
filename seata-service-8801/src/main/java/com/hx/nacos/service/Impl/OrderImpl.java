package com.hx.nacos.service.Impl;

import com.hx.nacos.client.StockClient;
import com.hx.nacos.mapper.OrderMapper;
import com.hx.nacos.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hx
 * @version 1.0.0
 * @createTime 2022/6/7 17:38
 * @description
 * @editUser hx
 * @editTime 2022/6/7 17:38
 * @editDescription
 */
@Service
@Slf4j
public class OrderImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    /**这里的openfeign要开启注解才会生效*/
    @Autowired
    private StockClient stockClient;


    @Override
    public void create() {
        log.info("订单开始创建了。。。。。。。");
        stockClient.decriment();


        int i = 1 / 0;
        orderMapper.create();
    }
}
