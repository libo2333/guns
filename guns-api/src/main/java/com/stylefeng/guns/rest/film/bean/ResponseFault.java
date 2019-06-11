package com.stylefeng.guns.rest.film.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseFault implements Serializable {
    private String msg;
    private int status;
}
