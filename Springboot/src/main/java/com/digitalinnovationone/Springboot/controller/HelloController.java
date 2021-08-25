package com.digitalinnovationone.Springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloMessage(){
        return"Hello, Digital Innovation One!";
    }

    @GetMapping("/teste")
    public String helloMessage1(){
        int a = 10;
        int b = 100;

        int c = a+b;
        int total = ((((c*b)*c)/a)/b)+c;


        return"Testando Mapeamento: "+total;
    }
}
