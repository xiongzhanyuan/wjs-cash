package com.cash.common.message;

import com.cash.common.constant.CommonConstants;
import lombok.Getter;
import lombok.Setter;

/**
 * @program: tms-cloud
 * @description: 返回通用部分
 * @author: xiongzy
 * @create: 2018-08-09 11:36
 **/
@Getter
@Setter
public class BaseResponse {

    private CommonConstants.ResponseStatus status = CommonConstants.ResponseStatus.SUCCESS;
    private String message ="SUCCESS";

    public BaseResponse(CommonConstants.ResponseStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public BaseResponse(String message) {
        this.message = message;
    }

    public BaseResponse() {
    }
}
