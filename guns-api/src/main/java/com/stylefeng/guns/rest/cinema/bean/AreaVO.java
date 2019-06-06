package com.stylefeng.guns.rest.cinema.bean;

import java.io.Serializable;

public class AreaVO implements Serializable {
    private Integer areaId;
    private String areaName;
    private boolean isActive = false;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "AreaVO{" +
                "areaId='" + areaId + '\'' +
                ", areaName='" + areaName + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
