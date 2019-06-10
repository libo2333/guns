package com.stylefeng.guns.rest.common.persistence.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.stylefeng.guns.rest.common.persistence.model.UserToken;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cskaoyan
 * @since 2019-06-05
 */
public interface UserTokenMapper extends BaseMapper<UserToken> {

    int refreshToken();
    int insertNewUsertoken(UserToken userToken);

}
