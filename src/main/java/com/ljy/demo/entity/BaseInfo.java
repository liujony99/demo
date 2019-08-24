package com.ljy.demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * 基本信息类
 *
 * @author jony
 * @create 2019-08-22 17:03
 */
@Data
public class BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 创建人名称，默认为SYSTEM
     */
    private String createdName;

    /**
     * 创建时间，默认为当前时间
     */
    private Date createdDate;

    /**
     * 更新人名称，默认为SYSTEM
     */
    private String updatedName;

    /**
     * 更新人时间，默认为当前时间
     */
    private Date updatedDate;

    /**
     * 是否逻辑删除标志，默认为"N"，"Y"为是，"N"为否
     */
    private String del;
}
