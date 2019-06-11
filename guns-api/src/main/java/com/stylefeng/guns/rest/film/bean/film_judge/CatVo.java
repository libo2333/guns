package com.stylefeng.guns.rest.film.bean.film_judge;

import lombok.Data;

import java.io.Serializable;

@Data
public class CatVo implements Serializable {
    int catId=99;
    String catName;
    boolean isActive=true;
}
