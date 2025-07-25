package LinkeListEx;

import java.util.LinkedList;

public class ListOfContries {
	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		//add elements
		list.add("USA");
		list.add("India");
		list.add("Austrelia");
		list.add("Chaina");
		list.add("Srilanka");
		System.out.println(list);
		
		//add in first and last
		list.addFirst("South Africa");
		list.addLast("Newzeland");
		System.out.println(list);
		
		//remove last and first element
		list.removeLast();
		list.removeFirst();
		System.out.println(list);
		
		//get first and last element
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
	}

}
