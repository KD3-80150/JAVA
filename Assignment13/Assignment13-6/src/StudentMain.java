import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer, Student>map=new HashMap<Integer, Student>();
		int choice;
		Student s;
		do
		{
			System.out.println("1.Add student\n2.Search Student");
			System.out.println("Enter choice:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				s=new Student();
				s.accept();
				map.put(s.getRoll(), s);
				break;
			case 2:
				System.out.println("Enter Student to search in map");
				Integer roll = sc.nextInt();
				 s = map.get(roll);
				if(s==null)
				System.out.println("student not found");
				else
					System.out.println("student found");
				break;
			

			}
			
		}while(choice !=0);

	}

}
