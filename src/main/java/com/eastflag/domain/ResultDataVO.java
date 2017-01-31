package com.eastflag.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by eastflag on 2017-02-01.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultDataVO<T> extends ResultVO {
    private T data;

    public ResultDataVO(int result, String msg, T data) {
        this.result = result;
        this.msg = msg;
        this.data = data;
    }
}
