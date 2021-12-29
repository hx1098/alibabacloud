package com.hx.nacos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.hx.nacos.commons.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverUrl;


    @GetMapping(value = "/consumer/fallback/{id}")
    @SentinelResource(value = "fallback",
            fallback = "fallbackHandler",
            blockHandler = "blockHandler",
            exceptionsToIgnore = {NullPointerException.class})//这里标注的异常将会被原样抛出
    public JsonResult<String> getServerPort(@PathVariable Long id) {
        log.info("serverUrl::" + serverUrl);
        if (id <= 3) {
            JsonResult forObject = restTemplate.getForObject(serverUrl + "/info/" + id, JsonResult.class);
            System.out.println(forObject);
            return forObject;
        } else {
            throw new NullPointerException("没有对应数据记录!");
        }
    }

    /**
     * 发生错误时候的提示
     * 参数要和父方法的参数一样, 同时添加一个异常类型参数,
     * @param id
     * @param e
     * @return
     */
    public JsonResult<String> fallbackHandler(Long id, Throwable e) {
        JsonResult<String> result = new JsonResult<>(444,"出现未知商品id");
        return result;
    }

    /**
     * 出现限流产生的错误.处理sentinel限流
     * @param id
     * @param e
     * @return
     */
    public JsonResult<String> blockHandler(Long id, BlockException e) {
        JsonResult<String> result = new JsonResult<>(445, "BlockException限流");
        return result;
    }







}
