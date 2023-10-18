package com.sunbeam;

public class Salesman extends Employee{
	private double comm;
	
	public Salesman(){
		comm = 0.7;
	}
	
	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	@Override
	public Double calculateSal() {
		//System.out.println("Salesman sal = "+(super.getSal()*this.comm));
		return super.getSal()*this.comm;
	}

	@Override
	public String toString() {
		return super.toString() + " Salesman [ commision = " + this.comm + " ] ";
	}
	
	
}
