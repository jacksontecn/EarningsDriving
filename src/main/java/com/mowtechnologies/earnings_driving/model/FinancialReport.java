package com.mowtechnologies.earnings_driving.model;

public class FinancialReport {

    private Long id;
    private String period;
    private Double totalEarnings;
    private Double totalExpenses;

    public FinancialReport(Long id, String period) {
        this.id = id;
        this.period = period;
    }

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
