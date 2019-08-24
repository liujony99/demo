package com.ljy.demo.service.impl;

import com.ljy.demo.entity.UserInfo;
import com.ljy.demo.mapper.UserInfoMapper;
import com.ljy.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户基本信息实现类
 *
 * @author liujy007
 * @create 2019-08-22
 */
@Service(value = "userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 新增用户基本信息
     *
     * @param userInfo 用户信息
     * @return int
     */
    @Override
    public int addUserInfo(UserInfo userInfo) {
        return userInfoMapper.addUserInfo(userInfo);
    }

    /**
     * 更新用户基本信息
     *
     * @param userInfo 用户信息
     * @return int
     */
    @Override
    public int updateUserInfo(UserInfo userInfo) {
        return userInfoMapper.updateUserInfo(userInfo);
    }

    /**
     * 删除用户基本信息
     *
     * @param UserId 用户信息ID
     * @return int
     */
    @Override
    public int deleteUserInfo(long UserId) {
        return userInfoMapper.deleteUserInfo(UserId);
    }

    /**
     * 批量查询用户的基本信息
     *
     * @param userInfo 用户信息
     * @return List<UserInfo>
     */
    @Override
    public List<UserInfo> queryUserInfoList(UserInfo userInfo) {
        return userInfoMapper.queryUserInfoList(userInfo);
    }

    /**
     * 查询单个用户的基本信息
     *
     * @param userInfo 用户信息
     * @return UserInfo
     */
    @Override
    public UserInfo queryUserInfo(UserInfo userInfo) {
        return userInfoMapper.queryUserInfo(userInfo);
    }
}
