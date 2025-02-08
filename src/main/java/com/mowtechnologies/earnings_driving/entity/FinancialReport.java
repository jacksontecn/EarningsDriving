package com.mowtechnologies.earnings_driving.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class FinancialReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String period;
    private Double totalEarnings;
    private Double totalExpenses;


    public Double calculateWeeklyEarnings(){
        return null;
    }

    public Double calculateMonthlyEarnings(){
        return null;
    }

    public Double calculateAnnualEarnings(){
        return null;
    }

    public void generateReport(User user){

    }

}
