package com.nchu.tech.database.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by fujianjian on 2017/7/5.
 */
@Getter
@Setter
public class BaseModel {

    private String id;

    private Date createDate;

    private Date modifiedDate;

}
