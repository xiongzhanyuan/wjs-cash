package com.cash.business.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cash.business.entity.HomePageModule;
import com.cash.business.service.HomePageModuleService;
import com.cash.common.base.BaseController;
import com.cash.common.base.BasePage;
import com.cash.common.message.BaseResponse;
import com.cash.common.message.PageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HomePageModuleController extends BaseController<HomePageModuleService, HomePageModule> {

    @Autowired
    private HomePageModuleService homePageModuleService;

    @PostMapping("/fetchList")
    public BaseResponse getLoanInfo(@RequestBody BasePage<HomePageModule> homePageModuleBasePage){

        HomePageModule homePageModule = homePageModuleBasePage.getRequestData();

        IPage requestPage = new Page(homePageModuleBasePage.getPageNo(), homePageModuleBasePage.getPageSize());

        IPage resultPage = homePageModuleService.selectPage(requestPage, new QueryWrapper<HomePageModule>().lambda()
                .like(HomePageModule::getName, homePageModule.getName()).orderByAsc(HomePageModule :: getSort));


        return new PageResponse<HomePageModule>(resultPage.getCurrent(), requestPage.getTotal(), requestPage.getRecords());
    }


}
