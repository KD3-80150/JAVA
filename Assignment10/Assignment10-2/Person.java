package com.sunbeam;

import java.util.Scanner;

public class Person implements Displayable{
		private String name;
		private int age;
		Scanner scanner = new Scanner(System.in);
		
//		public void accept() {
//			System.out.println("Enter name = ");
//			name= sc.nextLine();
//			System.out.println("Enter age = ");
//			age = sc.nextInt();
//			
//		}
		
//		Person(){
//			name = "Something";
//			age = 24;
//		}

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
		
		public void acceptData() {
			System.out.println("Enter name = ");
			name = scanner.nextLine();
			
			System.out.println("Enter age = ");
			age = scanner.nextInt();
			
		}

		@Override
		public void displayData() {
			System.out.println("[ name : "+ this.name +" age : "+ this.age +" ]");
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
		
		

		
}
