package com.ljy.demo.common.enums;

/**
 * 状态枚举类
 *
 * @author jony
 * @create 2019-08-22 17:12
 */
public enum StatusEnum {
    /**
     * 失效
     */
    INVALID("0","失效"),

    /**
     * 有效
     */
    VALID("1","有效");

    private StatusEnum(String code,String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 根据状态码获取对应状态名称
     *
     * @param code 状态码
     * @return 状态名称
     */
    public static String getName(String code){
        for(StatusEnum statusEnum : StatusEnum.values()){
            if(statusEnum.getCode().equals(code)) {
                return statusEnum.getName();
            }
        }
        return "";
    }

    /**
     * 根据状态名称获取对应状态码
     *
     * @param name 状态名称
     * @return 状态码
     */
    public static String getCode(String name){
        for(StatusEnum statusEnum : StatusEnum.values()){
            if(statusEnum.getName().equals(name)) {
                return statusEnum.getCode();
            }
        }
        return "";
    }

    /**
     * 状态码
     */
    private String code;

    /**
     * 状态名称
     */
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
