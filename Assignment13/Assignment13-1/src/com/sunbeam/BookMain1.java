package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BookMain1 {

	public static void main(String[] args) {
		Set<Book1> set = new HashSet<Book1>();
		//Set<Book1> set =new HashSet<Book1>();
		//Book b1 = new Book();
		set.add(new Book1("aa","Yugandhar","Shivaji Sawant",2,150));
		set.add(new Book1("ab","Yayti","VSKhandekar",4,200));
		set.add(new Book1("dd","Shriman Yogi","Ranjit Desai",1,500));
		set.add(new Book1("sd","Shyamchi Aai","Sane Guruji",5,250));
		set.add(new Book1("dd","Rau","NSInamdar",2,350));

		Iterator<Book1> itr = set.iterator();
		while(itr.hasNext()) {
			Book1 e = itr.next();
			System.out.println(e);
		}
		//System.out.println();
	}

}
