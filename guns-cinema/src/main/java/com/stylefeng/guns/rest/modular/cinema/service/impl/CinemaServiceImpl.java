package com.stylefeng.guns.rest.modular.cinema.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.rest.cinema.bean.*;
import com.stylefeng.guns.rest.cinema.CinemaService;
import com.stylefeng.guns.rest.common.persistence.dao.MtimeAreaDictTMapper;
import com.stylefeng.guns.rest.common.persistence.dao.MtimeBrandDictTMapper;
import com.stylefeng.guns.rest.common.persistence.dao.MtimeCinemaTMapper;
import com.stylefeng.guns.rest.common.persistence.dao.MtimeHallDictTMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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
@Transactional
@Component
public class CinemaServiceImpl implements CinemaService {

    @Autowired
    MtimeCinemaTMapper mtimeCinemaTMapper;
    @Autowired
    MtimeBrandDictTMapper mtimeBrandDictTMapper;
    @Autowired
    MtimeAreaDictTMapper mtimeAreaDictTMapper;
    @Autowired
    MtimeHallDictTMapper mtimeHallDictTMapper;

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

    @Override
    public ConditionData getCondition(QueryVo queryVo) {
        ConditionData data = new ConditionData();
        List<BrandVO> brandList = mtimeBrandDictTMapper.selectBrandList(queryVo.getBrandId());
        List<AreaVO> areaList = mtimeAreaDictTMapper.selectAreaList(queryVo.getDistrictId());
        List<HallTypeVO> hallTypeList = mtimeHallDictTMapper.selectHallTypeList(queryVo.getHallType());
        data.setBrandList(brandList);
        data.setAreaList(areaList);
        data.setHallTypeList(hallTypeList);
        return data;
    }

    @Override
    public List<MtimeHallFilmInfoT> getFields(Integer cinemaId) {
        List<MtimeHallFilmInfoT> filmList = mtimeCinemaTMapper.selectDataFilmListByCinemaId(cinemaId);
        return filmList;
    }

    @Override
    public FiledInfoData getFieldInfo(Integer cinemaId, Integer fieldId) {
        FiledInfoData data = mtimeCinemaTMapper.SelectFieldInfoByCinemaIdAndFieldId(cinemaId,fieldId);
        return data;
    }
}
