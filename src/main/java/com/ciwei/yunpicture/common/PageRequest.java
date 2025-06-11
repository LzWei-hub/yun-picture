package com.ciwei.yunpicture.common;

import lombok.Data;

/**
 * 通用的分页请求
 *
 * @Author LzWei
 * @DATA 2025/6/7
 */
@Data
public class PageRequest {

    /**
     * 当前页码
     */
    private int current;

    /**
     * 页面大小
     */
    private int pageSize;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序方式（默认升序）
     */
    private String sortOrder = "descend";
}
