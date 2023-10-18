package com.sunbeam;

public class Test {
	public static void printableDisplayableBox(Box<? extends Displayable> b) {
		b.get().displayData();
	}
	
	public static void printBox(Box<?>b) {
		b.get().displayData();
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.acceptData();
		Box<Person> b1 = new Box<>();
		b1.set(p);
		System.out.println(b1.get());
		
		System.out.println("-------------------------------");
		
		Date d = new Date();
		d.acceptData();
		Box<Date> b2 = new Box<>();
		b2.set(d);
		System.out.println(b2.get());
		
		System.out.println("-------------------------------");
		
		printBox(b2);
		printBox(b1);
		
	}
}
