package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Book {
	String isbn;
	String title;
	String author;
	int quantity;
	double price;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter isbn :");
		isbn=sc.next();
		System.out.println("Enter title :");
		title=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter author:");
		author=sc.nextLine();
		//sc.nextLine();
		System.out.println("Enter quantity :");
		quantity=sc.nextInt();
		System.out.println("Enter price :");
		price=sc.nextDouble();
		
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}
	public void setIsbn(String isbn2) {
		// TODO Auto-generated method stub
		
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	}
	

