package FileHandling;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		File obj = new File("myFile.txt");
		if(obj.delete()) {
			System.out.println("File is deleted : "+obj.getName());
		}else {
			System.out.println("File Doesn't exist");
		}
	}
}
