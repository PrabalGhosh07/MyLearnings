package LamdaExpression;

interface StrFun{
	String run(String str);
}
public class Labmda_Method {

	public static void main(String[] args) {
		StrFun exclaim = (s)->s+"!!";
		StrFun query = (s)->s+"??";
		askQuery("Hello", exclaim);
		askQuery("Hello", query);
	}
	
	public static void askQuery(String str,StrFun format) {
		 String result = format.run(str);
		 System.out.println(result);
	}

}
