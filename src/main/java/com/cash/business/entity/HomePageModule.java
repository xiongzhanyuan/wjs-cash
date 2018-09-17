package com.cash.business.entity;

import com.cash.common.base.BaseModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class HomePageModule extends BaseModel implements Serializable {

    private String name;

    private String icon;

    private String imageUrl;

    private Integer sort;

    private String content;

    private String subject;

}