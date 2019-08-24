package com.ljy.demo.service.impl;

import com.ljy.demo.entity.UserRoleRelation;
import com.ljy.demo.mapper2.UserRoleRelationMapper;
import com.ljy.demo.service.UserRoleRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户角色关联信息实现类
 *
 * @author jony
 * @create 2019-08-24 18:27
 */
@Service
public class UserRoleRelationServiceImpl implements UserRoleRelationService {

    @Autowired
    private UserRoleRelationMapper userRoleRelationMapper;

    /**
     * 新增用户角色关联信息
     *
     * @param userRoleRelation 用户角色关联信息
     * @return int
     */
    @Override
    public int addUserRoleRelation(UserRoleRelation userRoleRelation) {
        return userRoleRelationMapper.addUserRoleRelation(userRoleRelation);
    }

    /**
     * 更新用户角色关联信息
     *
     * @param userRoleRelation 用户角色关联信息
     * @return int
     */
    @Override
    public int updateUserRoleRelation(UserRoleRelation userRoleRelation) {
        return userRoleRelationMapper.updateUserRoleRelation(userRoleRelation);
    }

    /**
     * 删除用户角色关联信息
     *
     * @param userRoleRelation 用户角色关联信息
     * @return int
     */
    @Override
    public int deleteUserRoleRelation(UserRoleRelation userRoleRelation) {
        return userRoleRelationMapper.deleteUserRoleRelation(userRoleRelation);
    }

    /**
     * 批量查询用户角色关联信息
     *
     * @param userRoleRelation 用户角色关联信息
     * @return List<UserRoleRelation>
     */
    @Override
    public List<UserRoleRelation> queryUserRoleRelationList(UserRoleRelation userRoleRelation) {
        return userRoleRelationMapper.queryUserRoleRelationList(userRoleRelation);
    }
}
