package com.yfming.tensquare.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Result<T> {
    private boolean flag;//是否成功
    private Integer code;// 返回码
    private String message;//返回信息
    private T data;// 返回数据

    public Result(boolean flag, Integer code, String message) {
        super();
        this.flag = flag;
        this.code = code;
        this.message = message;
    }
}