package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class StudentMain {

	public static void main(String[] args) {
		Student[] arr=new Student[5];
		arr[0]=new Student(15,"Rucha","Dehradun",55.0);
		arr[1]=new Student(2,"Rutuja","Pune",78.0);
		arr[2]=new Student(7,"Samruddhi","Mumbai",67.0);
		arr[3]=new Student(1,"Mughdha","Pune",78.0);
		arr[4]=new Student(10,"Rani","Delhi",45.0);
		System.out.println("Before sort........");
		for( Student ele:arr)
		{
			System.out.println(ele);
		}
		Arrays.sort(arr,new StudentComparator());
		System.out.println("After Sort by student: ");
		for (Student ele : arr)
			System.out.println(ele);
	
		
	}

}