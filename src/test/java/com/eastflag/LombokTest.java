package com.eastflag;

import com.eastflag.domain.ResultVO;
import org.junit.Test;

/**
 * Created by eastflag on 2017-01-23.
 */
public class LombokTest {
    @Test
    public void ResultTest() {
        ResultVO result = new ResultVO();
        result.setResult(0);
        result.setMsg("hong");
        System.out.println(result);
    }
}
