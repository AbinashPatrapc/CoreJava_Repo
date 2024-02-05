package LogicalInterviewPOV;
//Perfect number is the sum of multiple of a number is equal to that number
//Example= 6 (multiple of 6 is 1,2,3)1+2+3=6 so 6 is a perfect number.

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int count=1,sum=0;
		
		while(count<num) {
			if(num%count==0)
				sum=sum+count;
			count++;
		}
		if(sum==num)
			System.out.println(num+" is a perfect number");
		else
			System.out.println(num+" is not a perfect number");
		sc.close();
	}

}
