import java.util.Scanner;

//Q3. Create an application that calculates your daily driving cost, so that you can estimate how much
//money could be saved by car pooling, which also has other advantages such as reducing carbon
//emissions and reducing traffic congestion. The application should input the following information
//and display the user’s cost per day of driving to work:
//a) Total miles driven per day.
//b) Cost per gallon of gasoline.
//c) Average miles per gallon.
//d) Parking fees per day.
//e) Tolls per day.



public class Driving 
{
	double miles;
	double perGallons;
	double avg;
	double parking;
	double tolls;
	double cost;

	Scanner sc = new Scanner(System.in);

	void accept() 
	{
		System.out.println("Please enter the Distance Travelled (in Miles) : ");
		miles = sc.nextInt();
		System.out.println("Please enter the Cost of Gasoline per Gallons : ");
		perGallons = sc.nextInt();
		System.out.println("Please enter the Average of the Car : ");
		avg = sc.nextInt();
		System.out.println("Please enter the Parking fees per day : ");
		parking = sc.nextInt();
		System.out.println("Please enter the Toll fees per day : ");
		tolls = sc.nextInt();
	}

	void display()
	{
		System.out.println("Distance : " + miles+ " miles");
		System.out.println("Cost of Gasoline per Gallons : $" + perGallons);
		System.out.println("Average of the Car : " + avg);
		System.out.println("Parking fees per day : $" + parking);
		System.out.println("Toll fees per day :  $" + tolls);
		System.out.println("****************************************************");
		System.out.println("Total Daily Cost for 4 people individually : " + (4 * getCost() )  );
		System.out.println("Total Daily Cost for 4 people using car pool : " + getCost()  );
	}
	
	double getCost()
	{
		
		return cost = ( ( (miles / avg) * perGallons) +  parking + tolls   );
	}

	public static void main(String[] args) 
	{

		Driving d1 = new Driving();
		d1.accept();
		d1.display();


	}

}
