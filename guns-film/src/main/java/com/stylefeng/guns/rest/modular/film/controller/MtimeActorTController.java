package com.stylefeng.guns.rest.modular.film.controller;


import com.stylefeng.guns.rest.modular.film.service.IMtimeActorTService;
import com.stylefeng.guns.rest.persistence.model.MtimeActorT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * <p>
 * 演员表 前端控制器
 * </p>
 *
 * @author loycu
 * @since 2019-06-05
 */
@RestController
@RequestMapping("/mtimeActorT")
public class MtimeActorTController {
    @Autowired
    IMtimeActorTService iMtimeActorTService;

    @RequestMapping("/queryById")
    public MtimeActorT query(Serializable serializable) {
        return iMtimeActorTService.selectById(serializable);
    }

    @RequestMapping("/deleteById")
    public boolean delete(Serializable serializable) {
        return iMtimeActorTService.deleteById(serializable);
    }

    @RequestMapping("/add")
    public boolean add(@RequestBody MtimeActorT mtimeFilmInfoT) {
        return iMtimeActorTService.insert(mtimeFilmInfoT);
    }

    @RequestMapping("/update")
    public boolean update(@RequestBody MtimeActorT mtimeFilmInfoT) {
        return iMtimeActorTService.updateById(mtimeFilmInfoT);
    }
}

