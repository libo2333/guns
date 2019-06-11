package com.stylefeng.guns.rest.modular.film.controller;


import com.stylefeng.guns.rest.modular.film.service.IMtimeFilmTService;
import com.stylefeng.guns.rest.persistence.model.MtimeFilmT;
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
 * @since 2019-06-04
 */
@RestController
@RequestMapping("/mtimeFilmT")
public class MtimeFilmTController {

    @Autowired
    IMtimeFilmTService iMtimeFilmTService;

    @RequestMapping("/queryById")
    public MtimeFilmT query(Serializable serializable) {
        return iMtimeFilmTService.selectById(serializable);
    }

    @RequestMapping("/deleteById")
    public boolean delete(Serializable serializable) {
        return iMtimeFilmTService.deleteById(serializable);
    }

    @RequestMapping("/add")
    public boolean add(@RequestBody MtimeFilmT mtimeFilmT) {
        return iMtimeFilmTService.insert(mtimeFilmT);
    }
    @RequestMapping("/update")
    public boolean update(@RequestBody MtimeFilmT mtimeFilmT){
        return iMtimeFilmTService.updateById(mtimeFilmT);
    }

}

