package com.stylefeng.guns.rest.modular.film.controller;


import com.stylefeng.guns.rest.modular.film.service.IMtimeSourceDictTService;
import com.stylefeng.guns.rest.persistence.model.MtimeSourceDictT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;

/**
 * <p>
 * 区域信息表 前端控制器
 * </p>
 *
 * @author loycu
 * @since 2019-06-05
 */
@Controller
@RequestMapping("/mtimeSourceDictT")
public class MtimeSourceDictTController {
    @Autowired
    IMtimeSourceDictTService iMtimeSourceDictTService;

    @RequestMapping("/queryById")
    public MtimeSourceDictT query(Serializable serializable) {
        return iMtimeSourceDictTService.selectById(serializable);
    }

    @RequestMapping("/deleteById")
    public boolean delete(Serializable serializable) {
        return iMtimeSourceDictTService.deleteById(serializable);
    }

    @RequestMapping("/add")
    public boolean add(@RequestBody MtimeSourceDictT mtimeFilmInfoT) {
        return iMtimeSourceDictTService.insert(mtimeFilmInfoT);
    }

    @RequestMapping("/update")
    public boolean update(@RequestBody MtimeSourceDictT mtimeFilmInfoT) {
        return iMtimeSourceDictTService.updateById(mtimeFilmInfoT);
    }
}

