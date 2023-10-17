package com.sunbeam.company;

public class HourlyEmployee extends Employee {
	private double hourlyRate;
	private int hrs;

	public HourlyEmployee() {

	}

	public HourlyEmployee(int hrs, int hourlyRate) {
		this.hrs = hrs;
		this.hourlyRate = hourlyRate;

	}

	public double CalculateSalary() {
		if (this.hrs > 40) {
			this.hourlyRate += (this.hrs - 40) * 1.5 * hourlyRate;
		}

		return this.hourlyRate * (this.hrs);

	}
}