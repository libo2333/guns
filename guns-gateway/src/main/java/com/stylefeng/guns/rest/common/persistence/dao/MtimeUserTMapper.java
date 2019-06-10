package com.stylefeng.guns.rest.common.persistence.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.stylefeng.guns.rest.common.persistence.model.MtimeUserT;
import com.stylefeng.guns.rest.user.bean.UserInfoModel;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author cskaoyan
 * @since 2019-06-04
 */
public interface MtimeUserTMapper extends BaseMapper<MtimeUserT> {

    List<MtimeUserT> selectListByUsername(String username);

    int updateUserInfo(UserInfoModel userInfoModel);

    List<MtimeUserT> selectByUUID(int UUID);

    int selectUUIDbyUsername(String username);
}
