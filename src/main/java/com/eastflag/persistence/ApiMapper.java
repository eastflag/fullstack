package com.eastflag.persistence;

import com.eastflag.domain.BoardVO;
import com.eastflag.domain.MemberVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by eastf on 2017-01-28.
 */
@Mapper
public interface ApiMapper {

    @Insert({"<script>",
            "INSERT INTO member(id, password, name, created)",
            "VALUES(#{id}, #{password}, #{name}, now())",
            "</script>"})
    int addMember(MemberVO member);

    @Select({"<script>",
            "SELECT member_id, id, name FROM member",
            "WHERE id = #{id} and password = #{password}",
            "</script>"})
    MemberVO login(MemberVO member);

    @ResultMap("resultBoard")
    @Select({"<script>",
            "select B.*, (select count(*) from comment where board_id = B.board_id) as 'comment_count', member.name",
            "from board B inner join member on B.member_id = member.member_id",
            "</script>"})
    List<BoardVO> getBoardList();
}
