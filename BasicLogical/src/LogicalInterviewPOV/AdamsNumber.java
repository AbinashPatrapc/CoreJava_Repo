package LogicalInterviewPOV;

import java.util.Scanner;

public class AdamsNumber {

	//a number when reversed, the square of the number and the square
	//of the reversed number should be numbers which are reverse of each other
	//num=12 reverse=21  square=144
	//reverse=21 square=441 reverse=144
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
		System.out.println("Rev: "+rev);
		int sqr2=rev*rev;//441
		//int temp1=sqr2;
		
		while(sqr2!=0) {
			int rem=sqr2%10;
			rev1=rev1*10+rem;
			sqr2/=10;
		}
		System.out.println("Rev1: "+rev1);
		if(sqr==rev1)
			System.out.println(temp+" is a Adam Number");
		else
			System.out.println("It is not Adam Number");
	}
	//sc.close();

}
