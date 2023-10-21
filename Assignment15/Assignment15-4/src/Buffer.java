
import java.io.BufferedReader;
import java.io.FileReader;

public class Buffer {

	
	public static void main(String[] args) {
		
		try (FileReader fr = new FileReader("/home/sunbeam/Documents/java_practice/Assignment15/Assignment15-3/Output.txt")) {
			try (BufferedReader br = new BufferedReader(fr)) {
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
