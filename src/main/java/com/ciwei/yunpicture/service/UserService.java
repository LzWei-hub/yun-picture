package com.ciwei.yunpicture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ciwei.yunpicture.model.dto.user.UserQueryRequest;
import com.ciwei.yunpicture.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ciwei.yunpicture.model.vo.LoginUserVO;
import com.ciwei.yunpicture.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 32542
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2025-06-09 18:55:26
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账号
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 获取加密后的密码
     *
     * @param userPassword 原始密码
     * @return 加密后的密码
     */
    String getEncryptPassword(String userPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账号
     * @param userPassword 用户密码
     * @param request      httpRequest 请求方便设置 cookie
     * @return 脱敏后的的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 获取脱敏的已登录用户信息
     *
     * @param user
     * @return
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获取用户脱敏信息
     *
     * @param user 脱敏前的信息
     * @return 脱敏后的信息
     */
    UserVO getUserVO(User user);

    /**
     * 批量获取用户脱敏信息
     *
     * @param userList 脱敏前的信息
     * @return 脱敏后的 List 列表
     */
    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 获取查询条件
     *
     * @param userQueryRequest 查询条件
     * @return 查询条件
     */
    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

    /**
     * 是否为管理员
     *
     * @param user
     * @return
     */
    boolean isAdmin(User user);

}
