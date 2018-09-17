package com.cash.common.base;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: tms-cloud
 * @description:
 * @author: xiongzy
 * @create: 2018-08-12 18:55
 **/
@Slf4j
public abstract class BaseService<M extends BaseMapper<T>,T> extends ServiceImpl<M,T> {

}
