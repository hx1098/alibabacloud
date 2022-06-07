package com.hx.nacos.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
 * @author hx
 * @createTime 2022/6/7 17:28
 * @option
 * @description
 */

public interface StockMapper {

    @Update("update stock set count = count - 1 where product_id =1")
    void decr();


}
