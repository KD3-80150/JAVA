package com.sunbeam;

public class Test {

	public static void main(String[] args) {
		Box<Manager> b1 = new Box<>();
		b1.set(new Manager());
		System.out.println("res = "+ b1.get());		//op - Manager sal = ....
		System.out.println("res1 = "+ b1.getTotalSal());
		System.out.println("-----------------------------------------------");
		Box<Salesman> b2 = new Box<>();
		b2.set(new Salesman());
		System.out.println("res2 = "+b2.get());
		System.out.println("res3 = "+b2.getTotalSal());
	}

}
