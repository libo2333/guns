package com.stylefeng.guns.rest.persistence.dao;

import com.stylefeng.guns.rest.film.bean.film_index.BannerVo;
import com.stylefeng.guns.rest.film.bean.film_index.FilmInfo;
import com.stylefeng.guns.rest.film.bean.film_index.FilmVo;

import java.util.List;

public interface FilmMapper {
    List<BannerVo> getBanner();

    FilmVo getHotFilm(boolean isLimit, int nums);

    FilmVo getSoonFilm(boolean isLimit, int nums);

    List<FilmInfo> getBoxRanking();

    List<FilmInfo> getExpectRanking();

    List<FilmInfo> getTop();
}
