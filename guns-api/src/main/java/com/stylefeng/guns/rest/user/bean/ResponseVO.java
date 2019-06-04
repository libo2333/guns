package com.stylefeng.guns.rest.user.bean;

import java.io.Serializable;

public class ResponseVO implements Serializable {
    int status;
    String msg;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResponseVO() {
    }

    public ResponseVO(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResponseVO{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                '}';
    }
}
