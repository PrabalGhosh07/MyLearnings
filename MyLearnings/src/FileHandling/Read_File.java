package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_File {
	public static void main(String[] args) {
		try {
			File obj = new File("C:\\\\Users\\\\Prabal\\\\data.txt");//reads from...
			Scanner sc= new Scanner(obj);//ans stores in that object...
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Error Raised.....");
			e.printStackTrace();
		}
	}

}
