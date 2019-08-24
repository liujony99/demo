package com.ljy.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户角色关联信息类
 *
 * @author jony
 * @create 2019-08-24 18:20
 */
@Data
public class UserRoleRelation extends BaseInfo implements Serializable {
    public static final long serialVersionUID = 1L;
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 是否有效，默认为"1"，"1"为有效，"0"为失效
     */
    private String status;
}
