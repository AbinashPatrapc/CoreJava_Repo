package LogicalInterviewPOV;
//Strong Number is the factorial of the digit is equal to the original number
//Example: 145 (1 factorial+4 Factorial+5 factorial)->1+24+120=145
import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		int rem,fact,count,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();int temp=num;
		while(num!=0) {
             rem=num%10;
             count=1;fact=1;
           while(count<=rem) {
              fact=fact*count;
              count++;
            }
             sum=sum+fact;
             num=num/10;
		}
		if(sum==temp)
			System.out.println(temp+" is a Strong Number");
		else
			System.out.println(temp+" is not a Strong Number");
	}

}

