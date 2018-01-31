package class8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class part1 {
	public static void main(String[] args) throws IOException {
		File a1 = new File("C:\\Users\\WELCOME\\eclipse-workspace\\class8\\abc.txt");
		FileReader in = new FileReader(a1);

		int current;
		while ((current = in.read()) != -1) {
			System.out.print((char) current);
		}

	}

}
