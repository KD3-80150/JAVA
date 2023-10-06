//Q3.Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
//2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
//When user enters 'Generate Bill' option , display total bill & exit.

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dosa= 55;
		int idli=30;
		int utapa=70;
		int ri=45;
		int mdosa=65;
		int miasl=50;
		int pavb=75;
		int choleb=60;
		int vp=15;
		int chai=10;

		Scanner sc = new Scanner(System.in);
		while (true) {


			int choice;
			System.out.println("*****Menu*****");
			System.out.println("1. Dosa. ");
			System.out.println("2. Idli. ");
			System.out.println("3. Uttapa. ");
			System.out.println("4. Rava Idli. ");
			System.out.println("5. Mysore Dose. ");
			System.out.println("6. Miasal Pav. ");
			System.out.println("7. Pav Bhaji. ");
			System.out.println("8. Chole Bhature. ");
			System.out.println("9. Vada Pav. ");
			System.out.println("10. Chai. ");
			System.out.println("***************");
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Dosa Added in the Order List.");
				

				break;
			case 2:
				System.out.println("Dosa Added in the Order List.");

				break;
			case 3:
				System.out.println("Dosa Added in the Order List.");
				
				break;


			default:System.out.println("Thank You so much. Visit Again");
			break;
			}
		}

	}
}