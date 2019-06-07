package com.stylefeng.guns.rest.film.film_index;


import java.io.Serializable;
import java.util.List;

public class FilmIndexVo implements Serializable {
   private List<BannerVo> banners;
   private FilmVo hotFilms;
   private FilmVo soonFilms;
   private List<FilmInfo> boxRanking;
   private List<FilmInfo> expectRanking;
   private List<FilmInfo> top100;

   public FilmIndexVo() {
   }

   public FilmIndexVo(List<BannerVo> banners, FilmVo hotFilms, FilmVo soonFilms, List<FilmInfo> boxRanking, List<FilmInfo> expectRanking, List<FilmInfo> top100) {
      this.banners = banners;
      this.hotFilms = hotFilms;
      this.soonFilms = soonFilms;
      this.boxRanking = boxRanking;
      this.expectRanking = expectRanking;
      this.top100 = top100;
   }

   public List<BannerVo> getBanners() {
      return banners;
   }

   public void setBanners(List<BannerVo> banners) {
      this.banners = banners;
   }

   public FilmVo getHotFilms() {
      return hotFilms;
   }

   public void setHotFilms(FilmVo hotFilms) {
      this.hotFilms = hotFilms;
   }

   public FilmVo getSoonFilms() {
      return soonFilms;
   }

   public void setSoonFilms(FilmVo soonFilms) {
      this.soonFilms = soonFilms;
   }

   public List<FilmInfo> getBoxRanking() {
      return boxRanking;
   }

   public void setBoxRanking(List<FilmInfo> boxRanking) {
      this.boxRanking = boxRanking;
   }

   public List<FilmInfo> getExpectRanking() {
      return expectRanking;
   }

   public void setExpectRanking(List<FilmInfo> expectRanking) {
      this.expectRanking = expectRanking;
   }

   public List<FilmInfo> getTop100() {
      return top100;
   }

   public void setTop100(List<FilmInfo> top100) {
      this.top100 = top100;
   }
}


