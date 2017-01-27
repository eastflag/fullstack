package com.eastflag.persistence;

import com.eastflag.domain.MemberVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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
            "SELECT count(*) FROM member",
            "WHERE id = #{id} and password = #{password}",
            "</script>"})
    int login(MemberVO member);
}
