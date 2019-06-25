package com.ming.cloud.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 2019-06-25
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("")

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
