package com.stylefeng.guns.rest.cinema;

import com.stylefeng.guns.rest.cinema.bean.*;

import java.util.List;

/**
 * <p>
 * 影院信息表 服务类
 * </p>
 *
 * @author cskaoyan
 * @since 2019-06-04
 */
public interface CinemaService{

    List<CinemaVO> getCinemas(QueryVo queryVo);

    ConditionData getCondition(QueryVo queryVo);

    List<MtimeHallFilmInfoT> getFields(Integer cinemaId);

    FiledInfoData getFieldInfo(Integer cinemaId, Integer fieldId);
}
