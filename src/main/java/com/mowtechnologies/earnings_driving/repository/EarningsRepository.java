package com.mowtechnologies.earnings_driving.repository;

import com.mowtechnologies.earnings_driving.entity.Earnings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EarningsRepository extends JpaRepository<Earnings, Long> {
}
