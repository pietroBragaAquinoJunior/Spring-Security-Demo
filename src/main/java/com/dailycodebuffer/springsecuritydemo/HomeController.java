package com.dailycodebuffer.springsecuritydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping()
    public String home(){
        return "this is home page";
    }

    @GetMapping("user")
    public String user(){
        return "this is user page";
    }

    @GetMapping("admin")
    public String admin(){
        return "this is admin page";
    }

}
