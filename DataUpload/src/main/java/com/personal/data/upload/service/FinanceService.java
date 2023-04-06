package com.personal.data.upload.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.data.upload.loader.ExcelRepository;
import com.personal.data.upload.loader.ItemsRepository;
import com.personal.data.upload.model.Finance;
import com.personal.data.upload.repository.FinanceRepository;

@Service("financeService")
public class FinanceService {
	@Autowired
	private FinanceRepository financeRepository;
	
	public Finance save(Finance finance) {
		return this.financeRepository.save(finance);
	}
	
	public void save(List<Finance> finances) {
		this.financeRepository.saveAll(finances);
	}
}
