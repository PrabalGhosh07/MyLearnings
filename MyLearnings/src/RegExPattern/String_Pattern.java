package RegExPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_Pattern {

	public static void main(String[] args) {
		String[] arr= {
				"Prabal",
				"521dghj",
				"harry",
				"Java Coding",
				"-5265",
				"reg_ex"
		};
		
		//Pattern of reguler expression for String to validate
		String namePattern ="^[a-zA-Z_ ][a-zA-Z0-9_ ]*$";
		Pattern pattern = Pattern.compile(namePattern);
		
		for(String str : arr) {
			Matcher match = pattern.matcher(str);
			if(match.matches()) {
				System.out.println(str+" is a valid String");
			}else {
				System.out.println(str+" is a invalid String");
			}
		}		
				

	}

}
