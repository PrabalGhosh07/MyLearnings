package FileHandling;

import java.io.File;
import java.io.IOException;

public class program1 {
	public static void main(String[] args) {
		//New File object Creation
		File obj=new File("C:\\\\Users\\\\Prabal\\\\data.txt");//indecate where and how to store
		
		try {
			//for creating the file 
			if(obj.createNewFile()) {
				System.out.println("File is created : "+obj.getName());
			}else {// it already accesed so ....
				System.out.println("File is already exist ");
			}
		} catch (IOException e) {
			System.out.println("Exception Occourred");
			e.printStackTrace();
		}
	}

}
