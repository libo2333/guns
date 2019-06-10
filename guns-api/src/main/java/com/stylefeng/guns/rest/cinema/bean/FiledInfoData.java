package com.stylefeng.guns.rest.cinema.bean;

import java.io.Serializable;

public class FiledInfoData implements Serializable {
    MtimeHallFilmInfoT filmInfo;
    MtimeCinemaT cinemaInfo;
    MtimeHallDictT hallInfo;

    public MtimeHallFilmInfoT getFilmInfo() {
        return filmInfo;
    }

    public void setFilmInfo(MtimeHallFilmInfoT filmInfo) {
        this.filmInfo = filmInfo;
    }

    public MtimeCinemaT getCinemaInfo() {
        return cinemaInfo;
    }

    public void setCinemaInfo(MtimeCinemaT cinemaInfo) {
        this.cinemaInfo = cinemaInfo;
    }

    public MtimeHallDictT getHallInfo() {
        return hallInfo;
    }

    public void setHallInfo(MtimeHallDictT hallInfo) {
        this.hallInfo = hallInfo;
    }

    @Override
    public String toString() {
        return "FiledInfoData{" +
                "filmInfo=" + filmInfo +
                ", cinemaInfo=" + cinemaInfo +
                ", hallInfo=" + hallInfo +
                '}';
    }
}
