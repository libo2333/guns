package com.stylefeng.guns.rest.modular.user;


import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.common.persistence.model.User;
import com.stylefeng.guns.rest.user.UserService;
import com.stylefeng.guns.rest.user.bean.ResponseVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    @RequestMapping("test")
    public String test(){
        return "ok";
    }

    @Reference
    UserService userService;
    @RequestMapping("logout")
    public ResponseVO logout(){
        ResponseVO responseVO = userService.returnResponseVO();
        return responseVO;
    }
}
