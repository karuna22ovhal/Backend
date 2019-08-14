package com.cognizant.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.Company;
import com.cognizant.entity.StockExchange;
@Repository
public interface AdminDao extends CrudRepository<Company, Serializable> {

	Company findByCompanyId(Company company);
	
	StockExchange save(StockExchange stockexchange);

	void deleteBycompanyId(int companyId);

}	

