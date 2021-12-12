package com.hx.nacos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @author hx
 * @version 1.0.0
 * @createTime 2021/12/11 16:08
 * @description
 * @editUser hx
 * @editTime 2021/12/11 16:08
 * @editDescription
 */
@Service
public class TestService {

    @SentinelResource("common")
    public String common() {
        return "common";
    }
}
