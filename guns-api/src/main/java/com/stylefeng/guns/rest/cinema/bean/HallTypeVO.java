package com.stylefeng.guns.rest.cinema.bean;

import java.io.Serializable;

public class HallTypeVO implements Serializable {
    private Integer halltypeId;
    private String halltypeName;
    private boolean isActive = false;

    public Integer getHalltypeId() {
        return halltypeId;
    }

    public void setHalltypeId(Integer halltypeId) {
        this.halltypeId = halltypeId;
    }

    public String getHalltypeName() {
        return halltypeName;
    }

    public void setHalltypeName(String halltypeName) {
        this.halltypeName = halltypeName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "HallTypeVO{" +
                "halltypeId='" + halltypeId + '\'' +
                ", halltypeName='" + halltypeName + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
