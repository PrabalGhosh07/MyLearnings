package CollectionsEx;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
	public static void main(String[] args) {
		ArrayList<String>fruits=new ArrayList<String>();
		
		fruits.add("Apple");
		fruits.add("Graps");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Guava");
		
		Iterator<String>it=fruits.iterator();
		//print the first element of fruits by iterator
		System.out.println(it.next());//next method is already point to the fist
		
		//Loop through Iterator
		while(it.hasNext()) {//first it gives trye bcz list has more elements and after that it go for the second item
			String i=it.next();
			if(i=="Banana") {
				it.remove();
			}
			System.out.println(it.next());
			
		}
		
		
	}

}
