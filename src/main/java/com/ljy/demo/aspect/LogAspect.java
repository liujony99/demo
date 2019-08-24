package com.ljy.demo.aspect;

import com.alibaba.fastjson.JSONObject;
import com.ljy.demo.common.consts.CommonConstant;
import com.ljy.demo.util.CommonUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

/**
 * 日志切面类
 *
 * @author jony
 * @create 2019-08-23 6:44
 */
@Component
@Aspect
public class LogAspect {

    private static final Logger log = LoggerFactory.getLogger(LogAspect.class);

    private static final String ADD = "add";
    private static final String UPDATE = "update";
    private static final String DELETE = "delete";
    private static final String QUERY = "query";

    @Around("execution(* com.ljy.demo.controller.UserInfoController.*(..)) " +
            "|| execution(* com.ljy.demo.controller.UserRoleRelationController.*(..))")
    public ModelMap around(ProceedingJoinPoint point) {
        String beginTime = CommonUtil.getCurrentTimeByFormat(CommonConstant.PATTERN);
        String className = point.getSignature().getDeclaringTypeName();
        String methodName = point.getSignature().getName();
        String args = JSONObject.toJSONString(point.getArgs());
        log.info("方法调用开始时间：{}，调用类名className：{},调用方法名method:{},入参args为：{}",
                beginTime, className, methodName, args);
        ModelMap modelMap = new ModelMap();
        try {
            modelMap = (ModelMap) point.proceed();
            executionMethod(methodName, CommonConstant.Y, modelMap);
        } catch (Throwable throwable) {
            log.error("方法调用异常", throwable);
            executionMethod(methodName, CommonConstant.N, modelMap);
        }
        String endTime = CommonUtil.getCurrentTimeByFormat(CommonConstant.PATTERN);
        log.info("方法调用结束时间：{}，出参obj：{}", endTime, JSONObject.toJSONString(modelMap));
        return modelMap;
    }

    private void executionMethod(String methodName, String code, ModelMap modelMap) {
        if (CommonConstant.Y.equals(code)) {
            modelMap.put("code", "000");
            if (methodName.startsWith(ADD)) {
                modelMap.put("msg", "新增记录成功");
            } else if (methodName.startsWith(UPDATE)) {
                modelMap.put("msg", "更新记录成功");
            } else if (methodName.startsWith(DELETE)) {
                modelMap.put("msg", "删除记录成功");
            } else if (methodName.startsWith(QUERY)) {
                modelMap.put("msg", "查询记录成功");
            }
        } else {
            modelMap.put("code", "301");
            if (methodName.startsWith(ADD)) {
                modelMap.put("msg", "新增记录异常");
            } else if (methodName.startsWith(UPDATE)) {
                modelMap.put("msg", "更新记录异常");
            } else if (methodName.startsWith(DELETE)) {
                modelMap.put("msg", "删除记录异常");
            } else if (methodName.startsWith(QUERY)) {
                modelMap.put("msg", "查询记录异常");
            }
        }
    }
}
