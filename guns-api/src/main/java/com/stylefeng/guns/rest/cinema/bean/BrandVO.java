package com.stylefeng.guns.rest.cinema.bean;

import java.io.Serializable;

public class BrandVO implements Serializable {
    private Integer brandId;
    private String brandName;
    private boolean isActive = false;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "BrandVO{" +
                "brandId='" + brandId + '\'' +
                ", brandName='" + brandName + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
