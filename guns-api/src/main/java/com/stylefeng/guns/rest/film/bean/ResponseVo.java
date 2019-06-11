package com.stylefeng.guns.rest.film.bean;


import lombok.Data;

public class ResponseVo<T> extends ResponseFault {
    private int status;
    private String imgPre;
    private T data;
    private int nowPage;
    private int totalPage;

    public ResponseVo() {
    }

    public ResponseVo(int status, T data) {
        this.status = status;
        this.data = data;
    }

    public ResponseVo(int status, String imgPre, T data, int nowPage, int totalPage) {
        this.status = status;
        this.imgPre = imgPre;
        this.data = data;
        this.nowPage = nowPage;
        this.totalPage = totalPage;
    }

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

    public int getNowPage() {
        return nowPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
