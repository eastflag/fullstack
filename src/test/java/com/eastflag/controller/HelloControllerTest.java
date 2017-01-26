package com.eastflag.controller;

import com.eastflag.domain.ResultVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void helloTest() {
        String body = this.restTemplate.getForObject("/hello", String.class);
        System.out.println(body);
        assertThat(body).isNotEmpty();
    }

    @Test
    public void helloTest2() {
        ResponseEntity<String> res = this.restTemplate.getForEntity("/hello", String.class);
        System.out.println(res.toString());
        assertThat(res.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    public void hello4Test() {
        MultiValueMap<String, String> map= new LinkedMultiValueMap<>();
        map.add("name", "hong kil dong");
        ResponseEntity<String> res = this.restTemplate.postForEntity("/hello4", map, String.class);
        System.out.println(res.getBody());
        assertThat(res.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    public void hello6Test() {
        ResultVO request = new ResultVO(0, "test success");

        ResponseEntity<String> res = this.restTemplate.postForEntity("/hello6", request, String.class);
        System.out.println(res.getBody());
        assertThat(res.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
