package LogicalInterviewPOV;

import java.util.Scanner;

/*take 2 number n1=10 and n2=12 first divide n1 by 2 and multiply n2 by 2 till n1==0 and
 * then add the multiplication value when n1 value is odd
 15/2=7                  10*2=20
 7/2=3                   20*2=40
 3/2=1                   40*2=80
 1/2=0                   80*2=160   Only Odd number occurred at n1 we need to sum them
 sum=20+40+80=
 */
public class RussianMultiplication {

	public static void main(String[] args) {
		int n,a,b,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number:");
		a=sc.nextInt();
		System.out.print("Enter Second Number:");
		b=sc.nextInt();
		while(a!=0) {
			if(a%2!=0) {
				sum+=b;
			}
			a/=2;
			b*=2;	
		}
		System.out.println("Russian Multiplication is:"+sum);
	}

}
