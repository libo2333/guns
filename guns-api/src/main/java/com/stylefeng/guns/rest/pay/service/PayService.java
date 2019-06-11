package com.stylefeng.guns.rest.pay.service;

import com.stylefeng.guns.rest.pay.bean.PayData;

public interface PayService {
    PayData getPayInfo(String orderId);

    PayData getPayResult(String orderId, Integer tryNums);
}
