package com.stylefeng.guns.rest.modular.film.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.rest.film.FilmService;
import org.springframework.stereotype.Component;


@Service(interfaceClass = FilmService.class)
@Component
public class MyFilmServiceImpl implements FilmService {


    @Override
    public String getFilmName(String id) {
        return "mtime" + id;
    }
}
