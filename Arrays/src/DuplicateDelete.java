
public class DuplicateDelete {

	public static void main(String[] args) {
		int[] arr = { 11, 19, 15, 11, 12, 23, 19, 23, 23, 23, 19, 25, 19, 23 };
		int l = arr.length;

		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (arr[i] == arr[j]) {
					for (int k = j; k < l - 1; k++) {
						arr[k] = arr[k + 1];
					}
					l--;
					j--;
				}
			}
		}

		for (int i = 0; i < l; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
