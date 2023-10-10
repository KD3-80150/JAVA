import java.util.Scanner;

//Q2. Create a class called Employee that includes three fields—a first name (type String), a last
//name (type String) and a monthly salary (double). Provide a constructor that initializes the three
//instance variables. Provide a set and a get method for each instance variable. If the monthly salary
//is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates
//class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary.
//Then give each Employee a 10% raise and display each Employee’s yearly salary again.


public class Employee 
{
	private String fname;
	private String lname;
	private double msalay;
	private double asalary;
	private double isalary;

	public Employee(String fname, String lname, double msalay) 
	{
		this.fname = fname;
		this.lname = lname;
		this.msalay = msalay;
	}
	public Employee() 
	{
	}


	public String getFname() 
	{
		return fname;
	}


	public void setFname(String fname) 
	{
		this.fname = fname;
	}


	public String getLname() 
	{
		return lname;
	}


	public void setLname(String lname) 
	{
		this.lname = lname;
	}


	public void  getMsalay() 
	{
		if (msalay >= 0) {
			this.msalay = msalay;
		} 
		else 
		{
//			return this.msalay = 0;
			System.out.println("Error : Salary cannot be negative.");
		}
	}


	public void setMsalay(double msalay) 
	{
		this.msalay = msalay;
	}

	void accept()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Name = ");
		setFname(sc.next());

		System.out.println("Enter the Last Name = ");
		setLname(sc.next());

		System.out.println("Enter the Salary = ");
		setMsalay(sc.nextInt());
	}


	void display()
	{
		//		Scanner sc = new Scanner(System.in);
		System.out.println("First Name= "+fname);
		System.out.println("Last Name= "+lname);
		System.out.println("Monthly Salary = "+msalay);
		System.out.println("Annual Salary = "+get_asalary());
		System.out.println("Annual Salary with 10% increment = "+get_asalary_incre());

	}

	double get_asalary()
	{
		return asalary = msalay * 12;
	}
	
	double get_asalary_incre()
	{
		return isalary = get_asalary() + ( 0.10 * get_asalary() ) ;
	}

}
