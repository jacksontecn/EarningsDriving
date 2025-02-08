package com.mowtechnologies.earnings_driving.repository;

import com.mowtechnologies.earnings_driving.entity.FinancialReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialReportRepository extends JpaRepository<FinancialReport, Long> {
}
