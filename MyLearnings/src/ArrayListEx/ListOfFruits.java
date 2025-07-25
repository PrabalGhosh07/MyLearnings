package ArrayListEx;

import java.util.ArrayList;

public class ListOfFruits {
	public static void main(String[] args) {
		ArrayList<String>fruits=new ArrayList<String>();
		//adding element
		fruits.add("Apple");
		fruits.add("Graps");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Guava");
		System.out.println(fruits);
		
		//set elememnt
		fruits.set(3, "Pineapple");
		System.out.println(fruits);
		
		//remove element
		fruits.remove(4);
		System.out.println(fruits);
		fruits.add("Guava");
		//remove all element 
//		fruits.remove(0);
//		System.out.println(fruits);
		
		//size of array
		System.out.println("Size of this busket is "+fruits.size()+" fruits");
		
		//Loop in ArrayList
		for(int i=0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
		
		for(String i:fruits) {
			System.out.println(i);
		}


		
	}

}
