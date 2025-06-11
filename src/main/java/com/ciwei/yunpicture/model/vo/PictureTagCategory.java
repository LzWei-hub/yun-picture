package com.ciwei.yunpicture.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author LzWei
 * @data 2025/6/11
 */
@Data
public class PictureTagCategory implements Serializable {

    private static final long serialVersionUID = -2127756221373875131L;

    private List<String> tagList;

    private List<String> categoryList;
}
