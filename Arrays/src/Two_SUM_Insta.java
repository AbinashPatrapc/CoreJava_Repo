import java.util.HashMap;
import java.util.Map;

public class Two_SUM_Insta {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 4, 1, 3 };
		twosum2(arr, 6);

	}

	public static void twosum(int arr[], int target) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(i + " " + j);
				}
			}
		}
	}
	
	
	public static void twosum2(int arr[],int  target) {
		Map<Integer,Integer> map=new HashMap();
		
		for(int i=0;i<arr.length;i++) {
			int comp=target-arr[i];
		if(map.containsKey(comp)) {
			System.out.println(i+" "+comp);
		}
			
			map.put(arr[i], i);
		}
	}

}
