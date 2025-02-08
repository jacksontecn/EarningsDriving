package com.mowtechnologies.earnings_driving.repository;

import com.mowtechnologies.earnings_driving.entity.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesRepository extends JpaRepository<Expenses, Long> {
}
