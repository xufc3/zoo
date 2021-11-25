package com.light.security.com.light.security.biz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneController {
    @GetMapping("/phones/{id:\\d+}")
    public  String getPhone(@PathVariable("id") String phoneId){
        return phoneId;

    }
}
