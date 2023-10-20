package com.sunbeam.employee;

public class labour implements Emp{
	double hrs,rate;

	public labour() {
	
	}
	public labour(double hrs, double rate) {
		super();
		this.hrs = hrs;
		this.rate = rate;
	}
	
	
	public double getsal()
	{
		return hrs*rate;
	}
	
	public double calInc()
	{
		if ( hrs > 360 ) 
		{
			return (0.05 * getsal());
		}
		else 
		{
			return 0.0;
		}
	}


	

}
