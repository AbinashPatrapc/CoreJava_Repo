import java.util.HashSet;
import java.util.Set;

public class CommonElementIn2Array {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 1, 4 };
		int[] arr2 = { 1, 1, 2, 7 };

		System.out.print("Common Elements: ");
		findCommonElements(arr1, arr2);
	}

	private static void findCommonElements(int[] arr1, int[] arr2) {
		Set<Integer> list = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					list.add(arr1[i]);
				}
			}
		}
		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}
}
