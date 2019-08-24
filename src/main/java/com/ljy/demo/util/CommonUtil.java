package com.ljy.demo.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 * 通用辅助类
 *
 * @author jony
 * @create 2019-08-22 17:29
 */
public class CommonUtil {

    /**
     * 获取去掉横线的UUID
     *
     * @return UUID
     */
    public static String getUUIDWithNotLine() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static String getCurrentTimeByFormat(String pattern) {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern));
    }
}
