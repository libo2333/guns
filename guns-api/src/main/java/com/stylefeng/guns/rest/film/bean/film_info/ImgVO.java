package com.stylefeng.guns.rest.film.bean.film_info;

import lombok.Data;

import java.io.Serializable;

@Data
public class ImgVO implements Serializable {
    String mainImg;
    String [] img;
}
