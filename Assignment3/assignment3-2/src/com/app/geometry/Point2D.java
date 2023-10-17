//Q2. Copy the Point2D class , along with the package from previous assignment.
//a) Create a class "TestPointArray1.java" in "tester" package for the following
//b) Accept , how many no of points to plot from user.
//c) Create suitable data structure
//Hint : Point2D[] points=new Point2D[sc.nextInt()];
//d) Prompt user for x & y co ordinates n store the data suitably
//Hint : for loop
//e) Supply Menu to user with various Options like following
//1. Display details of a specific point
//User i/p : index
//O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!)
//2) Display x, y co-ordinates of all points
//Hint : for-each
//3) User i/p : 2 indices for the points , validate the indices
//Display distance between specified points (iff they are not located at the same position)
//eg : sop("Enter index of strt point n end point");
//validation : boundary condition (0<=index<length-1)
//isEqual -- false --compute distance --display it.
//4. Exit

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
		return "Point(" + x + " , " + y + ")" ;	
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