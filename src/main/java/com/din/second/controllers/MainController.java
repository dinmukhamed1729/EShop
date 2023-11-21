package com.din.second.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "*", maxAge = 3600)
public class MainController {
    @GetMapping()
    public Map<String, String > test(){
        return Map.of("key1","value","key2","value2","key","value3");
    }
}
