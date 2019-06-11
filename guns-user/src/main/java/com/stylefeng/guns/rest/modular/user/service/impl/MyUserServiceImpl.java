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

import java.text.SimpleDateFormat;
import java.util.Date;
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
        UserInfoModel userInfoModel = new UserInfoModel();
        String nickName = mtimeUserT.getNickName();
        Integer userSex = mtimeUserT.getUserSex();
        String birthday = mtimeUserT.getBirthday();
        Integer lifeState = mtimeUserT.getLifeState();
        String biography = mtimeUserT.getBiography();
        String headUrl = mtimeUserT.getHeadUrl();

        userInfoModel.setUsername(mtimeUserT.getUserName());
        userInfoModel.setUuid(mtimeUserT.getUuid());
        userInfoModel.setEmail(mtimeUserT.getEmail());
        userInfoModel.setPhone(mtimeUserT.getUserPhone());
        userInfoModel.setAddress(mtimeUserT.getAddress());
        userInfoModel.setCreateTime(mtimeUserT.getBeginTime().getTime());
        userInfoModel.setUpdateTime(mtimeUserT.getUpdateTime().getTime());

        if(nickName==null || nickName.equals("")){
            userInfoModel.setNickname("");
        }else { userInfoModel.setNickname(nickName);}

        if(userSex==null){
            userInfoModel.setSex(0);
        }else {userInfoModel.setSex(userSex);}

        if(birthday==null ||birthday.equals("")){
            userInfoModel.setBirthday("");
        }else{userInfoModel.setBirthday(birthday);}

        if(lifeState==null){
            userInfoModel.setLifeState("0");
        }else {userInfoModel.setLifeState(lifeState.toString());}

        if(biography == null || biography.equals("")){
            userInfoModel.setBiography("");
        }else {userInfoModel.setBiography(biography);}

        if(headUrl == null){
            userInfoModel.setHeadAddress("");
        }else {userInfoModel.setHeadAddress(headUrl); }

        return userInfoModel;
    }

    @Override
    public HashMap<String, Object> updateUserInfo(UserInfoModel userInfoModel) {
        HashMap<String, Object> hashMap = new HashMap<>();

        //判断userInfoModel空字段
        String nickname = userInfoModel.getNickname();
        String biography = userInfoModel.getBiography();
        String headAddress = userInfoModel.getHeadAddress();
        long updateTime = userInfoModel.getUpdateTime();
        Date date = new Date(updateTime);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");


        if(nickname == null || nickname.equals("")){
            userInfoModel.setNickname("");
        }
        if(biography == null){
            userInfoModel.setBiography("");
        }
        if(headAddress == null){
            userInfoModel.setHeadAddress("");
        }

        int update = mtimeUserTMapper.updateUserInfo(userInfoModel);
        if(update == 0){
            hashMap.put("status",1);
            hashMap.put("msg","用户信息修改失败");
            return hashMap;
        }

        /*List<MtimeUserT> mtimeUserTs = mtimeUserTMapper.selectByUUID(userInfoModel.getUuid());
        MtimeUserT mtimeUserT = mtimeUserTs.get(0);*/




        hashMap.put("status",0);
        hashMap.put("data",userInfoModel);
        return hashMap;
    }

    @Override
    public ResponseVO register(UserModel userModel) {
        List<MtimeUserT> mtimeUserTS = mtimeUserTMapper.selectListByUsername(userModel.getUsername());
        if(mtimeUserTS.size()!=0){
            return new ResponseVO(1,"用户已存在");
        }

        //检查所有为空为null的字段
       /* String email = userModel.getEmail();
        String phone = userModel.getPhone();
        String address = userModel.getAddress();
        if()*/

        int flag = mtimeUserTMapper.register(userModel);
        return new ResponseVO(0,"注册成功");
    }

    @Override
    public ResponseVO check(String username) {
        List<MtimeUserT> mtimeUserTS = mtimeUserTMapper.selectListByUsername(username);
        return mtimeUserTS.size()==0?new ResponseVO(1,"验证失败"):new ResponseVO(0,"验证成功");
    }
}
