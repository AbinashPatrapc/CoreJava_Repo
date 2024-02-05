import java.util.Scanner;

public class FindSecondElement {

	public static void main(String[] args) {
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[] {2,4,1,6,9};

		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;	
				}
				
			}
		}
		System.out.print("Enter element you want to find(1-5):");
		int ele=sc.nextInt();
		System.out.println(arr[ele-1]);


		
	}

}
