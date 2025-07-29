package LamdaExpression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda_ArraList {
	public static void main(String[] args) {
		ArrayList<Integer>number = new ArrayList<Integer>();
		number.add(50);
		number.add(60);
		number.add(10);
		number.add(40);
		number.add(30);
		number.add(25);
		
		//number.forEach((n)->{System.out.println(n);});
		
		Consumer<Integer>myMethod =(n)->{System.out.println(n);};
		number.forEach(myMethod);
	}

}
