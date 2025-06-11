package com.ciwei.yunpicture.model.dto.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author LzWei
 * @data 2025/6/9
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -9175092523732515436L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;


    /**
     * 确认密码
     */
    private String checkPassword;
}
