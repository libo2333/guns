package com.stylefeng.guns.rest.modular.film.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.rest.film.FilmSelectService;
import com.stylefeng.guns.rest.film.bean.ResponseVo;
import com.stylefeng.guns.rest.film.bean.film_judge.*;
import com.stylefeng.guns.rest.persistence.dao.FilmSelectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service(interfaceClass = FilmSelectService.class)
@Component
public class FilmSelectServiceImpl implements FilmSelectService {
    @Autowired
    FilmSelectMapper filmSelectMapper;
    @Override
    public CatVo queryCatInfo(int id) {
        return filmSelectMapper.queryCatInfo(id);
    }

    @Override
    public SourceVo querySourceInfo(int id) {
        return filmSelectMapper.querySourceInfo(id);
    }

    @Override
    public YearVo queryYearInfo(int id) {
        return filmSelectMapper.queryYearInfo(id);
    }

    @Override
    public FilmJudgeVo query(RequestJudgeVo requestJudgeVo) {
        return filmSelectMapper.query(requestJudgeVo);
    }
}
