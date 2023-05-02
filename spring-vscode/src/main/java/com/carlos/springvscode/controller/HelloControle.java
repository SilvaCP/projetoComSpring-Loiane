package com.carlos.springvscode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloControle {

    @GetMapping(value="/")
    public String getMethodName() {
        return "Olá Mundo VSCode!";
    }
    

    
}
