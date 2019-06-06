package com.stylefeng.guns.rest.modular.auth.controller;

import com.stylefeng.guns.core.exception.GunsException;
import com.stylefeng.guns.rest.common.exception.BizExceptionEnum;
import com.stylefeng.guns.rest.common.persistence.dao.MtimeUserTMapper;
import com.stylefeng.guns.rest.common.persistence.dao.UserTokenMapper;
import com.stylefeng.guns.rest.common.persistence.model.UserToken;
import com.stylefeng.guns.rest.modular.auth.controller.dto.AuthRequest;
import com.stylefeng.guns.rest.modular.auth.controller.dto.AuthResponse;
import com.stylefeng.guns.rest.modular.auth.util.JwtTokenUtil;
import com.stylefeng.guns.rest.modular.auth.validator.IReqValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 请求验证的
 *
 * @author fengshuonan
 * @Date 2017/8/24 14:22
 */
@RestController
public class AuthController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    UserTokenMapper userTokenMapper;

    @Autowired
    MtimeUserTMapper mtimeUserTMapper;

    @Resource(name = "dbValidator")
    private IReqValidator reqValidator;

    @RequestMapping(value = "${jwt.auth-path}")
    public Map<String,Object> createAuthenticationToken(AuthRequest authRequest) {

        boolean validate = reqValidator.validate(authRequest);

        if (validate) {
            final String randomKey = jwtTokenUtil.getRandomKey();
            final String token = jwtTokenUtil.generateToken(authRequest.getUserName(), randomKey);

            //如果当前有用户已登录 则刷新token
            String userName = authRequest.getUserName();
           /* List<UserToken> tokens = userTokenMapper.selectList(new EntityWrapper<UserToken>().eq("token", token));
            if(tokens.size()!=0){*/
            //刷新token 先删除再insert
            int i = userTokenMapper.refreshToken();
            /*}*/
            int uuid = mtimeUserTMapper.selectUUIDbyUsername(userName);
            UserToken userToken = new UserToken();
            userToken.setUuid(uuid);
            userToken.setToken(token);
            userToken.setFlag(0);
            final int i1 = userTokenMapper.insertNewUsertoken(userToken);


            Map<String, Object> stringObjectHashMap = new HashMap<String, Object>();
            stringObjectHashMap.put("status",0);
            stringObjectHashMap.put("data",new AuthResponse(token, randomKey));
            return  stringObjectHashMap;
            //return ResponseEntity.ok(new AuthResponse(token, randomKey));
        } else {
            throw new GunsException(BizExceptionEnum.AUTH_REQUEST_ERROR);
        }
    }
}
