package com.stylefeng.guns.rest.cinema.bean;

import java.io.Serializable;
import java.util.List;

public class ConditionData implements Serializable {
    private List<BrandVO> brandList;
    private List<AreaVO> areaList;
    private List<HallTypeVO> hallTypeList;

    public List<BrandVO> getBrandList() {
        return brandList;
    }

    public void setBrandList(List<BrandVO> brandList) {
        this.brandList = brandList;
    }

    public List<AreaVO> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<AreaVO> areaList) {
        this.areaList = areaList;
    }

    public List<HallTypeVO> getHallTypeList() {
        return hallTypeList;
    }

    public void setHallTypeList(List<HallTypeVO> hallTypeList) {
        this.hallTypeList = hallTypeList;
    }

    @Override
    public String toString() {
        return "ConditionData{" +
                "brandList=" + brandList +
                ", areaList=" + areaList +
                ", hallTypeList=" + hallTypeList +
                '}';
    }
}
