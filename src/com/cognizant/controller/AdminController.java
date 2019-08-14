package com.cognizant.controller;

import java.util.Date;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entity.Company;
import com.cognizant.entity.StockExchange;
import com.cognizant.entity.User;

import com.cognizant.service.AdminService;
import com.cognizant.service.UserService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@CrossOrigin(origins = "http://localhost", maxAge = 3600)
@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	UserService userService;
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value = "/Authorization", method = RequestMethod.POST)
	public String login(@RequestBody User login) throws ServletException {

		String jwtToken = "";
		if (login.getUsername() == null || login.getPassword() == null) {
			throw new ServletException("Please fill in username and password");
		}

		String username = login.getUsername();
		String password = login.getPassword();
		
		User user = userService.findUser(username, password);
		String usertype=user.getUsertype();
		if (user == null) 
		{
			throw new ServletException("Username not found");
		}

		String pwd = user.getPassword();

		if (!password.equals(pwd)) {
			throw new ServletException("Invalid login. Please check your username and password.");
		}
		if(usertype.equalsIgnoreCase("admin"))
		{
		jwtToken = Jwts.builder().setSubject(username).claim("roles", "user")
				.signWith(SignatureAlgorithm.HS256, "secretkey").compact();
		}
		else
		{
			throw new ServletException("No an Admin");
		}
		return jwtToken;
		
	}
	
	@RequestMapping(value = "/add/company", method = RequestMethod.POST)
	public Company addCompany(@RequestBody Company company) {
		return adminService.save(company);
	}
	
	@RequestMapping(value = "/update/company/details", method = RequestMethod.POST)
	public Company updateCompanyDetails(@RequestBody Company company) {
		return adminService.save(company);
	}
	
	@RequestMapping(value = "/edit/company/database/delete", method = RequestMethod.POST)
	public String deleteCompany(@RequestParam int companyId) {
		adminService.deleteBycompanyId(companyId);
		return "Company Deleted";
	}
	
	@RequestMapping(value = "/add/stockexchange", method = RequestMethod.POST)
	public StockExchange addstockexchange(@RequestBody StockExchange stockexchange) {
		return adminService.save(stockexchange);
	}
	
	@RequestMapping(value = "/update/stockexchang/details", method = RequestMethod.POST)
	public StockExchange updatestockexchange(@RequestBody StockExchange stockexchange) {
		return adminService.save(stockexchange);
	}
	
	@RequestMapping(value = "/company/database/search", method = RequestMethod.POST)
	public Company searchCompany(@RequestBody Company company) {		
		return adminService.findByCompanyId(company);
	}
	

}
