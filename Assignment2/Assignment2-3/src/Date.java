import java.util.Scanner;

//Q3. Create a class called Date that includes three fields—a month (type int), a day (type int) and a
//year (type int). Provide a constructor that initializes the three instance variables and assumes that
//the values provided are correct. Provide a set and a get method for each instance
//variable. Provide a method displayDate that displays the month, day and year separated by forward
//slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities.



public class Date 
{
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) 
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date() 
	{
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	void accept()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Day = ");
		setDay(sc.nextInt());

		System.out.println("Enter the Month = ");
		setMonth(sc.nextInt());

		System.out.println("Enter the Year = ");
		setYear(sc.nextInt());
	}


	void display()
	{
		//		Scanner sc = new Scanner(System.in);
		System.out.println("************Date************");
		System.out.println("Day = "+day);
		System.out.println("Month = "+month);
		System.out.println("Year = "+year);
		System.out.println("Date :  "+day+"/"+month+"/"+year);
	}
	
	

}
