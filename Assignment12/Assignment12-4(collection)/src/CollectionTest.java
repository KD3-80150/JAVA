import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Collection<String> c = new ArrayList<>(); 		//[B, D, A, C, null, null, null]
		// Collection<String> c = new HashSet<>(); 			//[null, A, B, C, D]
		// Collection<String> c = new LinkedHashSet<>(); 	//[B, D, A, C, null]
		// Collection<String> c = new TreeSet<>();		 	//java.lang.NullPointerException
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());
	}

}
