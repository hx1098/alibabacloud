package com.hx.nacos.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author hx
 * @version 1.0.0
 * @createTime 2022/6/7 17:39
 * @description
 * @editUser hx
 * @editTime 2022/6/7 17:39
 * @editDescription
 */
@Mapper
public interface OrderMapper {

    @Insert("insert into order_at (count) values (1)")
    void create();

}
