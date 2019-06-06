package com.stylefeng.guns.rest.modular.film;


import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.common.persistence.model.MoocFilmT;
import com.stylefeng.guns.rest.film.FilmService;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/film")
public class FilmController {



    @RequestMapping("/test")
    public String getResult(){

        System.out.println("get rest!");

        return  "ok";

    }


    @Reference(check = false)
    FilmService filmService;


    @RequestMapping("/getfilmbyid")
    public String getFilmById(int id ){

        //MoocFilmT moocFilmT = filmTService.selectById(id);

        String filmName = filmService.getFilmName("" + id);

        return  filmName;

    }

}
