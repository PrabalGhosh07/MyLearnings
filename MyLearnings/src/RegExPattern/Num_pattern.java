package RegExPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Num_pattern {
	public static void main(String[] args) {
		String[] arr= {
				"123456",
				"3.2565",
				"ajgyhvb",
				"2523hjgvhvb",
				"-5265",
				"+5220"
		};
		//Pattern of reguler expression for numbers to validate
		String namePattern ="[-+]?\\d*\\.?\\d+";
		
		Pattern pattern = Pattern.compile(namePattern);
		
		for(String str : arr) {
			Matcher match = pattern.matcher(str);
			if(match.matches()) {
				System.out.println(str+" is a valid number");
			}else {
				System.out.println(str+" is a invalid number");
			}
		}
	}

}
