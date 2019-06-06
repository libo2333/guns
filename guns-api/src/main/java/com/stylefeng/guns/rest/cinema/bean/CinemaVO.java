package com.stylefeng.guns.rest.cinema.bean;

import java.io.Serializable;

public class CinemaVO implements Serializable {
    private String uuid;
    private String cinemaName;
    private String address;
    private String minimumPrice;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMinimumPrice() {
        return minimumPrice;
    }

    public void setMinimumPrice(String minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    @Override
    public String toString() {
        return "CinemaVO{" +
                "uuid='" + uuid + '\'' +
                ", cinemaName='" + cinemaName + '\'' +
                ", address='" + address + '\'' +
                ", minimumPrice='" + minimumPrice + '\'' +
                '}';
    }
}
