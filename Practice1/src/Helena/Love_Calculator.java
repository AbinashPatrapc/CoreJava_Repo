package Helena;

import java.util.Random;
import java.util.Scanner;

public class Love_Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("Enter 1st Name: ");
		String name1=sc.nextLine();
		System.out.print("Enter 2nd Name: ");
		String name2=sc.next();
		int pre=rand.nextInt(100)+1;
		System.out.println(name1+" & "+name2+" Your Love Score is: "+pre+"%");
	}

}
