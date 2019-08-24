package com.ljy.demo.service;

import com.ljy.demo.entity.UserInfo;

import java.util.List;

/**
 * 用户基本信息服务接口
 *
 * @author liujy007
 * @create 2019-08-22
 */
public interface UserInfoService {
    /**
     * 新增用户基本信息
     *
     * @param userInfo 用户信息
     * @return int
     */
    int addUserInfo(UserInfo userInfo);

    /**
     * 更新用户基本信息
     *
     * @param userInfo 用户信息
     * @return int
     */
    int updateUserInfo(UserInfo userInfo);

    /**
     * 删除用户基本信息
     *
     * @param UserId 用户信息ID
     * @return int
     */
    int deleteUserInfo(long UserId);

    /**
     * 批量查询用户的基本信息
     *
     * @param userInfo 用户信息
     * @return List<UserInfo>
     */
    List<UserInfo> queryUserInfoList(UserInfo userInfo);

    /**
     * 查询单个用户的基本信息
     *
     * @param userInfo 用户信息
     * @return UserInfo
     */
    UserInfo queryUserInfo(UserInfo userInfo);
}
