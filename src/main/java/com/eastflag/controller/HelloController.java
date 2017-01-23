package com.eastflag.controller;

import com.eastflag.domain.ResultVO;
import org.springframework.web.bind.annotation.*;

/**
 * Created by eastflag on 2017-01-23.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello test";
    }

    @RequestMapping(method= RequestMethod.GET, value="/hello2")
    public String hello2() {
        return "Hello GET test";
    }

    @RequestMapping(method= RequestMethod.GET, value="/hello3")
    public String hello3(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @RequestMapping(method= RequestMethod.POST, value="/hello4")
    public String hello4(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @RequestMapping(method= {RequestMethod.POST}, value="/hello5")
    public ResultVO hello5(@RequestParam("name") String name) {
        ResultVO result = new ResultVO();
        result.setResult(0);
        result.setMsg(name);
        return result;
    }

    @RequestMapping(method= {RequestMethod.POST}, value="/hello6")
    public ResultVO hello6(@RequestBody ResultVO result) {
        return result;
    }

}
