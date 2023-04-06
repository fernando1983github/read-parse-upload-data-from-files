package com.personal.data.upload.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.data.upload.model.Finance;

public interface FinanceRepository extends JpaRepository<Finance, Long> {

}
