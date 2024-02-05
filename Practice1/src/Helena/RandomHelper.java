package Helena;

import java.util.Random;

public class RandomHelper {

	static int randomInt(int num1, int num2) {
		Random rand = new Random();
        return rand.nextInt((num2 - num1) + 1)+ num1;// rand.nextInt(12); 99
	}
	
	static double randomDouble(double d1,double d2) {
		Random rand = new Random();
        return rand.nextDouble() * (d2 - d1) + d1;
	}
	
	public static void main(String[] args) {
		System.out.println(randomInt(12, 23));
		System.out.println(randomDouble(2.3, 4.5));
		
	}
}
