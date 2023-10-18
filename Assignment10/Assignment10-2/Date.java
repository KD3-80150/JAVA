package com.sunbeam;

import java.util.Scanner;

public class Date implements Displayable {
		int day;
		int month;
		int year;
		
		Scanner scanner = new Scanner(System.in);
		
		public void acceptData() {
			System.out.println("Enter day = ");
			day = scanner.nextInt();
			
			System.out.println("Enter month = ");
			month = scanner.nextInt();
			
			System.out.println("Enter year = ");
			year = scanner.nextInt();
			
		}
		
		@Override
		public void displayData() {
			System.out.println("[ Date = "+ this.day + ":" + this.month + ":" + this.year + "]");
		}

		@Override
		public String toString() {
			return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
		}
		
		
}
