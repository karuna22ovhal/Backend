package com.cognizant.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stockexchange")
public class StockExchange implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7134039887712974277L;
	@Id
	private int companyId;
	private String stockExchange;
	private String brief;
	private String contactAddress;
	private String remarks;
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "StockExchange [companyId=" + companyId + ", stockExchange=" + stockExchange + ", brief=" + brief
				+ ", contactAddress=" + contactAddress + ", remarks=" + remarks + "]";
	}
	
}
