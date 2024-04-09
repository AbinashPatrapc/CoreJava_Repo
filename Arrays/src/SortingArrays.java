
public class SortingArrays {

	int a[] = { 0, 5, -1, 0, 33, 0, 0 }; // Question
	int b[] = { -1, 5, 33, 0, 0, 0, 0 }; // Answer

	public static void main(String[] args) {
		int temp = 0;
		int arr[] = { 0, 5, -1, 0, 33, 0, 0 };
		int l = 7;
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < l; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
