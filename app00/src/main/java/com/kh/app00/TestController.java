package com.kh.app00;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class TestController {

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("world")
    public String world(){
        return "world";
    }
}
