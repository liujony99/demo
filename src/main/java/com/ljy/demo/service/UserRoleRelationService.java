package com.ljy.demo.service;

import com.ljy.demo.entity.UserRoleRelation;

import java.util.List;

/**
 * 用户角色关联信息Service接口
 *
 * @author jony
 * @create 2019-08-24 18:27
 */
public interface UserRoleRelationService {

    /**
     * 新增用户角色关联信息
     *
     * @param userRoleRelation 用户角色关联信息
     * @return int
     */
    int addUserRoleRelation(UserRoleRelation userRoleRelation);

    /**
     * 更新用户角色关联信息
     *
     * @param userRoleRelation 用户角色关联信息
     * @return int
     */
    int updateUserRoleRelation(UserRoleRelation userRoleRelation);

    /**
     * 删除用户角色关联信息
     *
     * @param userRoleRelation 用户角色关联信息
     * @return int
     */
    int deleteUserRoleRelation(UserRoleRelation userRoleRelation);

    /**
     * 批量查询用户角色关联信息
     *
     * @param userRoleRelation 用户角色关联信息
     * @return List<UserRoleRelation>
     */
    List<UserRoleRelation> queryUserRoleRelationList(UserRoleRelation userRoleRelation);
}
