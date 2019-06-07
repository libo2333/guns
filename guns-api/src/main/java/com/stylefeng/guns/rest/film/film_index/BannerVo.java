package com.stylefeng.guns.rest.film.film_index;

import lombok.Data;

import java.io.Serializable;

@Data
public class BannerVo implements Serializable {
    private String bannerId;
    private String bannerAddress;
    private String bannerUrl;
}
