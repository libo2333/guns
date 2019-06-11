package com.stylefeng.guns.rest.film.bean.film_judge;

import lombok.Data;

import java.io.Serializable;

@Data
public class YearVo implements Serializable {
    int yearId=99;
    String yearName;
    boolean isActive=true;
}
