package com.ciwei.yunpicture.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * @author LzWei
 * @data 2025/6/11
 */
@Data
public class PictureUploadRequest implements Serializable {


    private static final long serialVersionUID = 1485376394941838953L;

    /**
     * 图片 id （用于修改）
     */
    private Long id;

    /**
     * 文件地址
     */
    private String fileUrl;

    /**
     * 图片名称
     */
    private String picName;

}
