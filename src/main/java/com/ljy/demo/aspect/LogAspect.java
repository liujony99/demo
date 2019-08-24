package com.ljy.demo.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志切面类
 *
 * @author jony
 * @create 2019-08-23 6:44
 */
public class LogAspect {
    private static final Logger log = LoggerFactory.getLogger(LogAspect.class);

    /*@Before("execution(* com.ljy.demo.controller.*.*(..))")
    public void before(JoinPoint point) {
        String className = point.getTarget().getClass().getName();
        String methodName = point.getSignature().getName();
        log.info("className:{},method:{},入参为：{}", className, methodName, Arrays.asList(point.getArgs()));
    }

    @AfterReturning(value = "execution(* com.ljy.demo.controller.*.*(..))", returning = "result")
    public Object after(JoinPoint point, Object result) {
        String className = point.getTarget().getClass().getName();
        String methodName = point.getSignature().getName();
        log.info("className:{},method:{},出参为：{}", className, methodName, result);
        return result;
    }*/
}
