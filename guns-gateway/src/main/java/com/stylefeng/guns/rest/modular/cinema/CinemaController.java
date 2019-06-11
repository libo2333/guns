package com.stylefeng.guns.rest.modular.cinema;


import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.core.exception.ServiceException;
import com.stylefeng.guns.rest.cinema.bean.*;
import com.stylefeng.guns.rest.cinema.CinemaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("/cinema")
public class CinemaController {

    @Reference(check = false)
    CinemaService cinemaService;

    @RequestMapping("/getCinemas")
    public ResponseVo getCinemas(QueryVo queryVo)throws ServiceException {
        List<CinemaVO> cinemaTList = cinemaService.getCinemas(queryVo);
        ResponseVo<Object> responseVo = new ResponseVo<>();
        responseVo.setData(cinemaTList);
        responseVo.setStatus(0);
        responseVo.setNowPage(queryVo.getNowPage());
        responseVo.setTotalPage(cinemaTList.size()/queryVo.getPageSize()+1);
        return responseVo;
    }

    @RequestMapping("/getCondition")
    public ResponseVo getCondition(QueryVo queryVo)throws ServiceException{
        ConditionData data = cinemaService.getCondition(queryVo);
        ResponseVo<Object> responseVo = new ResponseVo<>();
        responseVo.setData(data);
        responseVo.setImgPre("http://img.meetingshop.cn/");
        responseVo.setStatus(0);
        return responseVo;
    }

    @RequestMapping("/getFields")
    public ResponseVo getFields(Integer cinemaId)throws ServiceException{
        FieldsData data = cinemaService.getFields(cinemaId);
        ResponseVo<Object> responseVo = new ResponseVo<>();
        responseVo.setData(data);
        responseVo.setImgPre("http://img.meetingshop.cn/");
        responseVo.setStatus(0);
        return responseVo;
    }

    @RequestMapping("/getFieldInfo")
    public ResponseVo getFieldInfo(Integer cinemaId,Integer fieldId)throws ServiceException{
        FiledInfoData data = cinemaService.getFieldInfo(cinemaId,fieldId);
        ResponseVo<Object> responseVo = new ResponseVo<>();
        responseVo.setData(data);
        responseVo.setImgPre("http://img.meetingshop.cn/");
        responseVo.setStatus(0);
        return responseVo;
    }
}
