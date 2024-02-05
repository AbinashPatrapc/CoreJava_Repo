
public class DuplicateFind {

	public static void main(String[] args) {
		int[] arr= {2,3,4,1,6,8,3,9,1,2,6,8,9};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]+" ");
				}
			}
			
		}
	}

}
