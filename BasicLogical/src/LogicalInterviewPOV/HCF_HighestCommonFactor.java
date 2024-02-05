package LogicalInterviewPOV;

import java.util.Scanner;

public class HCF_HighestCommonFactor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);int hcf = 0;
		System.out.print("Enter First Number:");
		int n1=sc.nextInt();
		System.out.print("Enter Second Number:");
		int n2=sc.nextInt();
		for(int i=1;i<=n1||i<=n2;i++) {
			if(n1%i==0 && n2%i==0) {
				hcf=i;
			}
		}
		System.out.println("HCF of "+n1+" and "+n2+" is "+hcf);
	}
  
}
