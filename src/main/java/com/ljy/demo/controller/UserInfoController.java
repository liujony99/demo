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
        userInfoService.addUserInfo(userInfo);
        return modelMap;
    }

    @RequestMapping(value = "/updateUserInfo", method = RequestMethod.POST)
    public ModelMap updateUserInfo(@RequestBody UserInfo userInfo) {
        ModelMap modelMap = new ModelMap();
        userInfoService.updateUserInfo(userInfo);
        return modelMap;
    }

    @RequestMapping(value = "/deleteUserInfo", method = RequestMethod.POST)
    public ModelMap deleteUserInfo(@RequestParam("userId") Long userId) {
        ModelMap modelMap = new ModelMap();
        userInfoService.deleteUserInfo(userId);
        return modelMap;
    }

    @RequestMapping(value = "/queryUserInfoList", method = RequestMethod.POST)
    public ModelMap queryUserInfoList(@RequestBody UserInfo userInfo) {
        ModelMap modelMap = new ModelMap();
        List<UserInfo> userInfoList = userInfoService.queryUserInfoList(userInfo);
        modelMap.put("data", userInfoList);
        return modelMap;
    }

    @RequestMapping(value = "/queryUserInfo", method = RequestMethod.POST)
    public ModelMap queryUserInfo(@RequestBody UserInfo userInfo) {
        ModelMap modelMap = new ModelMap();
        UserInfo userInfo1 = userInfoService.queryUserInfo(userInfo);
        modelMap.put("data", userInfo1);
        return modelMap;
    }

}