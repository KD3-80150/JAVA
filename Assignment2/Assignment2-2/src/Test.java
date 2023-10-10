//Create two Employee objects and display each object’s yearly salary.
//Then give each Employee a 10% raise and display each Employee’s yearly salary again.


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		System.out.println("***************");
		System.out.println("Employee 1");
		e1.accept();
		e1.display();
		
		Employee e2 = new Employee();
		System.out.println("***************");
		System.out.println("Employee 2");
		e2.accept();
		e2.display();
	}

}
