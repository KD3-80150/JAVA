import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class LenghtString2 {

	public static int countIf(String[] arr, Predicate<String> cond) {
		int count = 0;
		for (String str : arr) {
			if (cond.test(str))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String[] arr = { "Nilesh", "Shubham", "Pratik", "Omkar", "Prashant" };

		
		// }// call countIf() to count number of strings have length more than 6 --
		// using
		// anonymous inner class
		for (String str : arr) 
		{
		System.out.println(str);	
		}

		int count = countIf(arr, k -> k.length() >6);

		 int cnt = countIf(arr, new Predicate<String>() {
		 public boolean test(String s) {
		 return s.length() > 6;
		 }
		 });
		 System.out.println("Result: " + cnt); 
		 // 2
			// call countIf() to count number of strings have length more than 6 -- using
			// lambda expressions
		
		
		Predicate<String> countLength = s -> s.length() > 6;
		int count1 = countIf(arr, countLength);
		System.out.println("Count of names having Lenght of name >6 = " + count1);
		

	}

}
