package com.stylefeng.guns.rest.modular.pay;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.core.exception.ServiceException;
import com.stylefeng.guns.rest.order.bean.ResponseVo;
import com.stylefeng.guns.rest.pay.bean.PayData;
import com.stylefeng.guns.rest.pay.service.PayService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class PayController {

    @Reference(check = false)
    PayService payService;

    @RequestMapping("/getPayInfo")
    public ResponseVo getPayInfo(String orderId)throws ServiceException {
        PayData data = payService.getPayInfo(orderId);
        ResponseVo<Object> responseVo = new ResponseVo<>();
        responseVo.setData(data);
        responseVo.setImgPre("http://img.meetingshop.cn/");
        responseVo.setStatus(0);
        return responseVo;
    }

    @RequestMapping("/getPayResult")
    public ResponseVo getPayResult(String orderId,Integer tryNums)throws ServiceException {
        PayData data = payService.getPayResult(orderId,tryNums);
        ResponseVo<Object> responseVo = new ResponseVo<>();
        responseVo.setData(data);
        responseVo.setImgPre("http://img.meetingshop.cn/");
        responseVo.setStatus(0);
        return responseVo;
    }

   /* @RequestMapping("/buyTickets")
    public ResponseVo buyTickets(Integer fieldId,Integer tryNums)throws ServiceException {
        PayData data = payService.buyTickets(orderId,tryNums);
        ResponseVo<Object> responseVo = new ResponseVo<>();
        responseVo.setData(data);
        responseVo.setImgPre("http://img.meetingshop.cn/");
        responseVo.setStatus(0);
        return responseVo;
    }*/
}
