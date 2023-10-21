package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Book {
	String isbn;
	String title;
	String author;
	int quantity;
	double price;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	Scanner scanner = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter isbn = ");
		isbn = scanner.next();
		System.out.println("Enter title = ");
		title = scanner.next();
		scanner.nextLine();
		System.out.println("Enter author = ");
		author = scanner.nextLine();
		System.out.println("Enter quantity = ");
		quantity = scanner.nextInt();
		System.out.println("Enter price = ");
		price = scanner.nextDouble();
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

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", quantity=" + quantity + ", price="
				+ price + "]";
	}

}

