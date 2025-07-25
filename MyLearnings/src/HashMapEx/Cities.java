package HashMapEx;

import java.util.HashMap;

public class Cities {
	public static void main(String[] args) {
		HashMap<String, String>cities=new HashMap<String, String>();
		
		cities.put("England", "London");
		cities.put("Germany", "Berlin");
		cities.put("India", "Delhi");
		cities.put("Norway", "Oslo");
		cities.put("USA", "NY");
		System.out.println(cities);
		
		//REMOVE ELEMENT
		cities.remove("India");
		System.out.println(cities);
		//all clear
//		cities.clear();
		
		//size
		System.out.println(cities.size());
		
		//loop through keys
		for(String i:cities.keySet()) {
			System.out.println(i);
		}
		
		//loop through keys
		for(String i:cities.values()) {
			System.out.println(i);
		}
		
		//get keys and values--
		//loop through keys
		for(String i:cities.keySet()) {
			System.out.println("Keys :"+i+"  Values--"+cities.get(i));
		}
	}

}
