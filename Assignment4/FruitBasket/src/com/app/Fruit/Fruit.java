package com.app.Fruit;

import java.util.Objects;
import java.util.Scanner;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh = true;

	public Fruit() {
		this.color = "";
		this.weight = 0;
		this.name = "Fruit";

	}

	public Fruit(String color, double weight) {
		this.color = color;
		this.weight = weight;
		this.name = "Fruit";
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter color of the fruit: ");
		this.color = sc.next();

		System.out.println("Enter weight: ");
		this.weight = sc.nextDouble();

	}

	public void displayData() {
		System.out.println("Fruit Name: " + this.name);
		System.out.println("Fruit color: " + this.color);
		System.out.println("Weight: " + this.weight);

	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return isFresh == other.isFresh;
	}

	public String taste() {
		return "no specific taste";
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}