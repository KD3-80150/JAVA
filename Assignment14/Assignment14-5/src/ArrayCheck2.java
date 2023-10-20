
public class ArrayCheck2 {

	interface Check<T>
	{
		boolean compare(T a, T b);
	}
		static <T> int countIf( T[] arr, T key, Check <T> c ) 
		{
			int count = 0;
			for (T ele : arr) 
			{
				if(c.compare (ele,key) )
					count++;
			}
			return count;
		}

	public static void main(String[] args) {


		Integer [] arr = {44, 77, 99, 22, 55, 66};
		Integer key = 50;
		int cnt = countIf(arr, key, (x,y)-> x > y);
		System.out.println("Count of Arr1 = " + cnt); // 4 (because 4 elements in array are greater than given key i.e. 50)
		
		
		Double[] arr1 = {1.1,1.2,1.3,1.2,1.5};
		int c = countIf(arr1, 1.2, (x,y) -> x.equals(y));
		System.out.println("Count of Arr2 = "+c);

	}

}

