package com.stylefeng.guns.rest.modular.film;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.film.FilmInfoService;
import com.stylefeng.guns.rest.film.FilmQueryService;
import com.stylefeng.guns.rest.film.FilmSelectService;
import com.stylefeng.guns.rest.film.FilmService;
import com.stylefeng.guns.rest.film.bean.ResponseFault;
import com.stylefeng.guns.rest.film.bean.ResponseList;
import com.stylefeng.guns.rest.film.bean.ResponseVo;
import com.stylefeng.guns.rest.film.bean.film_index.BannerVo;
import com.stylefeng.guns.rest.film.bean.film_index.FilmIndexVo;
import com.stylefeng.guns.rest.film.bean.film_index.FilmVo;
import com.stylefeng.guns.rest.film.bean.film_info.FilmInfoVo;
import com.stylefeng.guns.rest.film.bean.film_judge.FilmJudgeVo;
import com.stylefeng.guns.rest.film.bean.film_judge.RequestJudgeVo;
import com.stylefeng.guns.rest.film.bean.film_query.FilmProfile;
import com.stylefeng.guns.rest.film.bean.film_query.RequestVo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("film")
public class FilmController {
    @Reference(check = false)
    FilmService filmService;

    @RequestMapping("getIndex")
    public ResponseFault getIndex(@RequestParam("isLimit") boolean isLimit, @RequestParam("nums") int nums) {
        try {
        List<BannerVo> banner = filmService.getBanner();
        if(null==banner){
            ResponseFault responseFault = new ResponseFault();
            responseFault.setStatus(1);
            responseFault.setMsg("查询失败无banner加载");
            return responseFault;
        }
        FilmVo hotFilms = filmService.getHotFilms(isLimit, nums);
        FilmIndexVo filmIndexVo = new FilmIndexVo(banner,
                hotFilms,
                filmService.getSoonFilms(isLimit, nums),
                filmService.getBoxRanking(),
                filmService.getExpectRanking(),
                filmService.getTop());
        return new ResponseVo<>(1, "imgPre：’http://img.meetingshop.cn/’",
                filmIndexVo);}catch (Exception e){
            ResponseFault responseFault = new ResponseFault();
            responseFault.setMsg("系统出现异常,请联系管理员");
            responseFault.setStatus(999);
            return responseFault;
        }
    }
    @Reference(check = false)
    FilmSelectService filmSelectService;
    @RequestMapping("getConditionList")
    public ResponseFault getConditionList(RequestJudgeVo requestJudgeVo){
        try {
            FilmJudgeVo query = filmSelectService.query(requestJudgeVo);
            if (null == query) {
                ResponseFault responseFault = new ResponseFault();
                responseFault.setMsg("查询失败,无条件加载");
                responseFault.setStatus(1);
                return responseFault;
            }
            ResponseList<FilmJudgeVo> filmJudgeVoResponseList = new ResponseList<>();
            filmJudgeVoResponseList.setStatus(0);
            filmJudgeVoResponseList.setDate(query);
            return filmJudgeVoResponseList;
        }catch (Exception e){
            ResponseFault responseFault = new ResponseFault();
            responseFault.setMsg("系统出现异常,请联系管理员");
            responseFault.setStatus(999);
            return responseFault;
        }
    }
    @Reference(check = false)
    FilmInfoService filmInfoService;
    @RequestMapping("films/{data}")
    public ResponseFault getInfo(@PathVariable("data") String data,HttpServletRequest request) {
        FilmInfoVo all = null;
        ResponseFault responseFault = new ResponseFault();
        String searchType = request.getParameter("searchType");
        try {
            if (0 == Integer.parseInt(searchType)) {
                all = filmInfoService.getAll(Integer.parseInt(data));
            } else if (1 == Integer.parseInt(searchType)) {
                all = filmInfoService.getALLByName(data);
            }
            if (null == all) {
                responseFault.setMsg("查询失败,无数据加载");
                responseFault.setStatus(1);
                return responseFault;
            }
            return new ResponseVo<>(1, "imgPre：’http://img.meetingshop.cn/’", all
            );
        }catch (Exception e){
            responseFault.setStatus(999);
            responseFault.setMsg("无参数错误");
            return responseFault;
        }
    }
    @Reference(check = false)
    FilmQueryService filmQueryService;
    @RequestMapping("film/getFilms")
    public ResponseFault getFilms(RequestVo requestVo){
        try {
            ResponseVo<FilmProfile> filmProfileResponseVo = filmQueryService.queryFilm(requestVo);

            if (filmProfileResponseVo != null) {
                filmProfileResponseVo.setImgPre(" http: //img.meetingshop.cn/");
                filmProfileResponseVo.setNowPage(requestVo.getNowPage());
                filmProfileResponseVo.setStatus(0);
                return filmProfileResponseVo;
            } else {
                ResponseFault responseFault = new ResponseFault();
                responseFault.setStatus(1);
                responseFault.setMsg("查询异常,无film加载");
                return responseFault;
            }
        }catch (Exception e){
            ResponseFault responseFault = new ResponseFault();
            responseFault.setStatus(999);
            responseFault.setMsg("“系统出现异常，请联系管理员");
            return responseFault;
        }
    }
}
