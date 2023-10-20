package com.sunbeam.employee;

//import com.sunbeam.employee.Employee.Emp;

public interface Emp {
	
	public double getsal();

	default public double calInc() {
		return 0.0;
	}

	static double calTotalInc(Emp[] arr) 
	{
		double income = 0.0;
		for(Emp e : arr)
		{
			income += e.getsal() + e.calInc();
							
		}
		return income;
	}

}
