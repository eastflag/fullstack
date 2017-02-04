package com.eastflag.controller;

import com.eastflag.domain.BoardVO;
import com.eastflag.domain.MemberVO;
import com.eastflag.domain.ResultVO;
import com.eastflag.persistence.ApiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        MemberVO loginMember = mapper.login(member);
        if (loginMember != null) {
            return new ResultVO(0, "success", loginMember);
        } else {
            return new ResultVO(100, "fail");
        }
    }

    @RequestMapping("/api/getBoardList")
    public List<BoardVO> getBoardList() {
        return mapper.getBoardList();
    }

    @RequestMapping("/api/getBoard")
    public BoardVO getBoard(@RequestParam("board_id") int board_id) {
        return mapper.getBoard(board_id);
    }
}
