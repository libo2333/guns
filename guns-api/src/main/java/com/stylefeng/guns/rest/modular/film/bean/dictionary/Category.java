package com.stylefeng.guns.rest.modular.film.bean.dictionary;

import java.io.Serializable;

/**
 * @author czy
 * @date 2019/6/5 9:45
 */
public class Category implements Serializable {
    private int catId;
    private String catName;
    private boolean isActive;

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Category{" +
                "catId=" + catId +
                ", catName='" + catName + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
