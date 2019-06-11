package com.stylefeng.guns.rest.modular.user;


import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.common.persistence.dao.UserTokenMapper;
import com.stylefeng.guns.rest.common.persistence.model.User;
import com.stylefeng.guns.rest.config.properties.JwtProperties;
import com.stylefeng.guns.rest.modular.auth.util.JwtTokenUtil;
import com.stylefeng.guns.rest.user.UserService;
import com.stylefeng.guns.rest.user.bean.ResponseVO;
import com.stylefeng.guns.rest.user.bean.UserInfoModel;
import com.stylefeng.guns.rest.user.bean.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {


    @Reference(check = false)
    UserService userService;

    @Autowired
    UserTokenMapper userTokenMapper;

    //用户退出
    @RequestMapping("logout")
    public ResponseVO logout(HttpServletRequest request){
       /* int i = userTokenMapper.refreshToken();
        if(i!=0){
        return new ResponseVO(0,"成功退出");
        }else{
            return new ResponseVO(1,"退出失败");
        }*/
        String requestHeader = request.getHeader(jwtProperties.getHeader());
        if(requestHeader==null){

            return new ResponseVO(1,"退出失败,用户尚未登录");
        }

        ResponseVO logout = userService.logout();
        return  logout;
    }

    @Autowired
    JwtProperties jwtProperties;
    @Autowired
    JwtTokenUtil jwtTokenUtil;

    //用户获取信息
    @RequestMapping("getUserInfo")
    public Map<String,Object> getUserInfo(HttpServletRequest request){
        HashMap<String, Object> hashMap = new HashMap<>();

        String requestHeader = request.getHeader(jwtProperties.getHeader());
        if(requestHeader==null){
            hashMap.put("status",1); hashMap.put("msg","查询失败，用户尚未登陆");
            return hashMap;
        }
        String authToken = requestHeader.substring(7);
        String username = jwtTokenUtil.getUsernameFromToken(authToken);

        UserInfoModel userInfo = userService.getUserInfo(username);

        hashMap.put("status",0);
        hashMap.put("data",userInfo);
        return hashMap;
    }


    //用户更新  需要登录
    @RequestMapping("updateUserInfo")
    public Map<String,Object> updateUserInfo(UserInfoModel userInfoModel){
        HashMap<String,Object> hashMap = userService.updateUserInfo(userInfoModel);
        return hashMap;
    }

    //用户注册
    @RequestMapping("register")
    public ResponseVO register(UserModel userModel){
        ResponseVO register = userService.register(userModel);
        return register;
    }

    //用户验证
    @RequestMapping("check")
    public ResponseVO check(String username){
        ResponseVO responseVO = userService.check(username);
        return responseVO;
    }
}
