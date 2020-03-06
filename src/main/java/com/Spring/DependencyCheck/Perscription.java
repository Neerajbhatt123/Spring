package com.Spring.DependencyCheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Perscription {

	private int id;
	private String patientName;
	private List<String> medicine;

	@Override
	public String toString() {
		return "Perscription [id=" + id + ", patientName=" + patientName + ", medicine=" + medicine + "]";
	}

	public int getId() {
		return id;
	}

	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}
	
	@Required
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public List<String> getMedicine() {
		return medicine;
	}

	public void setMedicine(List<String> medicine) {
		this.medicine = medicine;
	}

}
