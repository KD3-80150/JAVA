package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
    List<Book>list=new ArrayList<>();
    Book b;
    int index;
    int choice;
    do {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter your choice:");
    	choice=sc.nextInt();
    	switch(choice)
    	{
    	case 1:
    		b=new Book();
    		b.accept();
    		list.add(b);
    		break;
    	case 2:
    		for (Book bk : list) 
    			System.out.println(bk);
    		
    		break;
    	case 3:
    		System.out.println("Enter index at which element to be deleted : ");
				index=sc.nextInt();
				list.remove(index);
				break;
    	case 4:
    		String isbn=sc.next();
    		Book key=new Book();
    		key.setIsbn(isbn);
    		if(list.contains(key))
    			System.out.println("Found..");
    		else
    			System.out.println("Not Found..");
    		break;
    		
    	case 5:
    		list.clear();
    		break;
    	case 6:
    		System.out.println("Size: "+list.size());
    		break;
    	case 7:
    		class BookPriceComparator implements Comparator<Book>{

				@Override
				public int compare(Book b1, Book b2) {
					int differ=-Double.compare(b1.getPrice(), b2.getPrice());
					
					return differ;
				}
    			
    		}
    		BookPriceComparator comparator=new BookPriceComparator();
    		list.sort(comparator);
    		break;
			}
    	}while(choice !=0);
    

	}

}