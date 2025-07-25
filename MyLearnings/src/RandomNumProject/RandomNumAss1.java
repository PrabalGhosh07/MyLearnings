package RandomNumProject;

import java.util.Random;

public class RandomNumAss1 {
	public static void main(String[] args) {
		long random10digitNum=generateRandomNum();
		System.out.println("random 10digit number - "+random10digitNum);
	}


	public static long generateRandomNum() {
		Random random = new Random();
		long min=1000000000L;
		long max=9999999999l;
		
		long random10digitNum=min+((long)(random.nextDouble()*(max-min+1)));
		return random10digitNum;
	} 	
}