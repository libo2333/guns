package com.stylefeng.guns.rest.film.bean.film_query;

import lombok.Data;

import java.io.Serializable;

@Data
public class RequestVo implements Serializable {
    int showType=1;
    int sortId=1;
    int catId=99;
    int sourceId=99;
    int yearId=99;
    int nowPage=99;
    int PageSize=18;
}
