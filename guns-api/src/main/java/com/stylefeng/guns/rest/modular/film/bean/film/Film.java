package com.stylefeng.guns.rest.modular.film.bean.film;

import java.io.Serializable;

/**
 * @author czy
 * @date 2019/6/3 20:13
 */
public class Film implements Serializable {
    private int filmId;
    private String filmName;
    private int filmType;
    private String imgAddress;
    private String filmScore;
    private int filmPreSaleNum;
    private int boxNum;
    private int filmSource;
    private String filmCats;
    private int filmArea;
    private int filmDate;
    private String showTime;
    private int filmStatus;
    private int expectNum;

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getFilmType() {
        return filmType;
    }

    public void setFilmType(int filmType) {
        this.filmType = filmType;
    }

    public String getImgAddress() {
        return imgAddress;
    }

    public void setImgAddress(String imgAddress) {
        this.imgAddress = imgAddress;
    }

    public String getFilmScore() {
        return filmScore;
    }

    public void setFilmScore(String filmScore) {
        this.filmScore = filmScore;
    }

    public int getFilmPreSaleNum() {
        return filmPreSaleNum;
    }

    public void setFilmPreSaleNum(int filmPreSaleNum) {
        this.filmPreSaleNum = filmPreSaleNum;
    }

    public int getBoxNum() {
        return boxNum;
    }

    public void setBoxNum(int boxNum) {
        this.boxNum = boxNum;
    }

    public int getFilmSource() {
        return filmSource;
    }

    public void setFilmSource(int filmSource) {
        this.filmSource = filmSource;
    }

    public String getFilmCats() {
        return filmCats;
    }

    public void setFilmCats(String filmCats) {
        this.filmCats = filmCats;
    }

    public int getFilmArea() {
        return filmArea;
    }

    public void setFilmArea(int filmArea) {
        this.filmArea = filmArea;
    }

    public int getFilmDate() {
        return filmDate;
    }

    public void setFilmDate(int filmDate) {
        this.filmDate = filmDate;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public int getFilmStatus() {
        return filmStatus;
    }

    public void setFilmStatus(int filmStatus) {
        this.filmStatus = filmStatus;
    }

    public int getExpectNum() {
        return expectNum;
    }

    public void setExpectNum(int expectNum) {
        this.expectNum = expectNum;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId +
                ", filmName='" + filmName + '\'' +
                ", filmType=" + filmType +
                ", imgAddress='" + imgAddress + '\'' +
                ", filmScore='" + filmScore + '\'' +
                ", filmPreSaleNum=" + filmPreSaleNum +
                ", boxNum=" + boxNum +
                ", filmSource=" + filmSource +
                ", filmCats='" + filmCats + '\'' +
                ", filmArea=" + filmArea +
                ", filmDate=" + filmDate +
                ", showTime='" + showTime + '\'' +
                ", filmStatus=" + filmStatus +
                ", expectNum=" + expectNum +
                '}';
    }
}
