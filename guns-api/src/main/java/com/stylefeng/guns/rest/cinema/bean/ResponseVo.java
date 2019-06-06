package com.stylefeng.guns.rest.cinema.bean;

import java.io.Serializable;

public class ResponseVo<T> implements Serializable {
    int status;
    int nowPage;
    int totalPage;
    T data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseVo{" +
                "status=" + status +
                ", nowPage=" + nowPage +
                ", totalPage=" + totalPage +
                ", data=" + data +
                '}';
    }
}
