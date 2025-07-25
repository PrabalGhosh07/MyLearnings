package HashMapAss2;

import java.util.HashMap;
import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		HashMap<String, Integer>student=new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Choose an Option: ");
			System.out.println("1.Add Student");
			System.out.println("2.Get Student Score");
			System.out.println("3.Exist");
			
			int n= sc.nextInt();
			sc.nextLine();
			
			switch(n) {
				case 1:
					System.out.print("Enter the Student name you want to Add : ");
					String name =sc.nextLine();
					System.out.print("Enter the Score He/She Scored out of 100:");
					int score = sc.nextInt();
					student.put(name, score);
					break;
				case 2:
					System.out.println("Enetr the student name to get the Score");
					String studentName = sc.nextLine();
					Integer studentScore = student.get(studentName);
					if(studentScore !=null) {
						System.out.println("Score for "+studentName+" is : "+studentScore);
					}else {
						System.out.println("Student not found.");
					}
					break;
				case 3:
					System.out.println("Exiting.......");
					sc.close();
				default:
					System.out.println("Invalid choice");
					
			}
		}
	}

}
