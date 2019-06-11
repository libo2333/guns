package com.stylefeng.guns.rest.film.bean.film_info;

import lombok.Data;

import java.io.Serializable;

@Data
public class Actors implements Serializable {
    String imgAddress;
    String directorName;
    String roleName;
}
