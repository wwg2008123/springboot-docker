package com.wwg.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @RequestMapping("/index")
    public String index(){
        return "Hello Docker";
    }
}
