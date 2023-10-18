package com.sunbeam;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	Scanner sc = new Scanner(System.in);
	
//	public void accept() {
//		System.out.println("Enter name = ");
//		name= sc.nextLine();
//		System.out.println("Enter age = ");
//		age = sc.nextInt();
//		
//	}
	
	Person(){
		name = "Something";
		age = 24;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
