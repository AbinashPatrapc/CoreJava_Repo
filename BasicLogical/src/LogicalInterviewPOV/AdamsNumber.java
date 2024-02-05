package LogicalInterviewPOV;

import java.util.Scanner;

public class AdamsNumber {

	public static void main(String[] args) {
		int rev=0,temp,rev1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();//12
		temp=num;
		int sqr=num*num;//144
		
		while(num!=0) {
		  int rem=num%10;
		   rev=rev*10+rem;
		   num/=10;
		}
		int sqr2=rev*rev;//441
		int temp1=sqr2;
		
		while(sqr2!=0) {
			int rem=sqr2%10;
			rev1=rev1*10+rem;
			sqr2/=10;
		}
		if(sqr==rev1)
			System.out.println(temp+" is a Adam Number");
		else
			System.out.println("It is not Adam Number");
	}

}
