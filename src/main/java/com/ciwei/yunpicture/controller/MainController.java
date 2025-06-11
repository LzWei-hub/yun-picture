package com.ciwei.yunpicture.controller;

import com.ciwei.yunpicture.common.BaseResponse;
import com.ciwei.yunpicture.common.ResultUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LzWei
 * @data 2025/6/7
 */
@RestController
@RequestMapping("/")
public class MainController {

    /**
     * 健康检查
     */
    @RequestMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}
