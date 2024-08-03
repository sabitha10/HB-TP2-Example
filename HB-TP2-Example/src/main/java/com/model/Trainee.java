package com.model;

import jakarta.persistence.*;
@Entity
@Table(name="Trainee")
@AttributeOverrides({
@AttributeOverride(name="id",column=@Column(name="id")),
@AttributeOverride(name="name",column=@Column(name="name"))
})
public class Trainee extends Employee{
	float payperhour;
	String contractperiod;
	public Trainee(String name, float payperhour, String contractperiod) {
		super(name);
		this.payperhour = payperhour;
		this.contractperiod = contractperiod;
	}
	public float getPayperhour() {
		return payperhour;
	}


	public void setPayperhour(float payperhour) {
		this.payperhour = payperhour;
	}


	public String getContractperiod() {
		return contractperiod;
	}


	public void setContractperiod(String contractperiod) {
		this.contractperiod = contractperiod;
	}


	

}