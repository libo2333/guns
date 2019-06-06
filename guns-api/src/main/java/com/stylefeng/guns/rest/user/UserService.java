package com.stylefeng.guns.rest.user;

import com.stylefeng.guns.rest.user.bean.ResponseVO;
import com.stylefeng.guns.rest.user.bean.UserInfoModel;

import java.util.HashMap;

public interface UserService {

    String getUsername(String id);

    ResponseVO returnResponseVO();

    ResponseVO logout();

    UserInfoModel getUserInfo(String username);

    HashMap<String, Object> updateUserInfo(UserInfoModel userInfoModel);
}
