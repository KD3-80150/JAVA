package com.app.Fruit;

public class Apple extends Fruit {

	public Apple() {
		super();
		
	}

	public Apple(String color, double weight) {
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
		
		return "sweet and sour";
	}
	

}