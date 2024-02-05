package LogicalInterviewPOV;

import java.util.Scanner;

//If the sum and multiplication of a number is same then it is a spy  number
//1124
public class SpyNumber {

	public static void main(String[] args) {
		int rem,sum=0,mul=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		while(num!=0) {
			rem=num%10;
			sum+=rem;
			mul*=rem;
			num/=10;
		}
		if(sum==mul) 
			System.out.println("It is a Spy Number");
		else
			System.out.println("It is not a spy number");

	}

}
