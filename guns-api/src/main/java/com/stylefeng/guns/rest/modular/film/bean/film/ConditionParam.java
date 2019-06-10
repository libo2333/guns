package com.stylefeng.guns.rest.modular.film.bean.film;

import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;

/**
 * @author czy
 * @date 2019/6/5 14:22
 */
public class ConditionParam implements Serializable {
    @Value("${film.catId}")
    private String catId;
    @Value("${film.sourceId}")
    private String sourceId;
    @Value("${film.yearId}")
    private String yearId;

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getYearId() {
        return yearId;
    }

    public void setYearId(String yearId) {
        this.yearId = yearId;
    }

    @Override
    public String toString() {
        return "ConditionParam{" +
                "catId='" + catId + '\'' +
                ", sourceId='" + sourceId + '\'' +
                ", yearId='" + yearId + '\'' +
                '}';
    }
}
