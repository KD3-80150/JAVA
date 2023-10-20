import java.util.stream.Stream;

public class FactorialNumber {

	public static void main(String[] args) {
		int num=6;
		Stream<Integer> s = Stream.iterate(1, i -> i+1).limit(num);
		int result = s.reduce(1,(a,e)->a*e);
		System.out.println("Result = "+result);
	}

}
