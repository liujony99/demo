package com.ljy.demo.controller;

import com.ljy.demo.entity.UserInfo;
import com.ljy.demo.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户基本信息Controller类
 * @author jony
 * @create 2019-08-22
 */
@RestController
@RequestMapping(value = "/userInfo")
public class UserInfoController {

    private static final Logger log = LoggerFactory.getLogger(UserInfoController.class);
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/addUserInfo", method = RequestMethod.POST)
    public ModelMap addUserInfo(@RequestBody UserInfo userInfo) {
        ModelMap modelMap = new ModelMap();
        try {
            userInfoService.addUserInfo(userInfo);
            modelMap.put("code", "000");
            modelMap.put("msg", "新增用户基本信息成功");
        } catch (Exception e) {
            log.error("新增用户基本信息异常", e);
            modelMap.put("code", "301");
            modelMap.put("msg", "新增用户基本信息异常");
        }
        return modelMap;
    }

    @RequestMapping(value = "/updateUserInfo", method = RequestMethod.POST)
    public ModelMap updateUserInfo(@RequestBody UserInfo userInfo) {
        ModelMap modelMap = new ModelMap();
        try {
            userInfoService.updateUserInfo(userInfo);
            modelMap.put("code", "000");
            modelMap.put("msg", "更新用户基本信息成功");
        } catch (Exception e) {
            log.error("更新用户基本信息异常", e);
            modelMap.put("code", "301");
            modelMap.put("msg", "更新用户基本信息异常");
        }
        return modelMap;
    }

    @RequestMapping(value = "/deleteUserInfo", method = RequestMethod.POST)
    public ModelMap deleteUserInfo(@RequestParam("userId") Long userId) {
        ModelMap modelMap = new ModelMap();
        try {
            userInfoService.deleteUserInfo(userId);
            modelMap.put("code", "000");
            modelMap.put("msg", "删除用户基本信息成功");
        } catch (Exception e) {
            log.error("删除用户基本信息异常", e);
            modelMap.put("code", "301");
            modelMap.put("msg", "删除用户基本信息异常");
        }
        return modelMap;
    }

    @RequestMapping(value = "/queryUserInfoList", method = RequestMethod.POST)
    public ModelMap queryUserInfoList(@RequestBody UserInfo userInfo) {
        ModelMap modelMap = new ModelMap();
        try {
            List<UserInfo> userInfoList = userInfoService.queryUserInfoList(userInfo);
            modelMap.put("code", "000");
            modelMap.put("msg", "批量查询用户基本信息成功");
            modelMap.put("data", userInfoList);
        } catch (Exception e) {
            log.error("批量查询用户基本信息异常", e);
            modelMap.put("code", "301");
            modelMap.put("msg", "批量查询用户基本信息异常");
        }
        return modelMap;
    }

    @RequestMapping(value = "/queryUserInfo", method = RequestMethod.POST)
    public ModelMap queryUserInfo(@RequestBody UserInfo userInfo) {
        ModelMap modelMap = new ModelMap();
        try {
            UserInfo userInfo1 = userInfoService.queryUserInfo(userInfo);
            modelMap.put("code", "000");
            modelMap.put("msg", "查询用户基本信息成功");
            modelMap.put("data", userInfo1);
        } catch (Exception e) {
            log.error("查询用户基本信息异常", e);
            modelMap.put("code", "301");
            modelMap.put("msg", "查询用户基本信息异常");
        }
        return modelMap;
    }

}