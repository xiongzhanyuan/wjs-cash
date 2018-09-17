package com.cash.common.message;

import com.cash.common.constant.CommonConstants;
import lombok.Getter;
import lombok.Setter;

/**
 * @program: tms-cloud
 * @description: 返回数据类型
 * @author: xiongzy
 * @create: 2018-08-12 18:06
 **/
@Getter
@Setter
public class DataResponse<T> extends BaseResponse {

    private T data;

    public DataResponse(CommonConstants.ResponseStatus status, String message, T data) {
        super(status, message);
        this.data = data;
    }

    public DataResponse(String message, T data) {
        super(message);
        this.data = data;
    }

    public DataResponse(T data) {
        this.data = data;
    }

    public DataResponse() {

    }
}
