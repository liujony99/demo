package com.ljy.demo.controller;

import com.ljy.demo.entity.UserRoleRelation;
import com.ljy.demo.service.UserRoleRelationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户角色关联信息Controller类
 *
 * @author jony
 * @create 2019-08-24 18:24
 */
@RestController
@RequestMapping(value = "/userRoleRelation")
public class UserRoleRelationController {

    private static final Logger log = LoggerFactory.getLogger(UserRoleRelationController.class);
    @Autowired
    private UserRoleRelationService userRoleRelationService;

    @RequestMapping(value = "/addUserRoleRelation", method = RequestMethod.POST)
    public ModelMap addUserRoleRelation(@RequestBody UserRoleRelation userRoleRelation) {
        ModelMap modelMap = new ModelMap();
        userRoleRelationService.addUserRoleRelation(userRoleRelation);
        return modelMap;
    }

    @RequestMapping(value = "/updateUserRoleRelation", method = RequestMethod.POST)
    public ModelMap updateUserRoleRelation(@RequestBody UserRoleRelation userRoleRelation) {
        ModelMap modelMap = new ModelMap();
        userRoleRelationService.updateUserRoleRelation(userRoleRelation);
        return modelMap;
    }

    @RequestMapping(value = "/deleteUserRoleRelation", method = RequestMethod.POST)
    public ModelMap deleteUserRoleRelation(@RequestBody UserRoleRelation userRoleRelation) {
        ModelMap modelMap = new ModelMap();
        userRoleRelationService.deleteUserRoleRelation(userRoleRelation);
        return modelMap;
    }

    @RequestMapping(value = "/queryUserRoleRelationList", method = RequestMethod.POST)
    public ModelMap queryUserRoleRelationList(@RequestBody UserRoleRelation userRoleRelation) {
        ModelMap modelMap = new ModelMap();
        List<UserRoleRelation> userRoleRelationList = userRoleRelationService.queryUserRoleRelationList(userRoleRelation);
        modelMap.put("data", userRoleRelationList);
        return modelMap;
    }
}
