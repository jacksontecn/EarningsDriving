package com.mowtechnologies.earnings_driving.controller;

import com.mowtechnologies.earnings_driving.entity.Earnings;
import com.mowtechnologies.earnings_driving.service.EarningsService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ganhos")
public class EarningsController {

    private final EarningsService earningsService;

    public EarningsController(EarningsService earningsService) {
        this.earningsService = earningsService;
    }

    @PostMapping("/adicionar")
    public Earnings adicionar(@Valid @RequestBody Earnings earnings){

        return earningsService.addEarning(earnings);
    }


}
