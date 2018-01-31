package class8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class part2 {
	public static void main(String[] args) throws IOException {
		File a = new File("C:\\Users\\WELCOME\\eclipse-workspace\\class8\\ANNIE.txt");

		FileReader in = new FileReader(a);
		try {
			int current;
			while ((current = in.read()) != -1) {
				System.out.print((char) current);
			}
		} catch (FileNotFoundException e) {
			System.out.println("file does not exist");
		} finally {

			in.close();
		}
	}

}
