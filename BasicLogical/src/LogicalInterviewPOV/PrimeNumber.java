package LogicalInterviewPOV;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);int c = 0;
		System.out.println("Enter a Number to check Prime or not: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
			System.out.println(c);
		}
		if(c==2) 
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime");
		

	}

}
