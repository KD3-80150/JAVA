//Q2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
//doubles, supply suitable error message & terminate.
//If numbers are double values, print its average.
//
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		double num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number : ");
		num1 = sc.nextDouble();
		


		System.out.println("Enter 2nd number : ");
		num2 = sc.nextDouble();
		
		if (sc.hasnext(num1) == Double) ) 
		{
			System.out.println("Error : Entered elements are not double");
		}
		else
		{
			System.out.println("Average of " + num1 + " and "+num2+" is = "+( Double.sum(num1, num2)  )/2   );
		}

	}

}
