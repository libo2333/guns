package com.stylefeng.guns.rest.persistence.dao;

import com.stylefeng.guns.rest.film.bean.film_info.Actors;
import com.stylefeng.guns.rest.film.bean.film_info.FilmInfoVo;
import com.stylefeng.guns.rest.film.bean.film_info.ImgVO;
import com.stylefeng.guns.rest.film.bean.film_info.info_dict.Img;
import com.stylefeng.guns.rest.film.bean.film_info.info_dict.Info01;
import com.stylefeng.guns.rest.film.bean.film_info.info_dict.Info02;
import com.stylefeng.guns.rest.film.bean.film_info.info_dict.Info03;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FilmInfoMapper {
  /*  String selectCatNameById(@Param("id") int[] id);

    ImgVO selectImgVoById(@Param("id") int id);*/

    Info02 getInfo02(@Param("id") int id);

    Info03 getInfo03(@Param("id") int id);

    Info01 getBeanInfo01(@Param("id") int id);

    Actors getDirectorOfActors(@Param("id") int id);

    List<Actors> getActorOfActors(@Param("id") int id);

    ImgVO getImg(@Param("id") int id);
    List<String> getInfo01(int id []);
    FilmInfoVo getFilmInfoVo(int id);

    int queryIdByName(String name);
}
