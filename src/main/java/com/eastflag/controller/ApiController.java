package com.eastflag.controller;

import com.eastflag.domain.MemberVO;
import com.eastflag.domain.ResultVO;
import com.eastflag.persistence.ApiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by eastflag on 2017-01-26.
 */
@RestController
public class ApiController {
    @Autowired
    private ApiMapper mapper;

    @RequestMapping("/api/addMember")
    public ResultVO addMember(@RequestBody MemberVO member) {
        System.out.println(member);
        int count = mapper.addMember(member);
        if (count > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "fail");
        }
    }

    @RequestMapping("/api/login")
    public ResultVO login(@RequestBody MemberVO member) {
        int count = mapper.login(member);
        if (count > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "fail");
        }
    }
}
