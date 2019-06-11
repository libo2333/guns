package com.stylefeng.guns.rest.persistence.dao;

import com.stylefeng.guns.rest.film.bean.ResponseVo;
import com.stylefeng.guns.rest.film.bean.film_judge.*;

import java.util.List;

public interface FilmSelectMapper {
    CatVo queryCatInfo(int id);

    SourceVo querySourceInfo(int id);

    YearVo queryYearInfo(int id);

    FilmJudgeVo query(RequestJudgeVo requestJudgeVo);
}
