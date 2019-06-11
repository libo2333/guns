package com.stylefeng.guns.rest.film.bean.film_query;

import lombok.Data;

import java.io.Serializable;

@Data
public class FilmProfile implements Serializable {
    int filmId;
    int filmType;
    String imgAddress;
    String filmName;
    String film_Score;
    public FilmProfile() {
    }
}
