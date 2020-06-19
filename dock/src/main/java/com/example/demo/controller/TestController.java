package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doo")
public class TestController {

    @RequestMapping(value = "/docker/{msg}", method = RequestMethod.GET)
    public String docker(@PathVariable("msg") String msg){
        System.out.println(msg);
        return msg;
    }
}
