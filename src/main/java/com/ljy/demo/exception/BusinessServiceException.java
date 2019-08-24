package com.ljy.demo.exception;

/**
 * 业务异常处理类
 * @author jony
 * @create 2019-08-24
 */
public class BusinessServiceException extends Exception {

    public BusinessServiceException () {
        super();
    }

    public BusinessServiceException (String message) {
        super(message);
    }

    public BusinessServiceException (String message, Throwable e){
        super(message, e);
    }

    public BusinessServiceException (Throwable e) {
        super(e);
    }
}
