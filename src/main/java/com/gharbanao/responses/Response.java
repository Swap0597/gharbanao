package com.gharbanao.responses;

public class Response {
    private String statusCode;
    private Object data;
    private String message;

    public Response() {
    }

    public Response(String statusCode, Object data, String message) {
        this.statusCode = statusCode;
        this.data = data;
        this.message = message;
    }
    public Response(String statusCode, String message){
        this.statusCode = statusCode;
        this.message = message;
    }
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



}
