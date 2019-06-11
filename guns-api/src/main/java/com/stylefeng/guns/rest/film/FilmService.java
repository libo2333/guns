package com.stylefeng.guns.rest.film;

import com.stylefeng.guns.rest.film.bean.film_index.BannerVo;
import com.stylefeng.guns.rest.film.bean.film_index.FilmInfo;
import com.stylefeng.guns.rest.film.bean.film_index.FilmVo;

import java.util.List;

public interface FilmService {
   List<BannerVo> getBanner();
   FilmVo getHotFilms(boolean isLimit, int nums);
   FilmVo getSoonFilms(boolean isLimit, int nums);
   List<FilmInfo> getBoxRanking();
   List<FilmInfo> getExpectRanking();
   List<FilmInfo> getTop();
}
