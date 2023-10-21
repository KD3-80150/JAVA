import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			FileWriter fw = new FileWriter("Output.txt");
			BufferedWriter bwr = new BufferedWriter(fw);

			for (int i = 1; i <= 4; i++)

			{
				System.out.println("Enter the Line.");
				String line = sc.nextLine();
				bwr.write(line);
				bwr.newLine();
			}
			System.out.println("Lines have been written to the file Succesfully. ");

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
