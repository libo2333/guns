package com.stylefeng.guns.rest.modular.order;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.core.exception.ServiceException;
import com.stylefeng.guns.rest.order.bean.ResponseVo;
import com.stylefeng.guns.rest.order.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Reference(check = false)
    OrderService orderService;

}
