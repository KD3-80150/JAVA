package com.app.Fruit;
import java.util.Scanner;

public class FruitBasket {
	
	public static int menu()
	{
		
		Scanner s2 = new Scanner(System.in);

		System.out.println("Enter your choice!");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("0.EXIT");
		System.out.println("1.To add a mango");
		System.out.println("2.To add an orange");
		System.out.println("3.To add an apple");
		System.out.println("4.Display names of all fruits in the basket");
		System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket");
		System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale");
		int choice = s2.nextInt();
		System.out.println("---------------------------------------------------------------------------");
		return choice;
	}
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter no. of fruits purchased");
		int size=s1.nextInt();
		Fruit[] basket= new Fruit[size];
		int choice=menu();
		int count=0;
		do
		{
			switch(choice)
			{
			case 0:
				
				break;
			
			case 1:
				//To add a mango
				if(count<basket.length) //count<size
				{
				
				basket[count]= new Mango();
				basket[count].setName("Mango");
				basket[count].acceptData();
				count++;
				}
				else
				{
					System.out.println("Limit of No. of fruits purchased doesn't match!!");
				}
				break;
			case 2:
				//To add an orange
				if(count<basket.length)
				{
				
				basket[count]= new Orange();
				basket[count].setName("Orange");
				basket[count].acceptData();
				count++;
				}
				else
				{
					System.out.println("Limit of No. of fruits purchased doesn't match!!");
				}
				break;
				
			case 3:
				//To add an apple
				if(count<basket.length)
				{
				
				basket[count]= new Apple();
				basket[count].setName("Apple");
				basket[count].acceptData();
				count++;
				}
				else
				{
					System.out.println("Limit of No. of fruits purchased doesn't match!!");
				}
				break;
				
			case 4:
				for(Fruit ele:basket)
				{
					if((ele.getName())!=null)
							{		
								System.out.println(ele.getName());
							}
				}
				
				break;
				
			case 5:
				for(Fruit ele:basket)
				{
					ele.displayData();
					if((ele.toString())!=null)
					{
						System.out.println(ele.toString());
					}
					System.out.println(ele.taste());
					System.out.println(ele.isFresh());
				}
				
				break;
				
			case 6:
				for(Fruit ele:basket)
				{
					if(!(ele.isFresh()))
					{
						System.out.println(ele.getName()+"is stale");
					}
				}
				
				
				break;
				
			case 7:
				//to mark a fruit as a stale
				System.out.print("Enter the index of the fruit to mark it as a stale one.");
				int i = s1.nextInt();
				if(i<basket.length)
				{
				basket[i].setFresh(false);
				}
				else
				{
					System.out.println("ERROR: ArrayIndexOutOfBound");
				}
				break;
				
//			case 8:
				
//				break;
			}
			
		}while ((choice=menu())!=0);
	}
}