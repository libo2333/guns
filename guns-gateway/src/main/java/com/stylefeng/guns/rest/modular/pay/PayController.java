package com.stylefeng.guns.rest.modular.pay;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.core.exception.ServiceException;
import com.stylefeng.guns.rest.order.bean.ResponseVo;
import com.stylefeng.guns.rest.pay.service.PayService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class PayController {

    @Reference(check = false)
    PayService payService;

    @RequestMapping("/getPayInfo")
    public ResponseVo getPayInfo(Integer orderId)throws ServiceException {
        //List<CinemaVO> cinemaTList = cinemaService.getCinemas(orderId);
        ResponseVo<Object> responseVo = new ResponseVo<>();
        /*responseVo.setData(cinemaTList);
        responseVo.setStatus(0);
        responseVo.setNowPage(queryVo.getNowPage());
        responseVo.setTotalPage(cinemaTList.size()/queryVo.getPageSize()+1);*/
        return responseVo;
    }
}
