package com.stylefeng.guns.rest.cinema.bean;

import java.io.Serializable;

public class QueryVo implements Serializable {
    Integer brandId = 99;
    Integer districtId = 99;
    Integer hallType = 99;
    Integer pageSize = 12;
    Integer nowPage = 1;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getHallType() {
        return hallType;
    }

    public void setHallType(Integer hallType) {
        this.hallType = hallType;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getNowPage() {
        return nowPage;
    }

    public void setNowPage(Integer nowPage) {
        this.nowPage = nowPage;
    }

    @Override
    public String toString() {
        return "QueryVo{" +
                "brandId=" + brandId +
                ", districtId=" + districtId +
                ", hallType=" + hallType +
                ", pageSize=" + pageSize +
                ", nowPage=" + nowPage +
                '}';
    }
}
