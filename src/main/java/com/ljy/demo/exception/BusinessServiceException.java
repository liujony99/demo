package com.ljy.demo.exception;

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
