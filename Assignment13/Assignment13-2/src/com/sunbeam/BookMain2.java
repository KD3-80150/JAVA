package com.sunbeam;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class BookMain2 {

	public static void main(String[] args) {
		Set<Book2> set =new LinkedHashSet<Book2>();
		  
		//Book b1 = new Book();
		set.add(new Book2("aa","Yugandhar","Shivaji Sawant",2,150));
		set.add(new Book2("ab","Yayti","VSKhandekar",4,200));
		set.add(new Book2("dd","Shriman Yogi","Ranjit Desai",1,500));
		set.add(new Book2("sd","Shyamchi Aai","Sane Guruji",5,250));
		set.add(new Book2("dd","Rau","NSInamdar",2,350));

		Iterator<Book2> itr = set.iterator();
		while(itr.hasNext()) {
			Book2 e = itr.next();
			System.out.println(e);
		}
		//System.out.println();

	}

}



