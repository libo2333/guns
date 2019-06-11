package com.stylefeng.guns.rest.modular.film.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.rest.film.FilmInfoService;
import com.stylefeng.guns.rest.film.bean.film_info.*;
import com.stylefeng.guns.rest.film.bean.film_info.info_dict.Info01;
import com.stylefeng.guns.rest.film.bean.film_info.info_dict.Info02;
import com.stylefeng.guns.rest.film.bean.film_info.info_dict.Info03;
import com.stylefeng.guns.rest.persistence.dao.FilmInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service(interfaceClass = FilmInfoService.class)
@Component
public class FilmInfoServiceImpl implements FilmInfoService {
    @Autowired
    FilmInfoMapper filmInfoMapper;

    public FilmInfoVo getAll(int id) {
        try {
            FilmInfoVo filmInfoVo = filmInfoMapper.getFilmInfoVo(id);
            //info2
            Info02 info02 = filmInfoMapper.getInfo02(id);
            String new_info_02 = info02.getSource() + "/" + info02.getLength() + "分钟";
            filmInfoVo.setInfo02(new_info_02);
            //info3
            Info03 info03 = filmInfoMapper.getInfo03(id);
            String new_info_03 = info03.getTime() + " " + info03.getArea();
            filmInfoVo.setInfo03(new_info_03);
            //info1
            Info01 beanInfo01 = filmInfoMapper.getBeanInfo01(id);
            List<String> info01 = filmInfoMapper.getInfo01(beanInfo01.getShow_name());
            StringBuffer stringBuffer = new StringBuffer();
            for (String s : info01) {
                stringBuffer.append(s);
                if (!s.equals(info01.get(info01.size() - 1))) {
                    stringBuffer.append(",");
                }
            }
            String new_info01 = String.valueOf(stringBuffer);
            filmInfoVo.setInfo01(new_info01);
            //info4
            List<Actors> actorOfActors = filmInfoMapper.getActorOfActors(id);
            Actors directorOfActors = filmInfoMapper.getDirectorOfActors(id);
            Info04 info04 = new Info04();
            Participate participate = new Participate();
            participate.setActors(actorOfActors);
            participate.setDirector(directorOfActors);
            info04.setActors(participate);
            info04.setBiography(filmInfoVo.getInfo04().getBiography());
            filmInfoVo.setInfo04(info04);
            //imgVO
            ImgVO img = filmInfoMapper.getImg(id);
            filmInfoVo.setImgVO(img);
            return filmInfoVo;
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public FilmInfoVo getALLByName(String name) {
        int id=filmInfoMapper.queryIdByName(name);
        FilmInfoVo all = this.getAll(id);
        return all;
    }

    Info02 getInfo02(int id) {
        return filmInfoMapper.getInfo02(id);
    }

    Info03 getInfo03(int id) {
        return filmInfoMapper.getInfo03(id);
    }

    Info01 getBeanInfo01(int id) {
        return filmInfoMapper.getBeanInfo01(id);
    }

    Actors getDirectorOfActors(int id) {
        return filmInfoMapper.getDirectorOfActors(id);
    }

    List<Actors> getActorOfActors(int id) {

        return filmInfoMapper.getActorOfActors(id);
    }

    ImgVO getImg(int id) {
        return filmInfoMapper.getImg(id);
    }
    List<String> getInfo01(int id []){
        return filmInfoMapper.getInfo01(id);
    }
}
