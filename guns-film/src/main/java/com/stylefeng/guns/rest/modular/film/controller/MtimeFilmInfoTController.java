package com.stylefeng.guns.rest.modular.film.controller;


import com.stylefeng.guns.rest.modular.film.service.IMtimeFilmInfoTService;
import com.stylefeng.guns.rest.persistence.model.MtimeFilmInfoT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * <p>
 * 影片主表 前端控制器
 * </p>
 *
 * @author loycu
 * @since 2019-06-05
 */
@RestController
@RequestMapping("/mtimeFilmInfoT")
public class MtimeFilmInfoTController {


    @Autowired
    IMtimeFilmInfoTService iMtimeFilmInfoTService;

    @RequestMapping("/queryById")
    public MtimeFilmInfoT query(Serializable serializable) {
        return iMtimeFilmInfoTService.selectById(serializable);
    }

    @RequestMapping("/deleteById")
    public boolean delete(Serializable serializable) {
        return iMtimeFilmInfoTService.deleteById(serializable);
    }

    @RequestMapping("/add")
    public boolean add(@RequestBody MtimeFilmInfoT mtimeFilmInfoT) {
        return iMtimeFilmInfoTService.insert(mtimeFilmInfoT);
    }
    @RequestMapping("/update")
    public boolean update(@RequestBody MtimeFilmInfoT mtimeFilmInfoT){
        return iMtimeFilmInfoTService.updateById(mtimeFilmInfoT);
    }

}

