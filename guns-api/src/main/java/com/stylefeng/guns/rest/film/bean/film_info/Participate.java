package com.stylefeng.guns.rest.film.bean.film_info;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Participate implements Serializable {
    Actors director;
    List<Actors> actors;
}
