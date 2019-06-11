package com.stylefeng.guns.rest.modular.film.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.rest.film.FilmService;
import com.stylefeng.guns.rest.film.bean.film_index.BannerVo;
import com.stylefeng.guns.rest.film.bean.film_index.FilmInfo;
import com.stylefeng.guns.rest.film.bean.film_index.FilmVo;
import com.stylefeng.guns.rest.persistence.dao.FilmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Service(interfaceClass = FilmService.class)
@Component
public class FilmServiceImpl implements FilmService {
    @Autowired
    FilmMapper filmMapper;
    @Override
    public List<BannerVo> getBanner() {

        return filmMapper.getBanner();
    }

    @Override
    public FilmVo getHotFilms(boolean isLimit, int nums) {

        return  filmMapper.getHotFilm(isLimit, nums);
    }

    @Override
    public FilmVo getSoonFilms(boolean isLimit, int nums) {

        return filmMapper.getSoonFilm(isLimit,nums);
    }

    @Override
    public List<FilmInfo> getBoxRanking() {
        return filmMapper.getBoxRanking();
    }

    @Override
    public List<FilmInfo> getExpectRanking() {
        return filmMapper.getExpectRanking();
    }

    @Override
    public List<FilmInfo> getTop() {
        return filmMapper.getTop();
    }
}
