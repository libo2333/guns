package com.stylefeng.guns.rest.modular.film;


import com.stylefeng.guns.rest.common.persistence.model.MoocFilmT;
import com.stylefeng.guns.rest.modular.film.service.IMoocFilmTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/film")
public class FilmController {



    @RequestMapping("/test")
    public String getResult(){

        System.out.println("get rest!");

        return  "ok";

    }


    @Autowired
    IMoocFilmTService filmTService;


    @RequestMapping("/getfilmbyid")
    public MoocFilmT getFilmById(int id ){

        MoocFilmT moocFilmT = filmTService.selectById(id);

        return  moocFilmT;

    }

}
