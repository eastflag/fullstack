package com.eastflag.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BoardVO {
    private Integer board_id;
    private Integer member_id;
    private String title;
    private String content;
    private String created;
    private String updated;

    private MemberVO member; //foreign_key 매핑 정보
    private Integer comment_count; //게시판글에 달린 댓글수
}
