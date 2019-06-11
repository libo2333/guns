package com.stylefeng.guns.rest.modular.film.controller;


import com.stylefeng.guns.rest.modular.film.service.IMtimeBannerTService;
import com.stylefeng.guns.rest.persistence.model.MtimeBannerT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;

/**
 * <p>
 * banner信息表 前端控制器
 * </p>
 *
 * @author loycu
 * @since 2019-06-05
 */
@Controller
@RequestMapping("/mtimeBannerT")
public class MtimeBannerTController {
    @Autowired
    IMtimeBannerTService iMtimeBannerTService;

    @RequestMapping("/queryById")
    public MtimeBannerT query(Serializable serializable) {
        return iMtimeBannerTService.selectById(serializable);
    }

    @RequestMapping("/deleteById")
    public boolean delete(Serializable serializable) {
        return iMtimeBannerTService.deleteById(serializable);
    }

    @RequestMapping("/add")
    public boolean add(@RequestBody MtimeBannerT mtimeFilmInfoT) {
        return iMtimeBannerTService.insert(mtimeFilmInfoT);
    }

    @RequestMapping("/update")
    public boolean update(@RequestBody MtimeBannerT mtimeFilmInfoT) {
        return iMtimeBannerTService.updateById(mtimeFilmInfoT);
    }

}

