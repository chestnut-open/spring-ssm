package com.bao.controller;

import com.bao.entity.User;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/v1")
@RestController
public class LoginController {


    @RequestMapping("/register")
    public String register(){
        return "hh";

    }
}
