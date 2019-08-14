package com.cognizant.service;

import com.cognizant.entity.Company;
import com.cognizant.entity.StockExchange;

public interface AdminService {
	Company save(Company company);
	void deleteBycompanyId(int companyId);
	StockExchange save(StockExchange stockexchange);

	Company findByCompanyId(Company company);
}
