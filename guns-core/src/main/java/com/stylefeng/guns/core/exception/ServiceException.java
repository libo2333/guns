package com.stylefeng.guns.core.exception;

public class ServiceException extends RuntimeException {
    private int status;
    private String message;

    public ServiceException(){

    }

    public ServiceException(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
