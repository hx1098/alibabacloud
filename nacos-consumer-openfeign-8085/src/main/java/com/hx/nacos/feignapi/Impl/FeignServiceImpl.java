package com.hx.nacos.feignapi.Impl;

import com.hx.nacos.commons.JsonResult;
import com.hx.nacos.feignapi.DemoFeignService;
import org.springframework.stereotype.Component;

/**
 * @author hx
 * @version 1.0.0
 * @createTime 2022/1/5 9:25
 * @description
 * @editUser hx
 * @editTime 2022/1/5 9:25
 * @editDescription
 */

@Component
public class FeignServiceImpl implements DemoFeignService {

    @Override
    public JsonResult<String> mysql(long id) {
        return new JsonResult<String>(444, "熔断降级,不好意思");
    }
}
