package com.sunbeam.employee;

public class EmployeeMain {
	public static void main(String []args) {
	
	Emp[] employees = new Emp[3];
	
	employees[0] = new Manager(5000,2000);
	employees[1] = new Clerk(350);
	employees[2] = new labour(20,2000);
	
	double total = Emp.calTotalInc(employees);
	System.out.println(total);
	}

}
