package com.eastflag.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentVO {
    private Integer comment_id;
    private String content;
    private Integer board_id;
    private Integer parent_id;
    private String created;
    private String updated;
    private Integer reply_count;
    private Integer agree_count;
    private Integer disagree_count;

    private MemberVO member;
}
