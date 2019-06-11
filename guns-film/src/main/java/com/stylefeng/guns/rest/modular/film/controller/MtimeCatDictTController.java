package com.stylefeng.guns.rest.modular.film.controller;


import com.stylefeng.guns.rest.modular.film.service.IMtimeCatDictTService;
import com.stylefeng.guns.rest.persistence.model.MtimeCatDictT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;

/**
 * <p>
 * 类型信息表 前端控制器
 * </p>
 *
 * @author loycu
 * @since 2019-06-05
 */
@Controller
@RequestMapping("/mtimeCatDictT")
public class MtimeCatDictTController {
    @Autowired
    IMtimeCatDictTService iMtimeCatDictTService;

    @RequestMapping("/queryById")
    public MtimeCatDictT query(Serializable serializable) {
        return iMtimeCatDictTService.selectById(serializable);
    }

    @RequestMapping("/deleteById")
    public boolean delete(Serializable serializable) {
        return iMtimeCatDictTService.deleteById(serializable);
    }

    @RequestMapping("/add")
    public boolean add(@RequestBody MtimeCatDictT mtimeFilmInfoT) {
        return iMtimeCatDictTService.insert(mtimeFilmInfoT);
    }

    @RequestMapping("/update")
    public boolean update(@RequestBody MtimeCatDictT mtimeFilmInfoT) {
        return iMtimeCatDictTService.updateById(mtimeFilmInfoT);
    }
}

