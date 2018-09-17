package com.cash.common.message;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @program: tms-cloud
 * @description: 分页返回数据类型
 * @author: xiongzy
 * @create: 2018-08-16 15:57
 **/
@Getter
@Setter
public class PageResponse<T> extends BaseResponse {
    private PageData<T> data;

    public PageResponse(long current, long total, List<T> rows) {
        this.data = new PageData<>(current, total, rows);
    }

    @Getter
    @Setter
    class PageData<TT> {
        private long current;
        private long total;
        private List<TT> rows;

        public PageData(long current, long total, List<TT> rows) {
            this.total = total;
            this.current = current;
            this.rows = rows;
        }

    }
}
