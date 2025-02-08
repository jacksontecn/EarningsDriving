package com.mowtechnologies.earnings_driving.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    private List<Earnings> earningsList;
    @OneToMany
    private List<Expenses> expensesList;

//    public User(String name) {
//        this.name = name;
//    }

    public void addEarnings(Earnings earnings){

    }

    public void addExpenses(Expenses expenses){

    }

    public Double calculateBalance(Date date){
        return null;
    }

}
