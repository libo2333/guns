package com.stylefeng.guns.rest.film;

import com.stylefeng.guns.rest.film.bean.ResponseVo;
import com.stylefeng.guns.rest.film.bean.film_query.FilmProfile;
import com.stylefeng.guns.rest.film.bean.film_query.RequestVo;

public interface FilmQueryService {
    ResponseVo<FilmProfile> queryFilm(RequestVo requestVo);
}
