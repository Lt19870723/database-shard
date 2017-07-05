package com.nchu.tech.database.mapper;

import com.nchu.tech.database.model.City;

/**
 * Created by fujianjian on 2017/7/5.
 */
public interface CityMapper {

    City findById(String id);

    int save(City city);
}
