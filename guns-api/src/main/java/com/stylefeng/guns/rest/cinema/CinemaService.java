package com.stylefeng.guns.rest.cinema;

import com.baomidou.mybatisplus.service.IService;
import com.stylefeng.guns.rest.cinema.bean.CinemaVO;
import com.stylefeng.guns.rest.cinema.bean.ConditionData;
import com.stylefeng.guns.rest.cinema.bean.QueryVo;

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
}
