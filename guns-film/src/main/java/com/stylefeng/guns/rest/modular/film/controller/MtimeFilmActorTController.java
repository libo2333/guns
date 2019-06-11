package com.stylefeng.guns.rest.modular.film.controller;


import com.stylefeng.guns.rest.modular.film.service.IMtimeFilmActorTService;
import com.stylefeng.guns.rest.persistence.model.MtimeFilmActorT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;

/**
 * <p>
 * 影片与演员映射表 前端控制器
 * </p>
 *
 * @author loycu
 * @since 2019-06-05
 */
@Controller
@RequestMapping("/mtimeFilmActorT")
public class MtimeFilmActorTController {
    @Autowired
    IMtimeFilmActorTService iMtimeFilmActorTService;

    @RequestMapping("/queryById")
    public MtimeFilmActorT query(Serializable serializable) {
        return iMtimeFilmActorTService.selectById(serializable);
    }

    @RequestMapping("/deleteById")
    public boolean delete(Serializable serializable) {
        return iMtimeFilmActorTService.deleteById(serializable);
    }

    @RequestMapping("/add")
    public boolean add(@RequestBody MtimeFilmActorT mtimeFilmInfoT) {
        return iMtimeFilmActorTService.insert(mtimeFilmInfoT);
    }

    @RequestMapping("/update")
    public boolean update(@RequestBody MtimeFilmActorT mtimeFilmInfoT) {
        return iMtimeFilmActorTService.updateById(mtimeFilmInfoT);
    }
}

