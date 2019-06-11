package com.stylefeng.guns.rest.modular.pay.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.core.exception.ServiceException;
import com.stylefeng.guns.rest.modular.alipay.demo.trade.PayUtil;
import com.stylefeng.guns.rest.modular.alipay.demo.trade.model.TradeStatus;
import com.stylefeng.guns.rest.pay.bean.PayData;
import com.stylefeng.guns.rest.pay.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service(interfaceClass = PayService.class)
@Component
public class PayServiceImpl implements PayService {

    @Autowired
    PayUtil payUtil;

    @Override
    public PayData getPayInfo(String orderId) {
        TradeStatus tradeStatus = payUtil.test_trade_precreate(orderId);
        PayData payData = new PayData();
        switch (tradeStatus) {
            case SUCCESS:
                payData.setQRCodeAddress("QRCodes/" + orderId + ".png");
                break;
            case FAILED:
                throw new ServiceException(1, "订单支付失败，请稍后重试");
            case UNKNOWN:
                throw new ServiceException(1, "系统异常，预下单状态未知!!!");
            default:
                throw new ServiceException(1, "系统异常");
        }
        //封装数据
        payData.setOrderId(orderId);
        return payData;
    }

    @Override
    public PayData getPayResult(String orderId, Integer tryNums) {
       PayData payData = new PayData();
        if(tryNums > 3){
            throw new ServiceException(1,"订单支付失败，请稍后重试");
        }

        TradeStatus tradeStatus = payUtil.test_trade_query(orderId);

        switch (tradeStatus){
            case SUCCESS:
                payData.setOrderMsg("支付成功");
                payData.setOrderId(orderId);
                payData.setOrderStatus(1);
                break;
            case FAILED:
                throw new ServiceException(1,"订单支付失败，请稍后重试");
            case UNKNOWN:
                throw new ServiceException(1,"系统异常，订单支付状态未知!!!");
            default:
                throw new ServiceException(1,"不支持的交易状态，交易返回异常!!!");
        }
        return payData;
    }
}
