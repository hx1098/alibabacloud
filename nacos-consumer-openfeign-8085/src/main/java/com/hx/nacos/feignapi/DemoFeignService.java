package com.hx.nacos.feignapi;

import com.hx.nacos.commons.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author hx
 * @version 1.0.0
 * @createTime 2021/12/30 9:48
 * @description
 * @editUser hx
 * @editTime 2021/12/30 9:48
 * @editDescription 这个接口是配合openfeign的接口, 调用的这里的方法就相当于调用远程接口., 中间加上了负载均衡的算法.
 */

@Service
@FeignClient(value = "nacos-provider")
public interface DemoFeignService {

    @GetMapping("info/{id}")
    public JsonResult<String> mysql(@PathVariable("id") long id);

}
