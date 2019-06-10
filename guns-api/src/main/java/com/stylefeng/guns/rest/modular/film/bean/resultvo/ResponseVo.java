package com.stylefeng.guns.rest.modular.film.bean.resultvo;


import java.io.Serializable;

/**
 * @author czy
 * @date 2019/6/3 20:04
 */
public class ResponseVo implements Serializable {
    private int status;
    private String imgPre;
    private IndexData data;
    private String msg;

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

    public IndexData getData() {
        return data;
    }

    public void setData(IndexData data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResponseVo{" +
                "status=" + status +
                ", imgPre='" + imgPre + '\'' +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
