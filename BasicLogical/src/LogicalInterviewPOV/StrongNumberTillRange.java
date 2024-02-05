package LogicalInterviewPOV;

import java.util.Scanner;

public class StrongNumberTillRange {

	public static void main(String[] args) {
		int num, temp, count, sum = 0, rem, fact;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			temp = i;sum=0;
			while (i != 0) {
				rem = i % 10;
				count = 1;
				fact = 1;
				while (count <= rem) {
					fact = fact * count;
					count++;
				}
				sum = sum + fact;
				i = i / 10;
			}
			if (sum == temp)
				System.out.println(temp+" "+sum+ " is a Strong Number");
			else
				System.out.println(temp+" "+sum+ " is not a Strong Number");
		}
		sc.close();
	}

}
