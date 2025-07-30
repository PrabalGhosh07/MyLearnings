package AuthenticationSystem;

import java.util.LinkedList;
import java.util.Scanner;

public class MainClass {
	
	private LinkedList<User>userlist ;
	
	public MainClass() {
		userlist=new LinkedList<>();
	}
	
	public void register(String username,String password) {
		User newUser= new User(username,password);
		userlist.add(newUser);
		System.out.println("Registration successful......");
	}
	
	public boolean login(String username, String password) {
		for(User user : userlist) {
			if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		MainClass authSys = new MainClass();
		Scanner sc = new Scanner(System.in);
		
		boolean loggedIn=false;
		
		while(!loggedIn) {
			System.out.println("Choose an Option--->");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Exist");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				System.out.print("Enter a Username : ");
				String regUsername = sc.nextLine();
				System.out.print("Enter a Password : ");
				String regPassword = sc.nextLine();
				authSys.register(regUsername, regPassword);
				
				break;
				//-------------------------------
			case 2:
				System.out.print("Enter Your Username : ");
				String loginUsername = sc.nextLine();
				System.out.print("Enter Your Password : ");
				String loginPassword = sc.nextLine();
				
				if(authSys.login(loginUsername, loginPassword)) {
					System.out.println("You are Successfully logged in , Welcome to our System");
					loggedIn=true;
				}else {
					System.out.println("Entered Wrong Username or Password ");
				}
				
				break;
				//========================================
			case 3:
				System.out.println("Exiting...........");
				loggedIn=true;
				break;
				
			default:
				throw new IllegalArgumentException("Invaid Choice, Try Again.....");
			}
			
		}
		sc.close();
	}

}
