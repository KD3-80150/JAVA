import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BookMain4 {

	public static void main(String[] args) {
		
		
		TreeSet<Book4> set =new TreeSet<Book4>();
		//Book b1 = new Book();
		set.add(new Book4("aa","Yugandhar","Shivaji Sawant",2,150));
		set.add(new Book4("ab","Yayti","VSKhandekar",4,200));
		set.add(new Book4("dd","Shriman Yogi","Ranjit Desai",1,500));
		set.add(new Book4("sd","Shyamchi Aai","Sane Guruji",5,250));
		set.add(new Book4("dd","Rau","NSInamdar",2,350));

		System.out.println("Display all books in Forward Order......");
		Iterator<Book4> itr = set.iterator();
		while (itr.hasNext()) {
			Book4 b = itr.next();
			System.out.println(b);
		}
		System.out.println("-------------------------------------------------------\n");
		System.out.println("Display all books in Reverse Order......");
		Iterator<Book4> itr1 = set.descendingIterator();
		while (itr1.hasNext()) {
			Book4 str = itr1.next();
			System.out.println(str);
		}		
	}

}



