package com.cash.common.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @program: tms-cloud
 * @description:
 * @author: xiongzy
 * @create: 2018-08-12 18:21
 **/
@Getter
@Setter
public abstract class BaseModel implements Serializable {


    private static final long serialVersionUID = -3723719264393734515L;


    @TableId(type = IdType.ID_WORKER_STR)
    private String id;
    /**
     *  创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modifyTime;
    /**
     * 创建用户Id
     */
    private String createUser;
    /**
     * 修改用户Id
     */
    private String modifyUser;

    /**
     * 逻辑删除字段
     */
    private Integer flagDelete;

}
