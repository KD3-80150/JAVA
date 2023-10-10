//Write TestPoint class , in package "tester" , with a main method, Accept co ordinates of 2 points
//from user (Scanner) --to create 2 points (p1 & p2)
//Use getDetails method to display point details.(p1's details & p2's details)
//Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same
//position)
//If they are not located at the same position , display distance between p1 & p2

package tester;
import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) 
	{
		double x1,x2,y1,y2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the co-ordinates for Point 1");
		System.out.println("Please enter the X co-ordinates : ");
		x1 = sc.nextDouble();
		System.out.println("Please enter the Y co-ordinates : ");
		y1 = sc.nextDouble();


		System.out.println("Please enter the co-ordinates for Point 2");
		System.out.println("Please enter the X co-ordinates : ");
		x2 = sc.nextDouble();
		System.out.println("Please enter the Y co-ordinates : ");
		y2 = sc.nextDouble();

		Point2D p1 = new Point2D(x1, y1);
		Point2D p2 = new Point2D(x2, y2);

		System.out.println( "***** Point 1 ***** " );
		System.out.println( p1.getDetails() );


		System.out.println( "***** Point 2 ******");
		System.out.println( p2.getDetails() );



		if (p1.isEqual(p2)) 
		{
			System.out.println("Both points are located at the same position.");
		}
		else 
		{
			double distance = p1.calculate_distance(p2);
			System.out.println("Both points are located at different positions.");
			System.out.println("Distance between Point 1 and Point 2: " + distance);
		}
	}
}