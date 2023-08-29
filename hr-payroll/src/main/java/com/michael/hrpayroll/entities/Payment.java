package com.michael.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double income;
	private Integer days;	
	
	public Payment() {
	}

	public Payment(String name, Double income, Integer days) {
		super();
		this.name = name;
		this.income = income;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}
	
	public double getTotal() {
		return days * income;
	}

}
