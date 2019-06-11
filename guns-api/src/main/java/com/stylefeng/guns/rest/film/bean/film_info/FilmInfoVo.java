package com.stylefeng.guns.rest.film.bean.film_info;

import lombok.Data;

import java.io.Serializable;

@Data
public class FilmInfoVo implements Serializable {
    String filmId;
    String filmName;
    String filmEnName;
    String imgAddress;
    String score;
    int scoreNum;
    int totalBox;
    String info01;
    String info02;
    String info03;
    Info04 info04;
    ImgVO imgVO;

}
