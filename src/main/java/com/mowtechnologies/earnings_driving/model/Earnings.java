package com.mowtechnologies.earnings_driving.model;

import java.util.Date;

public class Earnings {

    private Long id;
    private Double amount;
    private Date date;

    public Earnings(Long id, Double amount, Date date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }
}
