package com.yfming.tensquare.common.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * 分页结果类
 * @param <T>
 */
@Data
@Builder
public class PageResult<T> {
    private Long total;
    private List<T> rows;

    public PageResult(Long total, List<T> rows) {
        super();
        this.total = total;
        this.rows = rows;
    }
}