package com.hx.nacos.service.impl;

import com.hx.nacos.mapper.StockMapper;
import com.hx.nacos.service.StockService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hx
 * @version 1.0.0
 * @createTime 2022/6/7 17:32
 * @description
 * @editUser hx
 * @editTime 2022/6/7 17:32
 * @editDescription
 */
@Service
public class StockImpl implements StockService {

    @Resource
    private StockMapper stockMapper;

    @Override
    public void decr() {
        System.out.println("stock.....");
        stockMapper.decr();
    }
}
