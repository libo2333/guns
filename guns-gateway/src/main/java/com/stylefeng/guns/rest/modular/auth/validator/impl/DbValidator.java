package com.stylefeng.guns.rest.modular.auth.validator.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.stylefeng.guns.rest.common.persistence.dao.MtimeUserTMapper;
import com.stylefeng.guns.rest.common.persistence.dao.UserMapper;
import com.stylefeng.guns.rest.common.persistence.model.User;
import com.stylefeng.guns.rest.modular.auth.validator.IReqValidator;
import com.stylefeng.guns.rest.modular.auth.validator.dto.Credence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 账号密码验证
 *
 * @author fengshuonan
 * @date 2017-08-23 12:34
 */
@Service
public class DbValidator implements IReqValidator {

    @Autowired
    UserMapper userMapper;

    @Autowired
    MtimeUserTMapper mtimeUserTMapper;

    @Override
    public boolean validate(Credence credence) {
        /* if(credence.getCredenceName().equals("admin") || credence.getCredenceName().equals("123456")){
            return true;
        }
        return false;*/
        //  List<MtimeUserT> users = mtimeUserTMapper.selectList(new EntityWrapper<MtimeUserT>().eq("user_name", credence.getCredenceName()));

       /* if (users != null && users.size() > 0 && users.get(0).getUserPwd().equals(credence.getCredenceCode())) {
            return true;
        } else {
            return false;
        }*/
        if((credence.getCredenceName().equals("123") && credence.getCredenceCode().equals("123"))||
                (credence.getCredenceName().equals("1234") && credence.getCredenceCode().equals("1234"))){
            return true;
        }
        return false;
    }
}
