package com.stylefeng.guns.rest.persistence.dao;

import com.stylefeng.guns.rest.film.bean.ResponseVo;
import com.stylefeng.guns.rest.film.bean.film_query.FilmProfile;
import com.stylefeng.guns.rest.film.bean.film_query.RequestVo;

public interface FilmQueryMapper {

    ResponseVo<FilmProfile> queryByHot(RequestVo requestVo);

    ResponseVo<FilmProfile> queryByTime( RequestVo requestVo);

    ResponseVo<FilmProfile> queryByEvaluation(RequestVo requestVo);
}
