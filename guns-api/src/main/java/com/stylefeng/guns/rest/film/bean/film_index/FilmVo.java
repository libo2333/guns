package com.stylefeng.guns.rest.film.bean.film_index;



import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class FilmVo implements Serializable {
    private int filmNum;
    private int nowPage;
    private int totalPage;
    private List<FilmInfo> filmInfo;
}
