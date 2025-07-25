package ArrayListEx;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(60);
		list.add(30);
		list.add(70);
		list.add(90);
		list.add(100);
		list.add(10);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("After Sorting --"+list);
	}

}
