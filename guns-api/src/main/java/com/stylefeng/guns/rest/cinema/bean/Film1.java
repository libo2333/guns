package com.stylefeng.guns.rest.cinema.bean;

import java.io.Serializable;

public class Film1 implements Serializable {
    private int filmId;
    private String filmName;
    private int filmType;
    private String imgAddress;
    private String actors;
    private String filmCats;
    private String filmLength;
    private MtimeFieldT filmFields;

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

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getFilmCats() {
        return filmCats;
    }

    public void setFilmCats(String filmCats) {
        this.filmCats = filmCats;
    }

    public String getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(String filmLength) {
        this.filmLength = filmLength;
    }

    public MtimeFieldT getFilmFields() {
        return filmFields;
    }

    public void setFilmFields(MtimeFieldT filmFields) {
        this.filmFields = filmFields;
    }

    @Override
    public String toString() {
        return "Film1{" +
                "filmId=" + filmId +
                ", filmName='" + filmName + '\'' +
                ", filmType=" + filmType +
                ", imgAddress='" + imgAddress + '\'' +
                ", actors='" + actors + '\'' +
                ", filmCats='" + filmCats + '\'' +
                ", filmLength='" + filmLength + '\'' +
                ", filmFields=" + filmFields +
                '}';
    }
}
