package RegExPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program1 {//RegEx is toll for matching, Serching or manupulating some type of pattern of String or anything.....
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("JavaCoding",Pattern.CASE_INSENSITIVE);
		Matcher match = pattern.matcher("Learning javaCoding is Fun");
		boolean matchfound = match.find();
		if(matchfound) {
			System.out.println("Match Found");
		}else {
			System.out.println("Match is not found");
		}
	}

}
