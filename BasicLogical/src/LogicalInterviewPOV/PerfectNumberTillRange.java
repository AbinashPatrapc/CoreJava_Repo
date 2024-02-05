package LogicalInterviewPOV;

import java.util.Scanner;

public class PerfectNumberTillRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a range to find perfect number:");
		int range=sc.nextInt();int count=1,sum=0;
		for(int num=1;num<=range;num++) {
			count=1;sum=0;
			while(count<num) {
				if(num%count==0)
					sum=sum+count;
				count++;
			}
			if(sum==num)
				System.out.println(num+" is a perfect number");
			
		}

	}

}
