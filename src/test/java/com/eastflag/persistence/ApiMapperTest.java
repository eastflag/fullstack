package com.eastflag.persistence;

import com.eastflag.domain.MemberVO;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by eastf on 2017-01-28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiMapperTest {
    @Autowired
    private ApiMapper mapper;

    @Ignore
    @Test
    public void addMember() {
        MemberVO member = new MemberVO();
        member.setId("aaa");
        member.setPassword("1234");
        member.setName("ccc");
        int count = mapper.addMember(member);
        assertThat(count).isEqualTo(1);
    }

    @Test
    public void login() {
        MemberVO member = new MemberVO();
        member.setId("aaa");
        member.setPassword("1234");

        MemberVO loginMember = mapper.login(member);
        assertThat(loginMember).isNotNull();
    }
}
