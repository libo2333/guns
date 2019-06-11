package com.stylefeng.guns.rest.film;

import com.stylefeng.guns.rest.film.bean.film_judge.*;

public interface FilmSelectService {
    CatVo queryCatInfo(int id);
    SourceVo querySourceInfo(int id);
    YearVo queryYearInfo(int id);

    FilmJudgeVo query(RequestJudgeVo requestJudgeVo);
}
