package com.procergs.starter.domain;

public class Offer {

	public String procurementNumber;
	public int procurementYear;
	public long idCompany;
	public String coordinator;
	public long id;

	public String getProcurementNumber() {
		return procurementNumber;
	}

	public void setProcurementNumber(String procurementNumber) {
		this.procurementNumber = procurementNumber;
	}

	public int getProcurementYear() {
		return procurementYear;
	}

	public void setProcurementYear(int procurementYear) {
		this.procurementYear = procurementYear;
	}

	public long getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(long idCompany) {
		this.idCompany = idCompany;
	}

	public String getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(String coordinator) {
		this.coordinator = coordinator;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
