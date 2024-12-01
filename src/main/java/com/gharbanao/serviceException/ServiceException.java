package com.gharbanao.serviceException;

public class ServiceException extends Exception{

    private String statusCode;
    private String message;
    private Object data;

    public ServiceException(String statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public ServiceException(String statusCode, String message, Object data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

}
