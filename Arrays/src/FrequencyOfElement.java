import java.util.Scanner;

public class FrequencyOfElement {

	public static void main(String[] args) {
		int count;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10]; // {20,23,25,28,23,11,25,20,28,20};
		int[] arr1 = new int[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter "+(i+1)+" Element:");
			arr[i] = sc.nextInt();
			arr1[i] = -1;
		}

		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr1[j] = 0;
				}
			}
			if (arr1[i] != 0)
				arr1[i] = count;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr1[i] != 0)
				System.out.println(arr[i] + "  " + arr1[i]);
		}
	}

}
