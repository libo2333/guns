package com.stylefeng.guns.rest.modular.film;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.film.FilmService;
import com.stylefeng.guns.rest.film.bean.ResponseVo;
import com.stylefeng.guns.rest.film.bean.film_index.BannerVo;
import com.stylefeng.guns.rest.film.bean.film_index.FilmIndexVo;
import com.stylefeng.guns.rest.film.bean.film_index.FilmVo;
import com.stylefeng.guns.rest.film.bean.film_info.FilmInfoVo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("film")
public class FilmController {
    @Reference
    FilmService filmService;

    @RequestMapping("getIndex")
    public ResponseVo<FilmIndexVo> getIndex(@RequestParam("isLimit") boolean isLimit, @RequestParam("nums") int nums) {
        List<BannerVo> banner = filmService.getBanner();
        FilmVo hotFilms = filmService.getHotFilms(isLimit, nums);
        FilmIndexVo filmIndexVo = new FilmIndexVo(banner,
                hotFilms,
                filmService.getSoonFilms(isLimit, nums),
                filmService.getBoxRanking(),
                filmService.getExpectRanking(),
                filmService.getTop());
        return new ResponseVo<>(1, "imgPre：’http://img.meetingshop.cn/’",
                filmIndexVo);
    }

    /*  @RequestMapping("getConditionList")
      public ResponseVo getConditionList()*/
    @RequestMapping("films/{data}")
    public void getInfo(@PathVariable("data") String data, @RequestParam("searchType") int searchType) {
        FilmInfoVo filmInfoVo=new FilmInfoVo();
        if (searchType ==0) { //编号是varchar
           filmService.getInfo01(data);
        } else if (searchType == 1) {

        }
        return new ResponseVo<>(1, "imgPre：’http://img.meetingshop.cn/’",
                );
    }
}
