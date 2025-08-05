package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Write_in_File {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("C:\\Users\\Prabal\\Documents\\File.txt");
			myWriter.write("I Love Harry Potter");
			myWriter.close();
			System.out.println("Successfully Written to the file .....");
		} catch (IOException e) {
			System.out.println("Error Occurred.....");
			e.fillInStackTrace();
		}
	}
}
