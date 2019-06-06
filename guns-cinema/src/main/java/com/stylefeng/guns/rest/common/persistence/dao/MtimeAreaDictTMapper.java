package com.stylefeng.guns.rest.common.persistence.dao;

import com.stylefeng.guns.rest.cinema.bean.AreaVO;
import com.stylefeng.guns.rest.common.persistence.model.MtimeAreaDictT;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 地域信息表 Mapper 接口
 * </p>
 *
 * @author cskaoyan
 * @since 2019-06-04
 */
public interface MtimeAreaDictTMapper extends BaseMapper<MtimeAreaDictT> {

    List<AreaVO> selectAreaList(@Param("areaId") Integer areaId);
}
