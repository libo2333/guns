package com.stylefeng.guns.rest.modular.cinema.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.rest.cinema.bean.CinemaVO;
import com.stylefeng.guns.rest.cinema.bean.QueryVo;
import com.stylefeng.guns.rest.cinema.CinemaService;
import com.stylefeng.guns.rest.common.persistence.dao.MtimeCinemaTMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 影院信息表 服务实现类
 * </p>
 *
 * @author cskaoyan
 * @since 2019-06-04
 */
@Service(interfaceClass = CinemaService.class)
@Component
public class CinemaServiceImpl implements CinemaService {

    @Autowired
    MtimeCinemaTMapper mtimeCinemaTMapper;

    @Override
    public List<CinemaVO> getCinemas(QueryVo queryVo) {
        if (queryVo.getPageSize()==0){
            queryVo.setPageSize(12);
        }
        if (queryVo.getNowPage()==0){
            queryVo.setNowPage(1);
        }
        List<CinemaVO> cinemaTList = mtimeCinemaTMapper.selectCinemasByQueryVo(queryVo);

        return cinemaTList;
    }
}
