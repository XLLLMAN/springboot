package com.spring.springboot.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloBoot {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloBoot(){
        return "hello boot !";
    }
}
