package com.procergs.starter.domain;

public class Offer {

	public String procurementNumber;
	public Integer procurementYear;
	public Long idCompany;
	public String coordinator;
	public Long id;

	public String getProcurementNumber() {
		return procurementNumber;
	}

	public void setProcurementNumber(String procurementNumber) {
		this.procurementNumber = procurementNumber;
	}

	public Integer getProcurementYear() {
		return procurementYear;
	}

	public void setProcurementYear(Integer procurementYear) {
		this.procurementYear = procurementYear;
	}

	public Long getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(Long idCompany) {
		this.idCompany = idCompany;
	}

	public String getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(String coordinator) {
		this.coordinator = coordinator;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
