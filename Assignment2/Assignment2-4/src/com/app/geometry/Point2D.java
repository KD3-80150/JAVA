//Q4. Create a class Point2D , in package - "com.app.geometry" : for representing a point in x-y co-
//ordinate system. Create a parameterized constructor to init x & y co-ords. Add a method to return
//string form of point's x & y co-ords
//Hint : public String getDetails())
//Add isEqual method to Point2D class :a boolean returning method : must return true if n only if
//both points are having same x,y co-ords or false otherwise.
//Add calculateDistance method to calculate distance between current point and specified point &
//return the distance to the caller.
//Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
//Write TestPoint class , in package "tester" , with a main method, Accept co ordinates of 2 points
//from user (Scanner) --to create 2 points (p1 & p2)
//Use getDetails method to display point details.(p1's details & p2's details)
//Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same
//position)
//If they are not located at the same position , display distance between p1 & p2

package com.app.geometry;

public class Point2D 
{
	private double x;
	private double y;

	public Point2D(double x, double y) 
	{
		this.x = x;
		this.y = y;
	}

	public String getDetails() 
	{
		return "Point(" + x + "," + y + ")" ;	
	}

	Point2D p2;
	public boolean isEqual(Point2D p2)
	{
		return this.x == p2.x && this.y == p2.y; 
	}

	double dist_x;
	double dist_y;

	public double calculate_distance(Point2D p2) 
	{
		dist_x = this.x - p2.x;
		dist_y = this.y - p2.y;
		return Math.sqrt(  (dist_x * dist_x) + ( dist_y * dist_y)   );
	}	
}
