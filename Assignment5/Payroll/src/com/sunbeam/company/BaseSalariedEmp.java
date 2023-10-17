package com.sunbeam.company;

public class BaseSalariedEmp extends CommissionEmployee {
	private double baseSalary;

	public BaseSalariedEmp(int i) {

	}

	public BaseSalariedEmp(int sales, double percentage, double baseSalary) {

		super(sales, percentage);
		this.baseSalary = baseSalary;

	}

	public double CalculateSalary() {
		return super.CalculateSalary() + this.baseSalary * 1.10;
	}
}