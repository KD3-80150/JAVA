//package com.sunbeam;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class BookMain3 {

	public static void main(String[] args) {
		Set<Book3> set =new TreeSet<Book3>();
		  
		//Book b1 = new Book();
		set.add(new Book3("aa","Yugandhar","Shivaji Sawant",2,150));
		set.add(new Book3("ab","Yayti","VSKhandekar",4,200));
		set.add(new Book3("dd","Shriman Yogi","Ranjit Desai",1,500));
		set.add(new Book3("sd","Shyamchi Aai","Sane Guruji",5,250));
		set.add(new Book3("dd","Rau","NSInamdar",2,350));

		Iterator<Book3> itr = set.iterator();
		while(itr.hasNext()) {
			Book3 e = itr.next();
			System.out.println(e);
		}
		//System.out.println();

	}

}



