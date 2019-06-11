package com.stylefeng.guns.rest.film;

import com.stylefeng.guns.rest.film.bean.film_info.FilmInfoVo;

public interface FilmInfoService {
    FilmInfoVo getAll(int id);
    FilmInfoVo getALLByName(String name);
}
