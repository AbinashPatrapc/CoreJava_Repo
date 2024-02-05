package LogicalInterviewPOV;
//Step number is consecutive number whose difference of each digit is 1
// 1234,5432
//1010,12234 is not a Step number
import java.util.Scanner;

public class StepNumber {

	public static void main(String[] args) {
		int num,n1,n2,step=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		num=sc.nextInt();//1234
		
		while(num!=0) {
			n1=num%10;//1
			num/=10;
			n2=num%10;//1
			if(num==0) break;
			if(n2==0) {
				step=0;break;
				}
			if(n1-n2==1 || n1-n2==-1)
				step=1;
			else {
				step=0;
				break;
			}	
		}
		if(step==1)
			System.out.println("Step Number");
		else 
			System.out.println("Not a Step");
		sc.close();
	}
		

}
