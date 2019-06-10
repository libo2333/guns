package com.stylefeng.guns.rest.modular.film.bean.dictionary;

import java.io.Serializable;

/**
 * @author czy
 * @date 2019/6/5 9:45
 */
public class FilmYear implements Serializable {
    private int yearId;
    private String yearName;
    private boolean isActive;

    public int getYearId() {
        return yearId;
    }

    public void setYearId(int yearId) {
        this.yearId = yearId;
    }

    public String getYearName() {
        return yearName;
    }

    public void setYearName(String yearName) {
        this.yearName = yearName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "FilmYear{" +
                "yearId=" + yearId +
                ", yearName='" + yearName + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
