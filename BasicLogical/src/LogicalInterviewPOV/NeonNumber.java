package LogicalInterviewPOV;

import java.util.Scanner;

/*
 * if the sum of Square of the number is equal to the original number
 * then it is neon number
 * Example: 9-->81-->8+1-->9
 */
public class NeonNumber {

	public static void main(String[] args) {
		int num,sqr,sum=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number to Check:");
		num=sc.nextInt();
		sqr=num*num;
		
		while(sqr!=0) {
			rem=sqr%10;
			sum+=rem;
			sqr/=10;
		}
		if(sum==num) 
		   System.out.println("Neon Number");
		else
		   System.out.println("Not a Neon Number");
		

	}

}
