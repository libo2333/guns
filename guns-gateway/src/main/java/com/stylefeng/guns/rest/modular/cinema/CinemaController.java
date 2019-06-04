package com.stylefeng.guns.rest.modular.cinema;


import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.film.FilmService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinema")
public class CinemaController {



    @RequestMapping("/test")
    public String getResult(){

        System.out.println("get rest!");

        return  "ok";

    }


    @Reference
    FilmService filmService;


    @RequestMapping("/getfilmbyid")
    public String getFilmById(int id ){

        //MoocFilmT moocFilmT = filmTService.selectById(id);

        String filmName = filmService.getFilmName("" + id);

        return  filmName;

    }

}
