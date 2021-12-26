package com.hx.nacos.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author hx
 * @version 1.0.0
 * @createTime 2021/12/26 14:12
 * @description
 * @editUser hx
 * @editTime 2021/12/26 14:12
 * @editDescription  自定义的流控异常处理逻辑
 */
public class CustomerBlockHandler {

    public static String handlerException(BlockException exception) {
        return "handlerException : 系统异常,非业务代码异常, 请检查参数.";
    }

    public static String handlerException2(BlockException exception) {
        return "handlerException2 : 网络异常, 请稍后重试!";
    }

}
