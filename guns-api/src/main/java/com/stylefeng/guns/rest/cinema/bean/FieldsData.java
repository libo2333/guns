package com.stylefeng.guns.rest.cinema.bean;

import java.io.Serializable;
import java.util.List;

public class FieldsData implements Serializable {
    MtimeCinemaT cinemaInfo;
    List<MtimeHallFilmInfoT> filmList;

    public MtimeCinemaT getCinemaInfo() {
        return cinemaInfo;
    }

    public void setCinemaInfo(MtimeCinemaT cinemaInfo) {
        this.cinemaInfo = cinemaInfo;
    }

    public List<MtimeHallFilmInfoT> getFilmList() {
        return filmList;
    }

    public void setFilmList(List<MtimeHallFilmInfoT> filmList) {
        this.filmList = filmList;
    }

    @Override
    public String toString() {
        return "FieldsData{" +
                "cinemaInfo=" + cinemaInfo +
                ", filmList=" + filmList +
                '}';
    }
}
