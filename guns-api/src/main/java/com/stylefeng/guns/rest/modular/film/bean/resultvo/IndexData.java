package com.stylefeng.guns.rest.modular.film.bean.resultvo;


import com.stylefeng.guns.rest.modular.film.bean.banner.Banner;
import com.stylefeng.guns.rest.modular.film.bean.film.Film;
import com.stylefeng.guns.rest.modular.film.bean.film.Films;

import java.io.Serializable;
import java.util.List;

/**
 * @author czy
 * @date 2019/6/3 20:07
 */

public class IndexData implements Serializable {
    private List<Banner> banners;
    private Films hotFilms;
    private Films soonFilms;
    private List<Film> boxRanking;
    private List<Film> expectRanking;
    private List<Film> top100;

    public List<Banner> getBanners() {
        return banners;
    }

    public void setBanners(List<Banner> banners) {
        this.banners = banners;
    }

    public Films getHotFilms() {
        return hotFilms;
    }

    public void setHotFilms(Films hotFilms) {
        this.hotFilms = hotFilms;
    }

    public Films getSoonFilms() {
        return soonFilms;
    }

    public void setSoonFilms(Films soonFilms) {
        this.soonFilms = soonFilms;
    }

    @Override
    public String toString() {
        return "IndexData{" +
                "banners=" + banners +
                ", hotFilms=" + hotFilms +
                ", soonFilms=" + soonFilms +
                ", boxRanking=" + boxRanking +
                ", expectRanking=" + expectRanking +
                ", top100=" + top100 +
                '}';
    }

    public List<Film> getBoxRanking() {
        return boxRanking;
    }

    public void setBoxRanking(List<Film> boxRanking) {
        this.boxRanking = boxRanking;
    }

    public List<Film> getExpectRanking() {
        return expectRanking;
    }

    public void setExpectRanking(List<Film> expectRanking) {
        this.expectRanking = expectRanking;
    }

    public List<Film> getTop100() {
        return top100;
    }

    public void setTop100(List<Film> top100) {
        this.top100 = top100;
    }

}
