package com.cash.common.base;

import com.cash.common.message.DataResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * @program: tms-cloud
 * @description:
 * @author: xiongzy
 * @create: 2018-08-12 18:58
 **/
@Slf4j
public abstract class BaseController<Bs extends BaseService, M extends BaseModel> {

    @Autowired
    protected Bs baseService;

    @PostMapping
    public DataResponse<M> add(@RequestBody M entity){
        entity.setCreateTime(LocalDateTime.now());
        entity.setModifyTime(LocalDateTime.now());
        baseService.insert(entity);
        return new DataResponse<>();
    }
    @GetMapping("/{id}")
    public DataResponse<M> get(@PathVariable String id){
        Object o = baseService.selectById(id);
        DataResponse<M> objectResponse = new DataResponse<>();
        if (o!=null){
            objectResponse.setData((M) o);

        }
        return objectResponse;
    }

    @PutMapping
    public DataResponse<M> update(M entity){
        entity.setModifyTime(LocalDateTime.now());
        baseService.updateById(entity);
        return new DataResponse<>();
    }
}
