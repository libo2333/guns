package com.stylefeng.guns.rest.modular.user;


import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.common.persistence.dao.UserTokenMapper;
import com.stylefeng.guns.rest.common.persistence.model.User;
import com.stylefeng.guns.rest.config.properties.JwtProperties;
import com.stylefeng.guns.rest.modular.auth.util.JwtTokenUtil;
import com.stylefeng.guns.rest.user.UserService;
import com.stylefeng.guns.rest.user.bean.ResponseVO;
import com.stylefeng.guns.rest.user.bean.UserInfoModel;
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
    @RequestMapping("logout")
    public ResponseVO logout(){
       /* int i = userTokenMapper.refreshToken();
        if(i!=0){
        return new ResponseVO(0,"成功退出");
        }else{
            return new ResponseVO(1,"退出失败");
        }*/
        ResponseVO logout = userService.logout();
        return  logout;
    }

    @Autowired
    JwtProperties jwtProperties;
    @Autowired
    JwtTokenUtil jwtTokenUtil;
    @RequestMapping("getUserInfo")
    public Map<String,Object> getUserInfo(HttpServletRequest request){
        HashMap<String, Object> hashMap = new HashMap<>();

        String requestHeader = request.getHeader(jwtProperties.getHeader());
        String authToken = requestHeader.substring(7);
        String username = jwtTokenUtil.getUsernameFromToken(authToken);

        UserInfoModel userInfo = userService.getUserInfo(username);
        //

        if(userInfo == null){
            hashMap.put("status",1);
            hashMap.put("msg","用户尚未登陆");
            return hashMap;
        }

        hashMap.put("status",0);
        hashMap.put("data",userInfo);
        return hashMap;
    }

    @RequestMapping("updateUserInfo")
    public Map<String,Object> updateUserInfo(UserInfoModel userInfoModel){
        HashMap<String,Object> hashMap = userService.updateUserInfo(userInfoModel);
        return hashMap;
    }
}
