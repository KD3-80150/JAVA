package com.sunbeam.employee;

public class Manager implements Emp{
	double bs,da;
	
	public Manager(double bs, double da) {
		super();
		this.bs = bs;
		this.da = da;
	}
	
	public Manager() {
		}
	
	public double getsal()
	{
		return bs+da;
	}
	
	public double calInc()
	{
		return bs+(0.2 * bs);
	}
}
