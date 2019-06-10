package com.stylefeng.guns.rest.modular.film.bean.resultvo;

import java.io.Serializable;

/**
 * @author czy
 * @date 2019/6/5 9:36
 */
public class FilmConditionVo implements Serializable {
    private int status;
    private ConditionData data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ConditionData getData() {
        return data;
    }

    public void setData(ConditionData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "FilmConditionVo{" +
                "status=" + status +
                ", data=" + data +
                '}';
    }
}
