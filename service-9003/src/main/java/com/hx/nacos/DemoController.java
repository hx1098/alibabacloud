package com.hx.nacos;

import com.hx.nacos.commons.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author hx
 * @version 1.0.0
 * @createTime 2021/11/29 14:04
 * @description
 * @editUser hx
 * @editTime 2021/11/29 14:04
 * @editDescription
 */
@RestController
@Slf4j
public class DemoController {

    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, String> hashMap = new HashMap<>();

    static {
        hashMap.put(1L,"键盘");
        hashMap.put(2L,"鼠标");
        hashMap.put(3L,"储存器");
    }

    @GetMapping("info/{id}")
    public JsonResult<String> mysql(@PathVariable("id") long id) {
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JsonResult<String> result = new JsonResult(200,  hashMap.get(id)+"::"+serverPort);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(123);
        try {
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(123);
    }




}
