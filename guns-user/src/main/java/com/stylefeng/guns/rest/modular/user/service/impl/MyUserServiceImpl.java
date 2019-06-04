package com.stylefeng.guns.rest.modular.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.rest.common.persistence.dao.UserMapper;
import com.stylefeng.guns.rest.user.UserService;
import com.stylefeng.guns.rest.user.bean.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Service(interfaceClass = UserService.class)
@Component
public class MyUserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String getUsername(String id) {
        return "user" + id;
    }

    @Override
    public ResponseVO returnResponseVO() {
        return new ResponseVO(0,"1");
    }
}
