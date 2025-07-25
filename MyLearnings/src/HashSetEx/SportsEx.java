package HashSetEx;

import java.util.HashSet;

public class SportsEx {
	public static void main(String[] args) {
		HashSet<String>sports=new HashSet<String>();//No duplicate Value
		//add items
		sports.add("Footbal");
		sports.add("Cricket");
		sports.add("Tenis");
		sports.add("Badminton");
		sports.add("Footbal");
		
		System.out.println(sports);
		
		//For Checing the items
		System.out.println(sports.contains("Cricket"));
		
		//remove
		sports.remove("Tenis");
		System.out.println(sports);
		//remove all\
		//sports.clear();
		for(String i:sports) {
			System.out.println(i);
		}
	}

}
