package com.stylefeng.guns.rest.modular.film.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.rest.film.FilmQueryService;
import com.stylefeng.guns.rest.film.bean.ResponseVo;
import com.stylefeng.guns.rest.film.bean.film_query.FilmProfile;
import com.stylefeng.guns.rest.film.bean.film_query.RequestVo;
import com.stylefeng.guns.rest.persistence.dao.FilmQueryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service(interfaceClass = FilmQueryService.class)
@Component
public class FilmQueryServiceImpl implements FilmQueryService {
    @Autowired
    FilmQueryMapper filmQueryMapper;
    @Override
    public ResponseVo<FilmProfile> queryFilm(RequestVo requestVo) {
        if (requestVo.getSortId()== 1) {
            return filmQueryMapper.queryByHot(requestVo);
        } else if (requestVo.getSortId()== 2) {
            return filmQueryMapper.queryByTime(requestVo);
        } else if (requestVo.getSortId()== 3) {
            return filmQueryMapper.queryByEvaluation(requestVo);
        }
        return null;
    }


}
