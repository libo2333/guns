package com.stylefeng.guns.rest.film.bean.film_judge;

import lombok.Data;

import java.io.Serializable;

@Data
public class SourceVo implements Serializable {
    int sourceId=99;
    String sourceName;
    boolean isActive=true;
}
