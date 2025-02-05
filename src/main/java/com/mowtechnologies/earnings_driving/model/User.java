package com.mowtechnologies.earnings_driving.model;

import java.util.Date;
import java.util.List;

public class User {

    private Long id;
    private String name;
    private List<Earnings> earningsList;
    private List<Expenses> expensesList;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addEarnings(Earnings earnings){

    }

    public void addExpenses(Expenses expenses){

    }

    public Double calculateBalance(Date date){
        return null;
    }

}
