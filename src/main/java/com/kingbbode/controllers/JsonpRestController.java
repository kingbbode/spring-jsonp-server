package com.kingbbode.controllers;

import com.kingbbode.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YG-MAC on 2016. 12. 18..
 */
@RestController
public class JsonpRestController {


    @GetMapping("")
    public User test(){
        return new User("test",20);
    }
}
