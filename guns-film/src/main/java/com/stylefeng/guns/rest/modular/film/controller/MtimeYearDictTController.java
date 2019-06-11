package com.stylefeng.guns.rest.modular.film.controller;


import com.stylefeng.guns.rest.modular.film.service.IMtimeYearDictTService;
import com.stylefeng.guns.rest.persistence.model.MtimeYearDictT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;

/**
 * <p>
 * 年代信息表 前端控制器
 * </p>
 *
 * @author loycu
 * @since 2019-06-05
 */
@Controller
@RequestMapping("/mtimeYearDictT")
public class MtimeYearDictTController {
    @Autowired
    IMtimeYearDictTService iMtimeYearDictTService;

    @RequestMapping("/queryById")
    public MtimeYearDictT query(Serializable serializable) {
        return iMtimeYearDictTService.selectById(serializable);
    }

    @RequestMapping("/deleteById")
    public boolean delete(Serializable serializable) {
        return iMtimeYearDictTService.deleteById(serializable);
    }

    @RequestMapping("/add")
    public boolean add(@RequestBody MtimeYearDictT mtimeFilmInfoT) {
        return iMtimeYearDictTService.insert(mtimeFilmInfoT);
    }

    @RequestMapping("/update")
    public boolean update(@RequestBody MtimeYearDictT mtimeFilmInfoT) {
        return iMtimeYearDictTService.updateById(mtimeFilmInfoT);
    }
}

