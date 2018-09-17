package com.cash.business.service;

import com.cash.business.entity.HomePageModule;
import com.cash.business.mapper.HomePageModuleMapper;
import com.cash.common.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: tms-cloud
 * @description:
 * @author: xiongzy
 * @create: 2018-08-14 17:39
 **/
@Service
public class HomePageModuleService extends BaseService<HomePageModuleMapper, HomePageModule> {

    @Autowired
    private HomePageModuleMapper homePageModuleMapper;




}
