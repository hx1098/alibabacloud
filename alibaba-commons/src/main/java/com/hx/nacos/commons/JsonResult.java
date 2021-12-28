package com.hx.nacos.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hx
 * @version 1.0.0
 * @createTime 2021/12/28 9:30
 * @description
 * @editUser hx
 * @editTime 2021/12/28 9:30
 * @editDescription
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonResult<T> {
    private Integer code;
    private Object data;
}


