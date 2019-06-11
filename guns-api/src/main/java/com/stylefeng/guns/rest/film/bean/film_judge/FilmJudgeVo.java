package com.stylefeng.guns.rest.film.bean.film_judge;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class FilmJudgeVo implements Serializable {
    List<CatVo> catInfo;
    List<SourceVo>  sourceInfo;
    List<YearVo> yearInfo;
}
