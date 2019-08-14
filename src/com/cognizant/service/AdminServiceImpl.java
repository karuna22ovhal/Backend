package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.AdminDao;
import com.cognizant.entity.Company;
import com.cognizant.entity.StockExchange;

@Service
public class  AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	@Override
	public Company save(Company company) {
		
		return adminDao.save(company);
	}


	@Override
	public void deleteBycompanyId(int companyId) {
	
		adminDao.delete(companyId);
		
	}

	@Override
	public StockExchange save(StockExchange stockexchange) {
		return adminDao.save(stockexchange);
	}


	@Override
	public Company findByCompanyId(Company company) {
		
		return adminDao.findByCompanyId(company);
	}




}