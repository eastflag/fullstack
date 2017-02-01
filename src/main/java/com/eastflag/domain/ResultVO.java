package com.eastflag.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by eastflag on 2016-04-25.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVO<T> {
    private int result;
    private String msg;
    private T data;

    public ResultVO(int result, String msg) {
        this.result = result;
        this.msg = msg;
    }
}
