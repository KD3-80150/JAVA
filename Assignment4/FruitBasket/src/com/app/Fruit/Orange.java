package com.app.Fruit;

public class Orange extends Fruit {

	public Orange() {
		super();
		
	}

	public Orange(String color, double weight) {
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
		return "sour";
	}

}