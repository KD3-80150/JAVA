//Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
//sold at the store. An Invoice should include four pieces of information as fields—a part number
//(type String), a part description (type String), a quantity of the item being purchased (type int) and a
//price per item (double). Your class should have a constructor
//that initializes the four instance variables. Provide a set and a get method for each instance variable.
//calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
//amount as a double value.
//If the quantity is not positive, it should be set to 0.
//If the price per item is not positive, it should be set to 0.0.
//Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.

import java.util.Scanner;

public class Invoice {
	private String part_number;
	private  String part_description;
	private int quantity;
	private double price;
	private double amount = 0;

	public Invoice()
	{
		//this.part_number = "";	
		//		this.part_description = "";
		//		this.quantity = 0;
		//		this.price = 0;
	}

	public Invoice(String part_number, String part_description, int quantity, double price) 
	{
		this.part_number = part_number;
		this.part_description = part_description;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPart_number() 
	{
		return part_number;
	}

	public void setPart_number(String part_number) 
	{
		this.part_number = part_number;
	}

	public String getPart_description() 
	{
		return part_description;
	}

	public void setPart_description(String part_description) 
	{
		this.part_description = part_description;
	}

	public int getQuantity() 
	{
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity >= 0) {
			this.quantity = quantity;
		} else {
			this.quantity = 0;
		}
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		} else {
			this.price= 0.0;
		}
	}	

	void accept()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Part number = ");
		setPart_number(sc.next());

		System.out.println("Enter the Part Description = ");

		setPart_description(sc.next());

		System.out.println("Enter the Quantity = ");
		setQuantity(sc.nextInt());

		System.out.println("Enter the Price = ");
		setPrice(sc.nextDouble());
	}


	void display()
	{
		//		Scanner sc = new Scanner(System.in);
		System.out.println("Part number = "+part_number);
		System.out.println("Part Description = "+part_description);
		System.out.println("Quantity = "+quantity);
		System.out.println("Price = "+price);

	}

	double get_amount()
	{
		return amount = price * quantity;
	}

}
