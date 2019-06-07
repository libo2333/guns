package com.stylefeng.guns.rest;


import lombok.Data;

@Data
public class ResponseVo<T> {
    private int status;
    private String imgPre;
    private T data;

    public ResponseVo(int status, String imgPre, T data) {
        this.status = status;
        this.imgPre = imgPre;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getImgPre() {
        return imgPre;
    }

    public void setImgPre(String imgPre) {
        this.imgPre = imgPre;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
