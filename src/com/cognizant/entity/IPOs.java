package com.cognizant.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ipos")
public class IPOs implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int IPOid;
	private String CompanyName;
	private String StockExchange;
	private long PricePerShare;
	private int TotalNumberOfShares;
	private String Remark;
	public int getIPOid() {
		return IPOid;
	}
	public void setIPOid(int iPOid) {
		IPOid = iPOid;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getStockExchange() {
		return StockExchange;
	}
	public void setStockExchange(String stockExchange) {
		StockExchange = stockExchange;
	}
	public long getPricePerShare() {
		return PricePerShare;
	}
	public void setPricePerShare(long pricePerShare) {
		PricePerShare = pricePerShare;
	}
	public int getTotalNumberOfShares() {
		return TotalNumberOfShares;
	}
	public void setTotalNumberOfShares(int totalNumberOfShares) {
		TotalNumberOfShares = totalNumberOfShares;
	}
	public String getRemark() {
		return Remark;
	}
	@Override
	public String toString() {
		return "IPOs [IPOid=" + IPOid + ", CompanyName=" + CompanyName + ", StockExchange=" + StockExchange
				+ ", PricePerShare=" + PricePerShare + ", TotalNumberOfShares=" + TotalNumberOfShares + ", Remark="
				+ Remark + "]";
	}
	public void setRemark(String remark) {
		Remark = remark;
	}

}
