package com.stylefeng.guns.rest.modular.film.service;


import com.stylefeng.guns.core.exception.ServiceException;
import com.stylefeng.guns.rest.modular.film.bean.resultvo.ResponseVo;

/**
 * @author czy
 * @date 2019/6/3 20:40
 */
public interface IndexService {
    /**
     * 获取主页信息
     * @return ResponseVo
     * @throws ServiceException
     */
    ResponseVo getIndex() throws ServiceException;
}
