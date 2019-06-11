package com.stylefeng.guns.rest.film.bean;

import lombok.Data;

import java.io.Serializable;

public class ResponseList<T> extends ResponseFault implements Serializable{
    private int status;
    private T date;

    @Override
    public int getStatus() {
        return status;
    }

    @Override
    public void setStatus(int status) {
        this.status = status;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }
}
