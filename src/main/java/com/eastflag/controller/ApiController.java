package com.eastflag.controller;

import com.eastflag.domain.MemberVO;
import com.eastflag.domain.ResultVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by eastflag on 2017-01-26.
 */
@RestController
public class ApiController {
    @RequestMapping("/api/addMember")
    public ResultVO addMember(MemberVO member) {
        return new ResultVO(0, "success");
    }
}
