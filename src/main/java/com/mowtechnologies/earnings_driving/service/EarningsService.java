package com.mowtechnologies.earnings_driving.service;

import com.mowtechnologies.earnings_driving.entity.Earnings;
import com.mowtechnologies.earnings_driving.repository.EarningsRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


@Service
public class EarningsService {

    private final EarningsRepository earningsRepository;

    public EarningsService(EarningsRepository earningsRepository) {
        this.earningsRepository = earningsRepository;
    }

    @Transactional
    public Earnings addEarning(Earnings earnings){

        return earningsRepository.save(earnings);
    }




}
