package com.example.cicdspringbootdemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {


    @GetMapping("/welcome")
    public String getMessage(){
        return "welcome to spring boot course with cicd";
    }
}
