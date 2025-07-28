package FileHandling;

import java.io.File;

public class GetiingInfoFile {
	public static void main(String[] args) {
		File obj = new File("C:\\\\Users\\\\Prabal\\\\data.txt");
		if(obj.exists()) {
			System.out.println("The file name is : "+obj.getName());
			System.out.println("The absolute path of this file : "+obj.getAbsolutePath());
			System.out.println("Is it writable ?? "+obj.canWrite());
			System.out.println("Is it Readable ?? "+obj.canRead());
			System.out.println("File size in Bytes: "+obj.length());
		}else {
			System.out.println("File Doesn't exist");
		}
	}

}
