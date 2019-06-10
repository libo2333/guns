package com.stylefeng.guns.rest.modular.film.service;

import com.stylefeng.guns.core.exception.ServiceException;
import com.stylefeng.guns.rest.modular.film.bean.MtimeFilmT;
import com.stylefeng.guns.rest.modular.film.bean.film.ConditionParam;
import com.stylefeng.guns.rest.modular.film.bean.resultvo.FilmConditionVo;

/**
 * @author czy
 * @date 2019/6/4 17:09
 */
public interface FilmService {
    /**
     * 测试
     * @param id 影片ID
     * @return MtimeFilmT
     */
    MtimeFilmT getFilmById(int id);

    /**
     * 影片条件列表查询接口
     * @param  conditionParam catId,sourceId,yearId
     * @return FilmConditionVo
     */
    FilmConditionVo getConditionList(ConditionParam conditionParam) throws ServiceException;
}
