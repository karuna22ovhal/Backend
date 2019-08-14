package com.cognizant.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stockprice")
public class StockPrice implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CompanyCode;
	private String StockExchange;
	private long CurrentPrice;
	private Date Date;
	private Time Time;
	public int getCompanyCode() {
		return CompanyCode;
	}
	public void setCompanyCode(int companyCode) {
		CompanyCode = companyCode;
	}
	public String getStockExchange() {
		return StockExchange;
	}
	public void setStockExchange(String stockExchange) {
		StockExchange = stockExchange;
	}
	public long getCurrentPrice() {
		return CurrentPrice;
	}
	public void setCurrentPrice(long currentPrice) {
		CurrentPrice = currentPrice;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public Time getTime() {
		return Time;
	}
	public void setTime(Time time) {
		Time = time;
	}
	@Override
	public String toString() {
		return "StockPrice [CompanyCode=" + CompanyCode + ", StockExchange=" + StockExchange + ", CurrentPrice="
				+ CurrentPrice + ", Date=" + Date + ", Time=" + Time + "]";
	}

	

}
