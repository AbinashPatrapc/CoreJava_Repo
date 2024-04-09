
public class OccuranceOfElement {

	public static void main(String[] args) {
		int arr[] = { 2, 2, 2, 5, 5, 9, 9, 9, 9, 9, 4, 1 };
		int max = arr[0];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int c = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					c = c + 1;// count
					arr[j] = max + 1;

				}
			}

			if (arr[i] != max + 1) {

				count = 0;
				for (int i1 = 1; i1 <= c; i1++) {
					if (c % i1 == 0) {
						count++;
					}

				}
				if (count == 2)
					System.out.println("final -->" + arr[i] + " --> " + c);

			}
		}

	}

}//
