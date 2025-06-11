package com.ciwei.yunpicture.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author LzWei
 * @data 2025/6/9
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -2093069628607445867L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;
}
