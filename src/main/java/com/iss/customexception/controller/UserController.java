package com.iss.customexception.controller;

import com.iss.customexception.Exception.ApiRequestException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/getMessage")
    public String getMessage(){
        throw new ApiRequestException("oops cannot get message");
    }

}
