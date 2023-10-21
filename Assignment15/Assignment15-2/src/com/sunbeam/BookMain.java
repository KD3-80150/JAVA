package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class BookMain {
	
	public static void writeBooks() {
		List<Book> list = new ArrayList<>();
//			list.add(new Book(1, "Forest Gump", 8.5));
//			list.add(new Book(2, "Star Wars", 9.3));
//			list.add(new Book(3, "Harry Potter", 7.5));
//			list.add(new Book(4, "Intersteller", 6.6));
//			list.add(new Book(5, "Mission Imposible", 9.2));
			
			try(FileOutputStream fout = new FileOutputStream("books.bin")) {
				try(ObjectOutputStream dout = new ObjectOutputStream(fout)) {
					for(Book m : list) {
						dout.writeUTF(m.getIsbn());
						dout.writeUTF(m.getTitle());
						dout.writeUTF(m.getAuthor());
						dout.writeDouble(m.getPrice());
						dout.writeInt(m.getQuantity());

					}
				} // dout.close();
			} // fout.close();
			catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("Books saved.");
		}
	
	public static void readBooks() {
		try(FileInputStream fin = new FileInputStream("books.bin")) {
			try(ObjectInputStream din = new ObjectInputStream(fin)) {
				while(true) {
					Book b = new Book();
					
					b.setIsbn( din.readUTF() );
					b.setTitle( din.readUTF() );
					b.setAuthor( din.readUTF() );
					b.setQuantity( din.readInt() );
					b.setPrice( din.readDouble() );
										
					System.out.println(b);
					System.out.println("Books Loaded..");
				}
			} // din.close();
		} // fin.close();
		catch (EOFException e) {
			// do nothing
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
//	 try {
//         DataInputStream dis = new DataInputStream(new FileInputStream("books.dat"));
//         int size = dis.readInt();
//         books.clear();
//         for (int i = 0; i < size; i++) {
//             String isbn = dis.readUTF();
//             String title = dis.readUTF();
//             String author = dis.readUTF();
//             int quantity = dis.readInt();
//             double price = dis.readDouble();
//             Book loadedBook = new Book(isbn, title, author, quantity, price);
//             books.add(loadedBook);
//         }
//         dis.close();
//         System.out.println("Books loaded from file.");
//     } catch (IOException e) {
//         e.printStackTrace();
//     }
//     break;
	
	
	
	

	public static void main(String[] args) 
	{

		List<Book> li = new ArrayList<Book>();
		Comparator<Object> b;
		Book b1;
		int ind;
		int choice;
		
		
		
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("-----------------------------------------");
			System.out.println("Menu");
			System.out.println("1. Add new book in List");
			System.out.println("2. Display all books in forward order using random access");
			System.out.println("3. Search a book with given isbn (hint - indexOf())");
			System.out.println("4. Delete a book at given index.");
			System.out.println("5. Delete a book with given isbn.");
			System.out.println("6. Reverse the list (hint - Collections.reverseList())");
			System.out.println("7. Save books in ﬁle ( Using ObjectInputStream and ObjectOutputStream ).");
			System.out.println("8. Load books from ﬁle ( Using ObjectInputStream and ObjectOutputStream ).");
			System.out.println("9. Exit.");
			System.out.println("Enter your choice = ");
			choice = scanner.nextInt();

			switch (choice) {

			case 1: // adding books
				b1 = new Book();
				b1.accept();

				if (li.contains(b1)) {
					ind = li.indexOf(b1);
					b1 = li.get(ind);
					b1.setQuantity(b1.getQuantity() + 1);
				}

				else {
					li.add(b1);
				}
				break;

			case 2: // printing books
				for (int i = 0; i < li.size(); i++) {
					System.out.println("Book at index " + i + ": " + li.get(i));
				}
				break;

			case 3: // Search a book with given isbn (hint - indexOf())
				System.out.println("Enter particular index to search = ");
				ind = scanner.nextInt();
				System.out.println("Book at index " + ind + ": " + li.get(ind));
//				b1 = li.get(ind);
				break;

			case 4: // delete at particular index
				System.out.println("Enter particular index to delete = ");
				ind = scanner.nextInt();
				li.remove(ind);
				System.out.println("Deleted.");
				break;

			case 5: // Check if book with given isbn is in list or not
				String isbn = scanner.next();
				Book key = new Book();
				System.out.println("Enter isbn to delete = ");
				key.setIsbn(isbn);
				if (li.contains(key)) {
					li.remove(key);
					System.out.println("ISBN = " + key + "\nDeleted");
				} else {
					System.out.println("ISBN NOT FOUND");
				}
				break;

			case 6:
				System.out.println("Reverse the order of books...");
				Collections.reverse(li);
				for(Book b2:li)
				System.out.println(b2);
				break;
			
			case 7:
				writeBooks();
				break;
				
			case 8:
				readBooks();
				break;
				
			case 9:
				return;

			}
		} while (choice != 0);
		System.out.println("Thank you for using the app.");

	}

}


