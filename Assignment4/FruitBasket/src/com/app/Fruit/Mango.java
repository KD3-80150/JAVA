package com.app.Fruit;

public class Mango extends Fruit {

	public Mango() {
		super();
		
	}

	public Mango(String color, double weight) {
		super(color, weight);
		
	}
	
	@Override
	public void acceptData() {
		super.acceptData();
	}
	
	@Override
	public void displayData() {
		super.displayData();
	}
	
	@Override
	public String taste() {
		
		return "sweet";
	}
	

}