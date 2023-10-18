package com.sunbeam;

import java.util.Comparator;

public class StudentComparator  implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		 
			int differ=-s1.getCity().compareTo(s2.getCity());
			if(differ==0)
				differ=-Double.compare(s1.getMarks(), s2.getMarks());
			if(differ==0)
				differ=s1.getName().compareTo(s2.getName());
			return differ;
		
	
	}

}