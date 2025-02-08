package com.mowtechnologies.earnings_driving.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping
    public String testar(){
        return "Teste aprovado com sucesso, será mesmo, dinovo?!!!";
    }

}
