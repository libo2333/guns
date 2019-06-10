package com.stylefeng.guns.rest.modular.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.rest.common.persistence.dao.MtimeUserTMapper;
import com.stylefeng.guns.rest.common.persistence.dao.UserMapper;
import com.stylefeng.guns.rest.common.persistence.dao.UserTokenMapper;
import com.stylefeng.guns.rest.common.persistence.model.MtimeUserT;
import com.stylefeng.guns.rest.config.properties.JwtProperties;
import com.stylefeng.guns.rest.modular.auth.util.JwtTokenUtil;
import com.stylefeng.guns.rest.user.UserService;
import com.stylefeng.guns.rest.user.bean.ResponseVO;
import com.stylefeng.guns.rest.user.bean.UserInfoModel;
import com.stylefeng.guns.rest.user.bean.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;


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
        return new ResponseVO(0, "1");
    }


    //用户退出

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private JwtProperties jwtProperties;

    @Autowired
    MtimeUserTMapper mtimeUserTMapper;

    @Autowired
    UserTokenMapper userTokenMapper;

    @Override
    public ResponseVO logout() {
        int i = userTokenMapper.refreshToken();
        return i != 0 ? new ResponseVO(0, "成功退出") : new ResponseVO(1, "退出失败");
    }

    @Override
    public UserInfoModel getUserInfo(String username) {
        List<MtimeUserT> user_name = mtimeUserTMapper.selectListByUsername(username);
        MtimeUserT mtimeUserT = user_name.get(0);
        UserInfoModel userInfoModel = new UserInfoModel(mtimeUserT.getUuid(), mtimeUserT.getUserName(), mtimeUserT.getNickName(),
                mtimeUserT.getEmail(), mtimeUserT.getUserPhone(), mtimeUserT.getUserSex(),
                mtimeUserT.getBirthday(), mtimeUserT.getLifeState().toString(), mtimeUserT.getBiography(),
                mtimeUserT.getAddress(), mtimeUserT.getHeadUrl(), mtimeUserT.getBeginTime().getTime(), mtimeUserT.getUpdateTime().getTime());
        return userInfoModel;
    }

    @Override
    public HashMap<String, Object> updateUserInfo(UserInfoModel userInfoModel) {
        HashMap<String, Object> hashMap = new HashMap<>();

        int update = mtimeUserTMapper.updateUserInfo(userInfoModel);
        if(update == 0){
            hashMap.put("status",1);
            hashMap.put("msg","用户信息修改失败");
            return hashMap;
        }

        List<MtimeUserT> mtimeUserT = mtimeUserTMapper.selectByUUID(userInfoModel.getUuid());
        hashMap.put("status",0);
        hashMap.put("data",mtimeUserT.get(0));
        return hashMap;
    }

    @Override
    public ResponseVO register(UserModel userModel) {
        List<MtimeUserT> mtimeUserTS = mtimeUserTMapper.selectListByUsername(userModel.getUsername());
        if(mtimeUserTS.size()!=0){
            return new ResponseVO(1,"用户已存在");
        }

        return null;
    }
}
