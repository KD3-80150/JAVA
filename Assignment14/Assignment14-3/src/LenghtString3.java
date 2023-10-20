//
//3. Create a functional interface Arithmetic with single abstract method double calc(double,double). Write a static method calculate() in main
//class as follows. In main(), write a menu driven program that inputs two numbers from the user and calls calculate() method with appropriate lambda
//expression (in arg3) to perform addition, subtraction, multiplication and division operations.

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Predicate;

@FunctionalInterface
interface Arithmetic {
	Double calc(double a, double b);
}

public class LenghtString3 {

	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);
	}

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("");
			System.out.println("Please Enter 1st number");
			Double n1 = sc.nextDouble();
			System.out.println("Please Enter 2nd number");
			Double n2 = sc.nextDouble();

			System.out.println("*****Menu*****");
			System.out.println("1.Add.");
			System.out.println("2.Substraction.");
			System.out.println("3.Multiplication.");
			System.out.println("4.Division.");
			System.out.println("5.Exit.");
			System.out.println("Please Enter your choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				calculate(n1, n2, (x, y) -> x + y);
				break;

			case 2:
				calculate(n1, n2, (x, y) -> x - y);
				break;

			case 3:
				calculate(n1, n2, (x, y) -> x * y);
				break;

			case 4:
				if (n2 == 0) 
				{
					System.out.println("Denominator cannot be 0");
					break;
				} 
				else 
					calculate(n1, n2, (x, y) -> x / y);
				break;

			case 5:
				return;

			default:
				System.out.println("Invalid Choice.Please Enter Correct Choice.");
				break;
			}
		} while (choice != 0);

	}

}
