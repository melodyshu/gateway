package com.example.consumerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name){
        return "hello,"+name;
    }
}
