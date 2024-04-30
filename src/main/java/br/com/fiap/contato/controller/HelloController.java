package br.com.fiap.contato.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "<h1>Hello, World!</h1>";
    }

    @GetMapping("/ola")
    public String ola(){
        return "Olá, Mundo!";
    }
}
