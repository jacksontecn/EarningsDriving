package com.mowtechnologies.earnings_driving.repository;

import com.mowtechnologies.earnings_driving.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
