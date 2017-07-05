package com.nchu.tech.database.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by fujianjian on 2017/7/5.
 */
@Getter
@Setter
public class City extends BaseModel {
    private String cityName;

    private String code;

    private String provinceId;
}
