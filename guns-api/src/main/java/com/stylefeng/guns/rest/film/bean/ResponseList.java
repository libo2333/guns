package com.stylefeng.guns.rest.film.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseList<T> extends ResponseFault implements Serializable{
    private int status;
    private T date;
}
