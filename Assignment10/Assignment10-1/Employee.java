package com.sunbeam;

import java.util.Scanner;

public abstract class Employee extends Person{
	Scanner scanner = new Scanner(System.in);
	private int id;
	private double sal;
	
	Employee(){
		id = 123;
		sal = 10000;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public abstract Double calculateSal();

//	public void accept() {
//		System.out.println("Enter id = ");
//		id = scanner.nextInt();
//		System.out.println("Enter sal = ");
//		sal = scanner.nextDouble();
//	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", sal=" + sal + "]";
	}

}
