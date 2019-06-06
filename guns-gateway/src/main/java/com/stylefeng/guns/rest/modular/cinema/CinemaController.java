package com.stylefeng.guns.rest.modular.cinema;


import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.cinema.bean.CinemaVO;
import com.stylefeng.guns.rest.cinema.bean.ConditionData;
import com.stylefeng.guns.rest.cinema.bean.QueryVo;
import com.stylefeng.guns.rest.cinema.bean.ResponseVo;
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
    public ResponseVo getCinemas(QueryVo queryVo){
        List<CinemaVO> cinemaTList = cinemaService.getCinemas(queryVo);
        ResponseVo<Object> responseVo = new ResponseVo<>();
        responseVo.setData(cinemaTList);
        responseVo.setStatus(0);
        responseVo.setNowPage(queryVo.getNowPage());
        responseVo.setTotalPage(cinemaTList.size()/queryVo.getPageSize()+1);
        return responseVo;
    }

    @RequestMapping("/getCondition")
    public ResponseVo getCondition(QueryVo queryVo){
        ConditionData data = cinemaService.getCondition(queryVo);
        ResponseVo<Object> responseVo = new ResponseVo<>();
        responseVo.setData(data);
        responseVo.setStatus(0);
        return responseVo;
    }
}
