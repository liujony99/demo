package com.ljy.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户基本信息类
 *
 * @author liujy007
 * @create 2019-08-22
 */
@Data
public class UserInfo extends BaseInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别,默认为"0","0"为男,"1"为女,"2"为未知
     */
    private String sex;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 家庭住址
     */
    private String address;

    /**
     * 是否有效，默认为"1"，"1"为有效，"0"为失效
     */
    private String status;

}
