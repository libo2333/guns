package com.stylefeng.guns.rest.film.bean;

import lombok.Data;

import java.io.Serializable;

public class ResponseFault implements Serializable {
    private String msg;
    private int status;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


}
