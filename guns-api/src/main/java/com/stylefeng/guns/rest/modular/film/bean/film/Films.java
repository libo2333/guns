package com.stylefeng.guns.rest.modular.film.bean.film;

import java.io.Serializable;
import java.util.List;

/**
 * @author czy
 * @date 2019/6/3 20:16
 */
public class Films implements Serializable {
    private int filmNum;
    private List<Film> filmInfo;

    public int getFilmNum() {
        return filmNum;
    }

    public void setFilmNum(int filmNum) {
        this.filmNum = filmNum;
    }

    public List<Film> getFilmInfo() {
        return filmInfo;
    }

    public void setFilmInfo(List<Film> filmInfo) {
        this.filmInfo = filmInfo;
    }

    @Override
    public String toString() {
        return "Films{" +
                "filmNum=" + filmNum +
                ", filmInfo=" + filmInfo +
                '}';
    }
}
