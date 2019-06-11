package com.stylefeng.guns.rest.common.persistence.dao;

import com.stylefeng.guns.rest.cinema.bean.*;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 影院信息表 Mapper 接口
 * </p>
 *
 * @author cskaoyan
 * @since 2019-06-04
 */
public interface MtimeCinemaTMapper extends BaseMapper<CinemaVO> {

    List<CinemaVO> selectCinemasByQueryVo(@Param("queryVo") QueryVo queryVo);

    List<MtimeHallFilmInfoT> selectDataFilmListByCinemaId(Integer cinemaId);

    FiledInfoData SelectFieldInfoByCinemaIdAndFieldId(Integer cinemaId, Integer fieldId);

    MtimeCinemaT selectCinemaInfoByCinemaId(Integer cinemaId);
}
