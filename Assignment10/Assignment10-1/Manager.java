package com.sunbeam;

public class Manager extends Employee{
	private double bonus;
	
	Manager(){
		bonus = 2500;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public Double calculateSal() {
		//System.out.println("Manager sal = "+ (super.getSal()+this.bonus));
		return super.getSal()+this.bonus;
	}

	@Override
	public String toString() {
		
		return super.toString() + " Manager [ Bonus = " + bonus + "]";
	}
	
	
}
