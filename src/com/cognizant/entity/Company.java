package com.cognizant.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8000022426880183637L;
	@Id
	private int companyId;
	private String companyName;
	private long turnover;
	private String ceo;
	private String boardOfDirectors;
	private boolean listedInStockExchanges;
	private String sector;
	private String briefWriteup;
	private String stockCode;
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public long getTurnover() {
		return turnover;
	}
	public void setTurnover(long turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	public boolean isListedInStockExchanges() {
		return listedInStockExchanges;
	}
	public void setListedInStockExchanges(boolean listedInStockExchanges) {
		this.listedInStockExchanges = listedInStockExchanges;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getBriefWriteup() {
		return briefWriteup;
	}
	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", turnover=" + turnover + ", ceo="
				+ ceo + ", boardOfDirectors=" + boardOfDirectors + ", listedInStockExchanges=" + listedInStockExchanges
				+ ", sector=" + sector + ", briefWriteup=" + briefWriteup + ", stockCode=" + stockCode + "]";
	}
	

}
