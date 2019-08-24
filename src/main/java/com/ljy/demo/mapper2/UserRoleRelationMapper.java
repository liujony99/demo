package com.ljy.demo.mapper2;

import com.ljy.demo.entity.UserRoleRelation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户角色关联信息持久化接口
 *
 * @author jony
 * @create 2019-08-24 18:28
 */
@Mapper
public interface UserRoleRelationMapper {

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
