package com.crgs.springcloud.entities;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangtongfa
 * @version 1.0
 * @date 2021/1/15 13:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private static final String SYSTEM_ERROR = "系统异常";
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public CommonResult(T data) {
        this(200, "成功", data);
    }


    public CommonResult(String message, T data) {
        this(200, message, data);
    }

    public static <T> String okMessage(T data, String message) {
        return JSONObject.toJSONString(new CommonResult<>(message, data),
                SerializerFeature.WriteNullListAsEmpty);
    }

    public static <T> String ok(T  data) {
        return JSONObject.toJSONString(new CommonResult<>(data),
                SerializerFeature.WriteNullListAsEmpty);
    }

    public static String exceptionSys() {
        return JSONObject.toJSONString(new CommonResult<>(500, SYSTEM_ERROR),
                SerializerFeature.WriteMapNullValue);
    }

}
