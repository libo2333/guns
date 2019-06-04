package com.stylefeng.guns.rest.user;

import com.stylefeng.guns.rest.user.bean.ResponseVO;

public interface UserService {

    String getUsername(String id);

    ResponseVO returnResponseVO();
}
