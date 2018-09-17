package com.cash.common.base;

import lombok.Getter;
import lombok.Setter;

/**
 * @program: tms-cloud
 * @description:
 * @author: xiongzy
 * @create: 2018-08-16 16:04
 **/
@Getter
@Setter
public class BasePage<T> {
    int pageNo;
    int pageSize;
    T requestData;
}
