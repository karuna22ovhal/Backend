package com.cognizant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sector")
public class Sector {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int SectorId;
	private String SectorName;
	private String Brief;
	public int getSectorId() {
		return SectorId;
	}
	public void setSectorId(int sectorId) {
		SectorId = sectorId;
	}
	public String getSectorName() {
		return SectorName;
	}
	public void setSectorName(String sectorName) {
		SectorName = sectorName;
	}
	public String getBrief() {
		return Brief;
	}
	public void setBrief(String brief) {
		Brief = brief;
	}
	@Override
	public String toString() {
		return "Sector [SectorId=" + SectorId + ", SectorName=" + SectorName + ", Brief=" + Brief + "]";
	}

}
