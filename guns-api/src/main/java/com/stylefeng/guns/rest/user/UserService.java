package com.stylefeng.guns.rest.user;

import com.stylefeng.guns.rest.user.bean.ResponseVO;
import com.stylefeng.guns.rest.user.bean.UserInfoModel;
import com.stylefeng.guns.rest.user.bean.UserModel;

import java.util.HashMap;

public interface UserService {

    String getUsername(String id);

    ResponseVO returnResponseVO();

    ResponseVO logout();

    UserInfoModel getUserInfo(String username);

    HashMap<String, Object> updateUserInfo(UserInfoModel userInfoModel);

    ResponseVO register(UserModel userModel);

    ResponseVO check(String username);
}
