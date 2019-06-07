package com.stylefeng.guns.rest.film.film_index;



import lombok.Data;

import java.io.Serializable;

@Data
public class FilmInfo implements Serializable {
    private String filmId;
    private int filmType;
    private String imgAddress;
    private String filmName;
    private String filmScore;
    private int expectNum;
    private String showTime;
    private int boxNum;
    private String score;
}
