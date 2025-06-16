package com.ciwei.yunpicture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ciwei.yunpicture.model.dto.space.SpaceAddRequest;
import com.ciwei.yunpicture.model.dto.space.SpaceQueryRequest;
import com.ciwei.yunpicture.model.entity.Space;
import com.ciwei.yunpicture.model.entity.User;
import com.ciwei.yunpicture.model.vo.SpaceVO;
import com.baomidou.mybatisplus.extension.service.IService;


import javax.servlet.http.HttpServletRequest;

/**
 * @author 32542
 * @description 针对表【space(空间)】的数据库操作Service
 * @createDate 2025-06-16 18:22:00
 */
public interface SpaceService extends IService<Space> {

    /**
     * 创建空间
     *
     * @param spaceAddRequest
     * @param loginUser
     * @return
     */
    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    /**
     * 校验空间数据
     *
     * @param space
     * @param add
     */
    void validSpace(Space space, boolean add);

    /**
     * 自动填充限额数据
     *
     * @param space
     */
    void fillSpaceBySpaceLevel(Space space);


    /**
     * 获取查询条件
     *
     * @param spaceQueryRequest
     * @return
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    /**
     * 获取单个空间
     *
     * @param space
     * @param request
     * @return
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    /**
     * 分页获取空间
     *
     * @param spacePage
     * @param request
     * @return
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

}
